package org.tiaa.sma.registrationservice.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.tiaa.sma.registrationservice.dto.common.APIResponse;
import org.tiaa.sma.registrationservice.entity.Advisor;
import org.tiaa.sma.registrationservice.entity.EmailNotification;
import org.tiaa.sma.registrationservice.enums.ResponseStatusEnum;
import org.tiaa.sma.registrationservice.exception.InvalidDataException;
import org.tiaa.sma.registrationservice.repository.AdvisorRepository;
import org.tiaa.sma.registrationservice.repository.EmailNotificationRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class AdvisorServiceImpl implements AdvisorService {

    private final AdvisorRepository advisorRepository;
    private final EmailNotificationRepository emailNotificationRepository;

    @Override
    public Mono<APIResponse> registerAdvisor(Advisor advisor) {
        return advisorRepository.findByEmailId(advisor.getEmailId())
                .flatMap(existingAccount -> Mono.error(new InvalidDataException("Email already exists")))
                .switchIfEmpty(
                        advisorRepository.save(advisor)
                                .flatMap(savedAdvisor -> {
                                    // Insert email notification record into the database
                                    EmailNotification emailNotification1 = EmailNotification.builder()
                                            .advisorId(savedAdvisor.getId().longValue())
                                            .emailType("ADVISOR_REGISTER_SUCCESSFULLY")
                                            .status("PENDING")
                                            .build();
                                    EmailNotification emailNotification2 = EmailNotification.builder()
                                            .advisorId(savedAdvisor.getId().longValue())
                                            .emailType("ADVISOR_REGISTER_DETAIL_TO_CS")
                                            .status("PENDING")
                                            .build();
                                    return emailNotificationRepository.saveAll(Flux.just(emailNotification1, emailNotification2))
                                            .then(Mono.just(savedAdvisor));
                                })
                )
                .map(result -> {
                    APIResponse response = new APIResponse();
                    response.setResponseStatus(ResponseStatusEnum.SUCCESS);
                    response.setMessage("Advisor Saved Successfully");
                    return response;
                })
                .onErrorResume(e -> {
                    APIResponse errorResponse = new APIResponse();
                    errorResponse.setResponseStatus(ResponseStatusEnum.FAILED);
                    errorResponse.setMessage(e.getMessage());
                    return Mono.just(errorResponse);
                });
    }

    @Override
    public Mono<String> sayHello() {
        Mono<Long> adCount = advisorRepository.count();
        Mono<Long> emailCount = emailNotificationRepository.count();
        return Mono.when(adCount,emailCount).
                then(Mono.just("hello from registration service"));
    }

}

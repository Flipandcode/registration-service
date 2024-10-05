package org.tiaa.sma.registrationservice.service;

import org.tiaa.sma.registrationservice.dto.common.APIResponse;
import org.tiaa.sma.registrationservice.entity.Advisor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;



public interface AdvisorService {
    Mono<APIResponse> registerAdvisor(Advisor advisor);

    Mono<String> sayHello();
}

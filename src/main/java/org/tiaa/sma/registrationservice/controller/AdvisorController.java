package org.tiaa.sma.registrationservice.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.tiaa.sma.registrationservice.dto.AdvisorDto;
import org.tiaa.sma.registrationservice.dto.common.APIResponse;
import org.tiaa.sma.registrationservice.entity.Advisor;
import org.tiaa.sma.registrationservice.enums.AdvisorStatusEnum;
import org.tiaa.sma.registrationservice.service.AdvisorService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/register")
@RequiredArgsConstructor
@Slf4j
public class AdvisorController {

    private final AdvisorService advisorService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<APIResponse> addAdvisor(@RequestBody AdvisorDto advisorDto) {
        advisorDto.setStatus(AdvisorStatusEnum.PENDING_FOR_REVIEW);
        advisorDto.setDisplayName(advisorDto.getFirstName()+", "+advisorDto.getLastName());
        Advisor advisor = new Advisor();
        advisor.setFirstName(advisorDto.getFirstName());
        advisor.setLastName(advisorDto.getLastName());
        advisor.setDisplayName(advisorDto.getDisplayName());
        advisor.setEmailId(advisorDto.getEmailId());
        advisor.setPhoneNumber(advisorDto.getPhoneNumber());
        advisor.setFirmName(advisorDto.getFirmName());
        advisor.setAdvisorRegion(advisorDto.getAdvisorRegion());
        advisor.setBusinessJustification(advisorDto.getBusinessJustification());
        advisor.setCrd(advisorDto.getCrd());
        advisor.setStatus(advisorDto.getStatus().getStatus());
        return advisorService.registerAdvisor(advisor);
    }

   @GetMapping(value = "/hello")
    public Mono<String> sayHello(){
        log.info("hello world invoked");
        return advisorService.sayHello();
   }


}

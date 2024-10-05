//package org.tiaa.sma.registrationservice.template;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//import org.thymeleaf.context.Context;
//import org.thymeleaf.spring6.SpringTemplateEngine;
//import org.tiaa.sma.registrationservice.dto.common.notification.AdvisorNotificationRequest;
//import org.tiaa.sma.registrationservice.model.AdvisorEmailDetails;
//
//@Component("ADVISOR_REGISTER_DETAIL_TO_CS")
//@RequiredArgsConstructor
//public class AdvisorRegisterDetailToCSTemplate implements AdvisorEmailTemplate{
//
//    private final SpringTemplateEngine templateEngine;
//    @Value("${notification.advisorRegisterDetailToCS.template}")
//    private String advisorRegisterDetailToCSTemplate;
//
//
//    @Override
//    public String prepareTemplate(AdvisorNotificationRequest request) {
//        Context context = new Context();
//        AdvisorEmailDetails advisorEmailDetails = new AdvisorEmailDetails();
//        advisorEmailDetails.setFirstName(request.getAdvisorDto().getFirstName());
//        advisorEmailDetails.setLastName(request.getAdvisorDto().getLastName());
//        advisorEmailDetails.setDisplayName(request.getAdvisorDto().getDisplayName());
//        advisorEmailDetails.setEmailId(request.getAdvisorDto().getEmailId());
//        advisorEmailDetails.setFirmName(request.getAdvisorDto().getFirmName());
//        advisorEmailDetails.setPhoneNumber(request.getAdvisorDto().getPhoneNumber());
//        advisorEmailDetails.setCrd(request.getAdvisorDto().getCrd());
//        advisorEmailDetails.setBusinessJustification(request.getAdvisorDto().getBusinessJustification());
//        advisorEmailDetails.setAdvisorRegion(request.getAdvisorDto().getAdvisorRegion());
//        context.setVariable("advisorEmialDetails",advisorEmailDetails);
//        return templateEngine.process(advisorRegisterDetailToCSTemplate,context);
//    }
//}

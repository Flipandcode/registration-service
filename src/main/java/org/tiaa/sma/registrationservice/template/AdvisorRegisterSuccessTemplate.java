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
//@Component("ADVISOR_REGISTER_SUCCESSFULLY")
//@RequiredArgsConstructor
//public class AdvisorRegisterSuccessTemplate implements AdvisorEmailTemplate{
//
//    private final SpringTemplateEngine templateEngine;
//    @Value("${notification.advisorRegisterSuccessfully.template}")
//    private String advisorRegisterSuccessfullyTemplate;
//    @Value("${advisor.hostUrl}")
//    private String advisorPortalLink;
//
//
//    @Override
//    public String prepareTemplate(AdvisorNotificationRequest request) {
//        Context context = new Context();
//        AdvisorEmailDetails advisorEmailDetails = new AdvisorEmailDetails();
//        advisorEmailDetails.setAdvisorName(request.getAdvisorDto().getFirstName()+" "+request.getAdvisorDto().getLastName());
//        advisorEmailDetails.setAdvisorPortalLink(advisorPortalLink);
//        context.setVariable("advisorEmailDetails",advisorEmailDetails);
//        return templateEngine.process(advisorRegisterSuccessfullyTemplate,context);
//    }
//}

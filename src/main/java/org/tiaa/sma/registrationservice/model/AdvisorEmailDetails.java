package org.tiaa.sma.registrationservice.model;

import lombok.Data;

@Data
public class AdvisorEmailDetails {
    private String advisorName;
    private String advisorPortalLink;

    private String firstName;
    private String lastName;
    private String emailId;
    private String phoneNumber;
    private String displayName;
    private String firmName;
    private String advisorRegion;
    private String businessJustification;
    private String crd;

    private String subject;
    private String content;

}

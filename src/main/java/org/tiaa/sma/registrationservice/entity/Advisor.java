package org.tiaa.sma.registrationservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.io.Serializable;
import java.math.BigInteger;

@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Advisor extends BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private BigInteger id;

    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "DISPLAY_NAME")
    private String displayName;
    @Column(name = "EMAIL_ID")
    private String emailId;
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    @Column(name = "FIRM_NAME")
    private String firmName;
    @Column(name = "ADVISOR_REGION")
    private String advisorRegion;
    @Column(name = "BUSINESS_JUSTIFICATION")
    private String businessJustification;
    @Column(name = "CRD")
    private String crd;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "INVITATION_URL")
    private String invitationUrl;
}

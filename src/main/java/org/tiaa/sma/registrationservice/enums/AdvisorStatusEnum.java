package org.tiaa.sma.registrationservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AdvisorStatusEnum {
    PENDING_FOR_REVIEW("PENDING FOR REVIEW"),
    INVITATION_SENT("INVITATION SENT"),
    REJECTED("REJECTED");

    private String status;
}

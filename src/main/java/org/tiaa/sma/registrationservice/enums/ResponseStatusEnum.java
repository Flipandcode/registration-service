package org.tiaa.sma.registrationservice.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseStatusEnum {
    FAILED("Failed"),
    SUCCESS("Success"),
    PARTIAL_SUCCESS("Partial Success");

    private String status;
}

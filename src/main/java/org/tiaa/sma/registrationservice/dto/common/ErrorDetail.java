package org.tiaa.sma.registrationservice.dto.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class ErrorDetail {
    private String field;
    private String fieldError;
}

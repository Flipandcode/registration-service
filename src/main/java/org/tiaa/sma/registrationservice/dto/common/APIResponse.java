package org.tiaa.sma.registrationservice.dto.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tiaa.sma.registrationservice.dto.common.ErrorDetail;
import org.tiaa.sma.registrationservice.enums.ResponseStatusEnum;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class APIResponse implements Serializable {
    @Serial
    private static final long serialVersionUID = 4349490510193444166L;

    private String message;
    private ResponseStatusEnum responseStatus;
    private String errorCode;
    private String errorDescription;
    private List<ErrorDetail> errorDetails;
}

package org.tiaa.sma.registrationservice.dto.common.notification;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.tiaa.sma.registrationservice.dto.AdvisorDto;

@Data
@AllArgsConstructor
@Builder
public class AdvisorNotificationRequest {
    private AdvisorDto advisorDto;
    private AdvisorNotificationType advisorNotificationType;
}

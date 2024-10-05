package org.tiaa.sma.registrationservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table("email_notifications")
public class EmailNotification {

    @Id
    private Long id;
    private Long advisorId;
    private String emailType;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}

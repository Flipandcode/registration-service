package org.tiaa.sma.registrationservice.dto;
//
//import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.tiaa.sma.registrationservice.enums.AdvisorStatusEnum;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdvisorDto {
//    @NotNull
//    @NotBlank
    private String firstName;
//    @NotNull
//    @NotBlank
    private String lastName;
//    @Email
//    @NotNull
//    @NotBlank
    private String emailId;
    private String phoneNumber;
    private String displayName;
//    @NotNull
//    @NotBlank
    private String firmName;
//    @NotNull
//    @NotBlank
    private String advisorRegion;
//    @NotNull
//    @NotBlank
    private String businessJustification;
    private String crd;
    private AdvisorStatusEnum status;
    private String invitationUrl;
}

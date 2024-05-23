package com.medical.MedicalAppointmentBE.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDTO {
    private Long userId;
    private String name;
    private String phoneNumber;
    private String emailId;
    private String password;
}

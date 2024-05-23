package com.medical.MedicalAppointmentBE.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDTO {
    private Long doctorId;
    private String name;
    private String department;
    private String profileURL;
    private String description;
}

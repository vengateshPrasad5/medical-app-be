package com.medical.MedicalAppointmentBE.Dto;

import com.medical.MedicalAppointmentBE.Entity.Doctor;
import com.medical.MedicalAppointmentBE.Entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVisitDTO {
    private Long visitId;
    private String reasonForVisit;
    private String visitDate;
    private String description;
    private User user;
    private Doctor doctor;
}

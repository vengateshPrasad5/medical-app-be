package com.medical.MedicalAppointmentBE.Dto;

import com.medical.MedicalAppointmentBE.Entity.User;
import com.medical.MedicalAppointmentBE.Entity.UserVisit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDTO {
    private Long bookingId;
    private String appointmentDate;
    private String appointmentTime;
    private User user;
    private UserVisit userVisit;
}

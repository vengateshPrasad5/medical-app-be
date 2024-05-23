package com.medical.MedicalAppointmentBE.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private Long bookingId;
    @Column(name = "appointment_date")
    private String appointmentDate;
    @Column(name = "appointment_time")
    private String appointmentTime;

    @ManyToOne
    @Column(name = "user_id")
    private User user;

    @OneToOne
    @Column(name = "user_visit_id")
    private UserVisit userVisit;
}

package com.medical.MedicalAppointmentBE.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;
    private String name;
    @Column(name = "ph_nos")
    private String phoneNumber;
    @Column(name = "email_id")
    private String emailId;
    @Column(name = "password")
    private String password;

}

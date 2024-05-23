package com.medical.MedicalAppointmentBE.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserVisit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "visit_id")
    private Long visitId;
    @Column(name = "reason_for_visit")
    private String reasonForVisit;
    @Column(name = "visit_date")
    private String visitDate;
    private String description;

    @ManyToOne
    @JsonBackReference
    @Column(name = "user_id")
    private  User user;

    @ManyToOne
    @Column(name = "doctor_id")
    private Doctor doctor;

//    @OneToMany(mappedBy = "userVisit")
//    @Column(name = "user_visit_id")
//    @JsonBackReference
//    private List<Prescription> prescriptions;
}

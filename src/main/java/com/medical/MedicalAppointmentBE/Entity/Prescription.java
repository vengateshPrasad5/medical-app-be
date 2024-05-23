package com.medical.MedicalAppointmentBE.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prescription {

    @Id
    @Column(name = "prescription_id")
    private Long prescriptionId;
    private String tabletName;
    private String dose;
    private String frequency;
    private String days;

//    @ManyToOne
//    @Column(name = "user_visit_id")
//    @JsonManagedReference
//    private UserVisit userVisit;
//
//    @ManyToOne
//    @Column(name = "user_id")
//    @JsonBackReference
//    private User user;
}

package com.dentalSoft.DentalSoft.dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InterventionMedecin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long idIntervention;
    String noteMedecin;
    Double prixPatient;
    Long dent;
    @ManyToOne
    Acte acte;
    @ManyToOne
    @JoinColumn(name = "consultation_id")
    Consultation consultation;

}

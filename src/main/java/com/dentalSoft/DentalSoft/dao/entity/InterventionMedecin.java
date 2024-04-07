package com.dentalSoft.DentalSoft.dao.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InterventionMedecin {
    String noteMedecin;
    Double prixPatient;
    Long dent;
    Long idIntervention;
    Acte acte;
    Consultation consultation;

}

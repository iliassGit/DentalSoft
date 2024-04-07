package com.dentalSoft.DentalSoft.dao.entity;

import com.dentalSoft.DentalSoft.dao.entity.Enums.StatutPaiment;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DossierMedicale {
    List<Consultation> consultations;
    LocalDate dateCreation;
    Patient patient;
    SituationFinanciere SituationFinanciere;
    Dentiste medecinTaitant;
    String numeroDossier;
    StatutPaiment statutPaiment;


}

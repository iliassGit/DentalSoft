package com.dentalSoft.DentalSoft.dao.entity;

import com.dentalSoft.DentalSoft.dao.entity.Enums.TypePaiment;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Facture {
    @Id
    Long idFacture;
    Double montantRestant;
    SituationFinanciere situationFinanciere;
    Double montantPaye;
    LocalDate dateFacturation;
    Double montantTotal;
    Consultation consultation;
    TypePaiment typePaiment;

}

package com.dentalSoft.DentalSoft.dao.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SituationFinanciere {
    @Id
    Long idSituationFinanciere;
    DossierMedicale dossierMedicale;
    LocalDate dateCreation;
    Double montantGlobaleRestant;
    Double montantGlobalePaye;
    List<Facture> facture;
}

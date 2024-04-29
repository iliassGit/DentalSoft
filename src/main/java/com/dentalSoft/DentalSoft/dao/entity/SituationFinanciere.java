package com.dentalSoft.DentalSoft.dao.entity;


import jakarta.persistence.*;
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
    @OneToOne(mappedBy = "situationFinanciere")
    DossierMedicale dossierMedicale;
    LocalDate dateCreation;
    Double montantGlobaleRestant;
    Double montantGlobalePaye;
    @OneToMany(mappedBy = "situationFinanciere", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    List<Facture> facture;
}

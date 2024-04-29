package com.dentalSoft.DentalSoft.dao.entity;

import com.dentalSoft.DentalSoft.dao.entity.enums.TypePaiment;
import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long idFacture;
    Double montantRestant;
    @ManyToOne
    @JoinColumn(name = "situation_financiere_id")
    SituationFinanciere situationFinanciere;
    Double montantPaye;
    LocalDate dateFacturation;
    Double montantTotal;
    @ManyToOne
    @JoinColumn(name = "consultation_id")
    Consultation consultation;
    @Enumerated(EnumType.STRING)
    TypePaiment typePaiment;

}

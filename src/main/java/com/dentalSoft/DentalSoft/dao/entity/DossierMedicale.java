package com.dentalSoft.DentalSoft.dao.entity;

import com.dentalSoft.DentalSoft.dao.entity.enums.StatutPaiment;
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
public class DossierMedicale {
    @Id
    String numeroDossier;
    @OneToMany(mappedBy = "dossierMedicale", cascade = CascadeType.ALL)
    List<Consultation> consultations;
    @Column(name = "date_creation")
    LocalDate dateCreation;
    @OneToOne
    @JoinColumn(name = "patient_id")
    Patient patient;
    @ManyToOne
    @JoinColumn(name = "situation_financiere_id")
    SituationFinanciere situationFinanciere;
    @ManyToOne
    @JoinColumn(name = "medecin_traitant_id")
    Dentiste medecinTaitant;
    @Enumerated(EnumType.STRING)
    @Column(name = "statutPaiment")
    StatutPaiment statutPaiment;


}

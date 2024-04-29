package com.dentalSoft.DentalSoft.dao.entity;

import com.dentalSoft.DentalSoft.dao.entity.enums.TypeConsultation;
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
public class Consultation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idConsultation;

    @OneToMany(mappedBy = "consultation")
    private List<InterventionMedecin> interventions;

    @ManyToOne
    private DossierMedicale dossierMedicale;

    @Column(nullable = false)
    private LocalDate dateConsultation;

    @Enumerated(EnumType.STRING)
    private TypeConsultation typeConsultation;

    @OneToMany(mappedBy = "consultation")
    private List <Facture> factures;

}

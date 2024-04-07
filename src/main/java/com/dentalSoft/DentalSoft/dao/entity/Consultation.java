package com.dentalSoft.DentalSoft.dao.entity;

import com.dentalSoft.DentalSoft.dao.entity.Enums.TypeConsultation;
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
public class Consultation {
    @Id
    Long idConsultation;
    List<InterventionMedecin> intervention;
    DossierMedicale dossierMedicale;
    LocalDate dateConsultation;
    TypeConsultation typeConsultation;
    List<Facture> factures;

}

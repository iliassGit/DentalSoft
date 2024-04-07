package com.dentalSoft.DentalSoft.dao.entity;

import com.dentalSoft.DentalSoft.dao.entity.Enums.GroupeSanguin;
import com.dentalSoft.DentalSoft.dao.entity.Enums.Mutuelle;
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
public class Patient extends Personne{
    LocalDate dateNaissance;
    Mutuelle mutuelle;
    GroupeSanguin groupeSanguin;
    List<AntecedentsMedicaux> antecedentsMedicaux;
    DossierMedicale dossierMedicale;
    String profession;
}

package com.dentalSoft.DentalSoft.dao.entity;

import com.dentalSoft.DentalSoft.dao.entity.Enums.CategorieAntecedentMedicale;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AntecedentsMedicaux {
    Long idAntecedentsMedicaux;
    List<Patient> patients;
    String libelle;
    CategorieAntecedentMedicale categorie;

}

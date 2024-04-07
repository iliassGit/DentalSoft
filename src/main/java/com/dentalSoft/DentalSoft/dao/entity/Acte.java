package com.dentalSoft.DentalSoft.dao.entity;

import com.dentalSoft.DentalSoft.dao.entity.Enums.CategorieActe;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Acte {
    @Id
    Long idActe;
    List<InterventionMedecin> interventions;
    Double prixDeBase;
    CategorieActe categorie;

    String libelle;

}

package com.dentalSoft.DentalSoft.dao.entity;

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
public class Caisse {
    @Id
    Long idCaisse;
    List<SituationFinanciere> situationsFinancieres;
    Double recetteDuJour;
    Double recetteDuMois;
    Double recetteDeAnnee;

}

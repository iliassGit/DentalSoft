package com.dentalSoft.DentalSoft.dao.entity;

import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long idCaisse;
    @OneToMany
    List<SituationFinanciere> situationsFinancieres;
    Double recetteDuJour;
    Double recetteDuMois;
    Double recetteDeAnnee;

}

package com.dentalSoft.DentalSoft.dao.entity;

import com.dentalSoft.DentalSoft.dao.entity.Enums.*;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Map;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Dentiste extends Utilisateur{
    LocalDate dateRetourConge;
    Double salaireDeBase;
    Specialite specialite;
    Map<DayOfTheWeek, Disponibilite> disponibilite;
    Assurance assuarance;
    StatusEmploye statusActuel;
}

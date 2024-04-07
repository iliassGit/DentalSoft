package com.dentalSoft.DentalSoft.dao.entity;

import com.dentalSoft.DentalSoft.dao.entity.Enums.Assurance;
import com.dentalSoft.DentalSoft.dao.entity.Enums.StatusEmploye;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Secretaire extends Utilisateur{
    Double salaireDeBase;
    LocalDate dateRetourConge;
    Assurance assurance;
    StatusEmploye statusActuel;
    Double prime;
}

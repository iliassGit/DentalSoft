package com.dentalSoft.DentalSoft.dao.entity;

import com.dentalSoft.DentalSoft.dao.entity.enums.Assurance;
import com.dentalSoft.DentalSoft.dao.entity.enums.StatusEmploye;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
    @Enumerated(EnumType.STRING)
    Assurance assurance;
    @Enumerated(EnumType.STRING)
    StatusEmploye statusActuel;
    Double prime;
}

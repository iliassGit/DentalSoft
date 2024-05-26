package com.dentalSoft.DentalSoft.dao.entity;

import com.dentalSoft.DentalSoft.dao.entity.enums.Assurance;
import com.dentalSoft.DentalSoft.dao.entity.enums.StatusEmploye;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Secretaire extends Utilisateur{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String nom;
    String prenom;
    String Telephone;
    String adresse;
    String email;
    String cin;
    Double salaireDeBase;
    LocalDate dateRetourConge;
    @Enumerated(EnumType.STRING)
    Assurance assurance;
    @Enumerated(EnumType.STRING)
    StatusEmploye statusActuel;
    Double prime;
}

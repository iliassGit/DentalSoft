package com.dentalSoft.DentalSoft.dao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Personne {
    @Id
    int id;
    String nom;
    String prenom;
    String Telephone;
    String adresse;
    String email;
    String cin;
}

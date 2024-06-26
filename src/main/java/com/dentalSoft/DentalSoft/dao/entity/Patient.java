package com.dentalSoft.DentalSoft.dao.entity;

import com.dentalSoft.DentalSoft.dao.entity.enums.GroupeSanguin;
import com.dentalSoft.DentalSoft.dao.entity.enums.Mutuelle;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Patient{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String nom;
    String prenom;
    String Telephone;
    int age;
    String adresse;
    String sexe;
    String email;
    String cin;
    LocalDate dateNaissance;
    @Enumerated(EnumType.STRING)
    Mutuelle mutuelle;
    @Enumerated(EnumType.STRING)
    GroupeSanguin groupeSanguin;
    @ManyToMany
    @Column(name = "antecedents_medicaux")
    List<AntecedentsMedicaux> antecedentsMedicaux;
    @OneToOne(mappedBy = "patient", cascade = CascadeType.ALL)
    @JoinColumn(name = "dossier_medical_id", referencedColumnName = "numeroDossier")
    DossierMedicale dossierMedicale;
    String profession;

}

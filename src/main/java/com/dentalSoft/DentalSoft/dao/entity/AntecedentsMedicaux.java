package com.dentalSoft.DentalSoft.dao.entity;

import com.dentalSoft.DentalSoft.dao.entity.enums.CategorieAntecedentMedicale;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AntecedentsMedicaux {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAntecedentsMedicaux;
    @Column(name = "libelle")
    private String libelle;
    @Enumerated(EnumType.STRING)
    @Column(name = "categorie")
    private CategorieAntecedentMedicale categorie;



}

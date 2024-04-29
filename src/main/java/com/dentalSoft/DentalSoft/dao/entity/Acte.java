package com.dentalSoft.DentalSoft.dao.entity;

import com.dentalSoft.DentalSoft.dao.entity.enums.CategorieActe;
import jakarta.persistence.*;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idActe;
    @OneToMany(mappedBy = "acte", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<InterventionMedecin> interventions;
    @Column(nullable = false)
    private Double prixDeBase;
    @Enumerated(EnumType.STRING)
    private CategorieActe categorie;
    private String libelle;

}

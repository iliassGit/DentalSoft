package com.dentalSoft.DentalSoft.dao.entity;

import com.dentalSoft.DentalSoft.dao.entity.enums.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Map;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Dentiste extends Utilisateur{

    private LocalDate dateRetourConge;
    private Double salaireDeBase;
    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    @ElementCollection
    @CollectionTable(name = "dentiste_disponibilites", joinColumns = @JoinColumn(name = "dentiste_id"))
    @MapKeyColumn(name = "day_of_week")
    @MapKeyEnumerated(EnumType.STRING)
    Map<DayOfTheWeek, Disponibilite> disponibilite;
    @Enumerated(EnumType.STRING)
    Assurance assuarance;
    @Enumerated(EnumType.STRING)
    StatusEmploye statusActuel;
}

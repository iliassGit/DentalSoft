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
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idRole;

    @Column(nullable = false, unique = true)
    private String role;

    @ElementCollection
    private List<String> privileges;

}

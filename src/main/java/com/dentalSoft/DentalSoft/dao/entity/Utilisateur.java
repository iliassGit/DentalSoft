package com.dentalSoft.DentalSoft.dao.entity;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Utilisateur extends Personne{
    String password;
    String username;
    List<Role> roles;
}

package com.dentalSoft.DentalSoft.services;

import com.dentalSoft.DentalSoft.dao.entity.Utilisateur;
import com.dentalSoft.DentalSoft.dao.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurService {
    @Autowired
    UtilisateurRepository utilisateurRepository;

    public Utilisateur findByUsername(String username){
        return utilisateurRepository.findByUsername(username);
    }

}

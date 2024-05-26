package com.dentalSoft.DentalSoft.services;

import com.dentalSoft.DentalSoft.dao.entity.Dentiste;
import com.dentalSoft.DentalSoft.dao.repository.DentisteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DentisteService {
    @Autowired
    private DentisteRepository dentisteRepository;

    public Dentiste getDentisteById(Long id) {
        Optional<Dentiste> dentiste = dentisteRepository.findById(id);
        return dentiste.orElse(null); // Return the person or null if not found
    }
    public void saveDentiste(Dentiste dentiste) {
        dentisteRepository.save(dentiste);
    }
}

package com.dentalSoft.DentalSoft.services;

import com.dentalSoft.DentalSoft.dao.entity.Facture;
import com.dentalSoft.DentalSoft.dao.entity.SituationFinanciere;
import com.dentalSoft.DentalSoft.dao.repository.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FactureService {
    @Autowired
    FactureRepository factureRepository;

    public List<Facture> findBySituationFinanciere(SituationFinanciere situationFinanciere){
        return factureRepository.findBySituationFinanciere(situationFinanciere);
    }

    public void save(Facture facture) {
        factureRepository.save(facture);
    }

    public void deleteById(Long id) {
        factureRepository.deleteById(id);
    }

    public List<Facture> findAll() {
        return (List<Facture>) factureRepository.findAll();
    }
}

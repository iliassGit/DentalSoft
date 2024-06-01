package com.dentalSoft.DentalSoft.services;

import com.dentalSoft.DentalSoft.dao.entity.Acte;
import com.dentalSoft.DentalSoft.dao.entity.Consultation;
import com.dentalSoft.DentalSoft.dao.entity.InterventionMedecin;
import com.dentalSoft.DentalSoft.dao.repository.InterventionMedecinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InterventionMedecinService {
    @Autowired
    InterventionMedecinRepository interventionMedecinRepository;
    public List<InterventionMedecin> findByConsultation(Consultation consultation){
        return interventionMedecinRepository.findByConsultation(consultation);
    }
    public InterventionMedecin findLastId() {
        List<InterventionMedecin> its = (List<InterventionMedecin>) interventionMedecinRepository.findAll();
        return  its.get(its.size() - 1);
    }

    public void save(InterventionMedecin it) {
        interventionMedecinRepository.save(it);
    }
}

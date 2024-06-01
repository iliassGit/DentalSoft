package com.dentalSoft.DentalSoft.services;

import com.dentalSoft.DentalSoft.dao.entity.Consultation;
import com.dentalSoft.DentalSoft.dao.entity.DossierMedicale;
import com.dentalSoft.DentalSoft.dao.entity.InterventionMedecin;
import com.dentalSoft.DentalSoft.dao.repository.ConsultationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultationService {
    @Autowired
    ConsultationRepository consultationRepository;



    public List<Consultation> findConsultationByDossierMedicale(DossierMedicale dm){
        return consultationRepository.findByDossierMedicale(dm);
    }

    public Consultation findLastId() {
        List<Consultation> consultations = (List<Consultation>) consultationRepository.findAll();
        return  consultations.get(consultations.size() - 1);
    }

    public void save(Consultation consultation) {
        consultationRepository.save(consultation);
    }

    public Consultation findByIdConsultation(Long consultationId) {
        return consultationRepository.findByIdConsultation(consultationId);
    }

    public List<Consultation> findAll() {
        return (List<Consultation>) consultationRepository.findAll();
    }
}

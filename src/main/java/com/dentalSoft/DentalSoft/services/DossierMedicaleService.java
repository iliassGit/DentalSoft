package com.dentalSoft.DentalSoft.services;

import com.dentalSoft.DentalSoft.dao.entity.Consultation;
import com.dentalSoft.DentalSoft.dao.entity.DossierMedicale;
import com.dentalSoft.DentalSoft.dao.repository.DossierMedicaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DossierMedicaleService {
    @Autowired
    DossierMedicaleRepository dossierMedicaleRepository;

    public DossierMedicale findDossierMedicaleByPatientId(Long id){

        return dossierMedicaleRepository.findDossierMedicaleByPatientId(id);
    }

    public DossierMedicale findByConsultations(Consultation c) {
        return dossierMedicaleRepository.findByConsultations(c);
    }


}

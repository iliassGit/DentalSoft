package com.dentalSoft.DentalSoft.services;

import com.dentalSoft.DentalSoft.dao.entity.DossierMedicale;
import com.dentalSoft.DentalSoft.dao.entity.SituationFinanciere;
import com.dentalSoft.DentalSoft.dao.repository.SituationFinanciereRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SituationFinanciereService {
    @Autowired
    SituationFinanciereRepository situationFinanciereRepository;

    public SituationFinanciere findByDossierMedicale(DossierMedicale dossierMedicale){
        return situationFinanciereRepository.findByDossierMedicale(dossierMedicale);
    }
}

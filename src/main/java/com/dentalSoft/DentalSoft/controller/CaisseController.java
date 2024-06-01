package com.dentalSoft.DentalSoft.controller;

import com.dentalSoft.DentalSoft.dao.entity.Consultation;
import com.dentalSoft.DentalSoft.dao.entity.DossierMedicale;
import com.dentalSoft.DentalSoft.dao.entity.Facture;
import com.dentalSoft.DentalSoft.dao.entity.Patient;
import com.dentalSoft.DentalSoft.services.ConsultationService;
import com.dentalSoft.DentalSoft.services.DossierMedicaleService;
import com.dentalSoft.DentalSoft.services.FactureService;
import com.dentalSoft.DentalSoft.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CaisseController {

    @Autowired
    FactureService factureService;
    @Autowired
    PatientService patientService;
    @Autowired
    ConsultationService consultationService;
    @Autowired
    DossierMedicaleService dossierMedicaleService;

    @GetMapping("/caisse")
    public String caisse(Model model){
        List<Facture> allFactures = factureService.findAll();
        List<Patient> patientPerFacture = new ArrayList<Patient>();
        for(Facture f : allFactures){
            Consultation c =consultationService.findByIdConsultation(f.getConsultation().getIdConsultation());
            DossierMedicale d = dossierMedicaleService.findByConsultations(c);
            patientPerFacture.add(patientService.findPatientById((long) d.getPatient().getId()));
        }
        model.addAttribute("allFactures", allFactures);
        model.addAttribute("allPatients", patientPerFacture);
        return "caisse";
    }
}

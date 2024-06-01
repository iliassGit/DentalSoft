package com.dentalSoft.DentalSoft.controller;

import com.dentalSoft.DentalSoft.dao.entity.*;
import com.dentalSoft.DentalSoft.dao.entity.enums.CategorieActe;
import com.dentalSoft.DentalSoft.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class PatientDetailsController {
    @Autowired
    PatientService patientService;
    @Autowired
    DossierMedicaleService dossierMedicaleService;
    @Autowired
    ConsultationService consultationService;
    @Autowired
    InterventionMedecinService interventionMedecinService;
    @Autowired
    ActeService acteService;

    @GetMapping("/patient_details/{id}")
    public String patientDetails(@PathVariable Long id, Model model){
        Patient patientSelected = patientService.findPatientById(id);
        model.addAttribute("patientSelected", patientSelected);
        DossierMedicale dossierMedicale = dossierMedicaleService.findDossierMedicaleByPatientId(id);
        List<Consultation> consultations = consultationService.findConsultationByDossierMedicale(dossierMedicale);
        List<InterventionMedecin> listInterventions = new ArrayList<InterventionMedecin>();
        for(Consultation cc : consultations){
            listInterventions.addAll(interventionMedecinService.findByConsultation(cc));
        }
        List<Acte> listActe = new ArrayList<Acte>();
        for(InterventionMedecin it : listInterventions){
            listActe.add(acteService.findById(it.getActe().getIdActe()));
        }
        model.addAttribute("listActe", listActe);
        model.addAttribute("listInterventions", listInterventions);
        model.addAttribute("consultation", consultations);
        return "patient_details";
    }

    @PostMapping("/addActe")
    public String ajouterActe(@RequestParam("patientId") Long id,
                              @RequestParam("acte") String acteName,
                              @RequestParam("prix_base") Double prixBase,
                              @RequestParam("date") String date,
                              @RequestParam("num_dent") String numDent,
                              @RequestParam("prix_patient") Double prixPatient){
        System.out.println("000000000000000000000000000000000000000000000");
        Acte acte = new Acte();
        //acte.setIdActe(acteService.findLastId().getIdActe() + 2);
        acte.setCategorie(CategorieActe.ORTHODONTIE);
        acte.setLibelle(acteName);
        acte.setPrixDeBase(prixBase);



        Consultation consultation = new Consultation();
        consultation.setDateConsultation(LocalDate.parse(date));
        //consultation.setIdConsultation(consultationService.findLastId().getIdConsultation());
        consultation.setDossierMedicale(dossierMedicaleService.findDossierMedicaleByPatientId(id));
        consultationService.save(consultation);


        InterventionMedecin it = new InterventionMedecin();
        //it.setIdIntervention(interventionMedecinService.findLastId().getIdIntervention()+2);
        it.setActe(acte);
        it.setDent(Long.valueOf(numDent));
        it.setPrixPatient(prixPatient);
        it.setConsultation(consultation);


        acteService.save(acte);
        interventionMedecinService.save(it);
        return "redirect:/patient_details/" + id;
    }
}

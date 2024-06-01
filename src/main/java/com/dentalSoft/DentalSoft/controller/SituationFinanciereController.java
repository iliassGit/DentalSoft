package com.dentalSoft.DentalSoft.controller;

import com.dentalSoft.DentalSoft.dao.entity.*;
import com.dentalSoft.DentalSoft.dao.entity.enums.TypePaiment;
import com.dentalSoft.DentalSoft.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
public class SituationFinanciereController {
    @Autowired
    PatientService patientService;
    @Autowired
    DossierMedicaleService dossierMedicaleService;
    @Autowired
    SituationFinanciereService situationFinanciereService;
    @Autowired
    FactureService factureService;
    @Autowired
    ConsultationService consultationService;
    @GetMapping("/Situation_financiere/{id}")
    public String situationFinanaciere(@PathVariable Long id, Model model){
        Patient patient = patientService.findPatientById(id);
        model.addAttribute("patient", patient);
        DossierMedicale dossierMedicale = dossierMedicaleService.findDossierMedicaleByPatientId(id);
        SituationFinanciere situationFinanciere = situationFinanciereService.findByDossierMedicale(dossierMedicale);
        List<Facture> factures = factureService.findBySituationFinanciere(situationFinanciere);
        model.addAttribute("factures", factures);
        model.addAttribute("situationFinanciere", situationFinanciere);
        return "situation_financiere";
    }

    @PostMapping("/addFacture")
    public String addFacture(@RequestParam("patientId") Long patientId,
                             @RequestParam("acte") Long acteId,
                             @RequestParam("date") String date,
                             @RequestParam("reste_a_payer") Double resteAPayer,
                             @RequestParam("etat") String etat,
                             @RequestParam("montant_paye") Double montantPaye,
                             @RequestParam("total") Double total,
                             Model model){
        Consultation consultation  = consultationService.findByIdConsultation(acteId);
        DossierMedicale dossierMedicale = dossierMedicaleService.findDossierMedicaleByPatientId(patientId);
        SituationFinanciere situationFinanciere = situationFinanciereService.findByDossierMedicale(dossierMedicale);

        Facture facture = new Facture();
        //facture.setIdFacture(factureService.findByLastId().getIdFacture()+1);
        facture.setConsultation(consultation);
        facture.setDateFacturation(LocalDate.parse(date));
        facture.setTypePaiment(TypePaiment.valueOf(etat.toUpperCase()));
        facture.setMontantRestant(resteAPayer);
        facture.setMontantPaye(montantPaye);
        facture.setMontantTotal(total);
        facture.setSituationFinanciere(situationFinanciere);



        factureService.save(facture);
        return "redirect:/Situation_financiere/"+patientId;
    }

    @GetMapping("/deleteFacture/{sId}/{id}")
    public String deletepatient(@PathVariable("sId") Long sId,@PathVariable("id") Long id, Model model){
        factureService.deleteById(id);
        return "redirect:/Situation_financiere/"+sId;
    }

}

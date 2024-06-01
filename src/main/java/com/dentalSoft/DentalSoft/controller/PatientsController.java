package com.dentalSoft.DentalSoft.controller;

import com.dentalSoft.DentalSoft.dao.entity.Dentiste;
import com.dentalSoft.DentalSoft.dao.entity.Patient;
import com.dentalSoft.DentalSoft.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PatientsController {
    @Autowired
    private PatientService patientService;
    @GetMapping("/patients")
    public String getAllPatients(Model model) {
        List<Patient> patients = (List<Patient>) patientService.getAllPatients();
        model.addAttribute("patients", patients);
        return "patients";
    }
    @PostMapping("/addPatient")
    public String addPatient(@ModelAttribute Patient patient, Model model){
        Patient patient1 = new Patient();
        Patient patientLastId = patientService.findLastId();
        patient1.setId(patientLastId.getId() + 2);
        patient1.setNom(patient.getNom());
        patient1.setAdresse(patient.getAdresse());
        patient1.setEmail(patient.getEmail());
        patient1.setTelephone(patient.getTelephone());
        patient1.setCin(patient.getCin());
        patient1.setDateNaissance(patient.getDateNaissance());
        patient1.setPrenom(patient.getPrenom());
        patient1.setSexe(patient.getSexe());
        patientService.savePatient(patient1);
        return  "redirect:/patients";
    }
    @GetMapping("/deletePatient/{id}")
    public String deletePatient(@PathVariable  Long id, Model model){
        patientService.deletePatientById(id);
        return  "redirect:/patients";
    }

}


package com.dentalSoft.DentalSoft.controller;

import com.dentalSoft.DentalSoft.dao.entity.Patient;
import com.dentalSoft.DentalSoft.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PatientsController {
    @Autowired
    private PatientService patientService;
    @GetMapping("/patients")
    public String getAllPatients(Model model) {
        List<Patient> patients = (List<Patient>) patientService.getAllPatients();
        model.addAttribute("patients", patients);
        return "patients"; // This is the name of your Thymeleaf template
    }
}

package com.dentalSoft.DentalSoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class PatientDetailsController {
    @GetMapping("/patient_details")
    public String patientDetails(){
        return "patient_details";
    }
}

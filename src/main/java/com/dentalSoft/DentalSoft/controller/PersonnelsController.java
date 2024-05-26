package com.dentalSoft.DentalSoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class PersonnelsController {
    @GetMapping("/personnels")
    public String personnels(){
        return "personnels";
    }
}

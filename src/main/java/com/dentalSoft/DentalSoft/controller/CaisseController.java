package com.dentalSoft.DentalSoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class CaisseController {
    @GetMapping("/caisse")
    public String caisse(){
        return "caisse";
    }
}

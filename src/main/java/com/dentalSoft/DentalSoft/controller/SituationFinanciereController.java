package com.dentalSoft.DentalSoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class SituationFinanciereController {
    @GetMapping("/Situation_financiere")
    public String situationFinanaciere(){
        return "situation_financiere";
    }
}

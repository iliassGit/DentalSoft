package com.dentalSoft.DentalSoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class ParametreController {
    @GetMapping("/parametres")
    public String parametre(){
        return "parametres";
    }

}

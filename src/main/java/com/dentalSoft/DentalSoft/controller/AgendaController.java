package com.dentalSoft.DentalSoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AgendaController {
    @GetMapping("/agenda")
    public String agenda(){

        return "agenda";
    }
}

package com.dentalSoft.DentalSoft.controller;

import com.dentalSoft.DentalSoft.dao.entity.Dentiste;
import com.dentalSoft.DentalSoft.services.DentisteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("dentiste")
public class ProfileController {
    @Autowired
    private DentisteService dentisteService;
    @GetMapping("/profile")
    public String showProfilePage(Model model){
        return "profile";
    }
    @ModelAttribute("dentiste")
    public Dentiste getDentiste(@RequestParam Long id, Model model) {
        model.addAttribute("id", id);
        return dentisteService.getDentisteById(id);
    }
    @PostMapping("/profile")
    public String navigateProfile(){

        return "profile";
    }

    @PostMapping("/updateDentiste")
    public String updateDentiste(@ModelAttribute Dentiste dentiste, Model model){
        Dentiste existingdentiste = dentisteService.getDentisteById((long) dentiste.getId());
        existingdentiste.setAdresse(dentiste.getAdresse());
        existingdentiste.setEmail(dentiste.getEmail());
        existingdentiste.setTelephone(dentiste.getTelephone());
        model.addAttribute("dentiste", existingdentiste);
        dentisteService.saveDentiste(dentiste);
        return "redirect:/profile?id=" + existingdentiste.getId();
    }

}

package com.dentalSoft.DentalSoft.controller;

import com.dentalSoft.DentalSoft.dao.entity.Dentiste;
import com.dentalSoft.DentalSoft.services.DentisteService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("dentiste")
public class ProfileController {
    @Autowired
    private HttpSession session;
    @Autowired
    private DentisteService dentisteService;
    @GetMapping("/profile")
    public String showProfilePage(Model model){
        return "profile";
    }
    @ModelAttribute("dentiste")
    public Dentiste getDentiste(Model model) {
        Object idDentisteObj = session.getAttribute("idDentiste");
        Long idDentiste = null;

        if (idDentisteObj instanceof Integer) {
            idDentiste = ((Integer) idDentisteObj).longValue();
        } else if (idDentisteObj instanceof Long) {
            idDentiste = (Long) idDentisteObj;
        }
        return dentisteService.getDentisteById(idDentiste);
    }
    @PostMapping("/profile")
    public String navigateProfile(){

        return "profile";
    }

    @PostMapping("/updateDentiste")
    public String updateDentiste(@RequestParam String adresse,
                                 @RequestParam String telephone,
                                 @RequestParam String email,
                                 Model model){
        Object idDentisteObj = session.getAttribute("idDentiste");
        Long idDentiste = null;

        if (idDentisteObj instanceof Integer) {
            idDentiste = ((Integer) idDentisteObj).longValue();
        } else if (idDentisteObj instanceof Long) {
            idDentiste = (Long) idDentisteObj;
        }
        Dentiste updatedDentiste = dentisteService.getDentisteById((Long)idDentiste);
        updatedDentiste.setAdresse(adresse);
        updatedDentiste.setEmail(email);
        updatedDentiste.setTelephone(telephone);
        model.addAttribute("dentiste", updatedDentiste);
        dentisteService.saveDentiste(updatedDentiste);
        return "redirect:/profile?id=" + updatedDentiste.getId();
    }

}

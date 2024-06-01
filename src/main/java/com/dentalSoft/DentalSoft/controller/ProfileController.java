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
    public Dentiste getDentiste( Model model) {
        Long idDentiste = 1L;
        session.setAttribute("idDentiste", idDentiste   );
        return dentisteService.getDentisteById(idDentiste);
    }
    @PostMapping("/profile")
    public String navigateProfile(){

        return "profile";
    }

    @PostMapping("/updateDentiste")
    public String updateDentiste(Model model){
        Object dentisteId = session.getAttribute("idDentiste");
        Dentiste existingdentiste = dentisteService.getDentisteById((long) dentisteId);
        existingdentiste.setAdresse(existingdentiste.getAdresse());
        existingdentiste.setEmail(existingdentiste.getEmail());
        existingdentiste.setTelephone(existingdentiste.getTelephone());
        model.addAttribute("dentiste", existingdentiste);
        dentisteService.saveDentiste(existingdentiste);
        return "redirect:/profile?id=" + existingdentiste.getId();
    }

}

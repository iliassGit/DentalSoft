package com.dentalSoft.DentalSoft.controller;


import com.dentalSoft.DentalSoft.dao.entity.Utilisateur;
import com.dentalSoft.DentalSoft.services.UtilisateurService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    UtilisateurService utilisateurService;
    @Autowired
    private HttpSession session;
    @GetMapping("/")
    public String login(){
        return "login";
    }

    @PostMapping("/register")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
        Utilisateur user = utilisateurService.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            session.setAttribute("idDentiste", user.getId());
            return "redirect:/profile";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }
}

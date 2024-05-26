package com.dentalSoft.DentalSoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProfileController {
    @GetMapping("/profile")
    public String showProfilePage(){
        return "profile";
    }

    @PostMapping("/profile")
    public String navigateProfile(){
        return "profile";
    }
}

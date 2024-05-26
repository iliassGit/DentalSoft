package com.dentalSoft.DentalSoft.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("/")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        // Implement your authentication logic here
        // For simplicity, let's assume a hardcoded username and password
        if (username.equals("admin") && password.equals("password")) {
            return "redirect:/welcome"; // Redirect to welcome page if login successful
        } else {
            return "redirect:/login?error=true"; // Redirect back to login page with error parameter
        }
    }
}

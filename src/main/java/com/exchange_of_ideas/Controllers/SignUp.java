package com.exchange_of_ideas.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignUp {

    @GetMapping("/Loginv")
    public String signup(Model model) {
        model.addAttribute("title", "Login");
        return "login";
    }

}
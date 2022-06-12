package com.exchange_of_ideas.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/loginyara")
    public String login(Model model) {
        return "loginyara";
    }

}

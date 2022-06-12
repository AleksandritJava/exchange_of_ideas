package com.exchange_of_ideas.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@Controller
public class MainPageController {

    @GetMapping("/MainPage")
    public String mainpage(Model model) {
        model.addAttribute("title", "Ав");
        return "MainPage";
    }

}
package org.example;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/")
    public String showHomePage(Model model) {
        model.addAttribute("message", "Hello, world!");
        return "index";
    }
}
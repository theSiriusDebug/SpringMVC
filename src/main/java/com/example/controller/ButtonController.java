package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ButtonController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Привет");
        return "message";
    }

    @GetMapping("/bye")
    public String bye(Model model) {
        model.addAttribute("message", "Пока");
        return "message";
    }
}


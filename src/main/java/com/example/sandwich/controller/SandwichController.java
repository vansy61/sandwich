package com.example.sandwich.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
    @RequestMapping("/form")
    public String showForm() {
        return "/form";
    }

    @RequestMapping("/save")
    public String showResult(@RequestParam String[] condiment, Model model) {
        model.addAttribute("condiments", condiment);
        return "/result";
    }
}

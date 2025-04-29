package com.csc3402.lab.springproject1.controller;

import com.csc3402.lab.springproject1.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    private final List<Message> messages = new ArrayList<>();

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("pageTitle", "Spring Boot Demo");
        model.addAttribute("message", new Message());
        model.addAttribute("messages", messages);
        return "index";
    }

    @PostMapping("/addMessage")
    public String addMessage(@ModelAttribute Message message) {
        messages.add(message);
        return "redirect:/";
    }
}
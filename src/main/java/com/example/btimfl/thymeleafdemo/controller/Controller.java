package com.example.btimfl.thymeleafdemo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/hello")
    public String sayHello(Model model) {
        model.addAttribute("theData", new Date());

        return "helloworld";
    }

    @GetMapping("/show-form")
    public String showForm() {
        return "helloworld-form";
    }

    @GetMapping("/process-form")
    public String processForm() {
        return "helloworld";
    }
}

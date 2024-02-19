package com.example.btimfl.thymeleafdemo.controller;

import com.example.btimfl.thymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {
    @Value("${countries}")
    private List<String> countries;

    @Value("${languages}")
    private List<String> languages;

    @Value("${os}")
    private List<String> operatingSystems;

    @GetMapping("/show-student-form")
    public String showStudentForm(Model theModel) {
        theModel.addAttribute("student", new Student());
        theModel.addAttribute("countries", countries);
        theModel.addAttribute("languages", languages);
        theModel.addAttribute("operatingSystems", operatingSystems);

        return "student-form";
    }

    @PostMapping("/process-student-form")
    public String processStudentForm(@ModelAttribute Student student) {
        System.out.println(student.toString());
        return "student-confirmation";
    }
}

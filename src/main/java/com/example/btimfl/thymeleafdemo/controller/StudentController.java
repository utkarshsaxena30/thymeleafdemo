package com.example.btimfl.thymeleafdemo.controller;

import com.example.btimfl.thymeleafdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

    @GetMapping("/show-student-form")
    public String showStudentForm(Model theModel) {
        theModel.addAttribute("student", new Student());
        return "student-form";
    }

    @PostMapping("/process-student-form")
    public String processStudentForm(@ModelAttribute Student student) {
        System.out.println(student.toString());
        return "student-confirmation";
    }
}

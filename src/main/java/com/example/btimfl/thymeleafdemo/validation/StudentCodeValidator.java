package com.example.btimfl.thymeleafdemo.validation;

import com.example.btimfl.thymeleafdemo.annotation.StudentCode;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.lang.annotation.Annotation;
import java.util.Optional;

public class StudentCodeValidator implements ConstraintValidator<StudentCode, String> {

    private String studentCodePrefix;

    @Override
    public void initialize(StudentCode constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
        studentCodePrefix = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if(s == null) return true;

        return s.startsWith(studentCodePrefix);
    }
}

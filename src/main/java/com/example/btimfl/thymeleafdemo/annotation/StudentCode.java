package com.example.btimfl.thymeleafdemo.annotation;

import com.example.btimfl.thymeleafdemo.validation.StudentCodeValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = StudentCodeValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface StudentCode {
    public String value() default "BT18";
    public String message() default "must start with BT18";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

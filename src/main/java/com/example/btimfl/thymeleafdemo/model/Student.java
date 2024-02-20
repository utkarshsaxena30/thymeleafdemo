package com.example.btimfl.thymeleafdemo.model;

import com.example.btimfl.thymeleafdemo.annotation.StudentCode;
import jakarta.validation.constraints.*;

import java.util.List;

public class Student {
    private String firstName;
    @NotNull(message = " is required")
    @Size(min = 1, message = " is required")
    private String lastName;
    private String country;
    private String favoriteLanguage;
    private List<String> favoriteOS;
    @Min(value = 0, message = "cannot be less than 0")
    @Max(value = 10, message = "cannot be more than 10")
    private Integer freePasses;
    @Pattern(regexp = "^[a-zA-z0-9]{5}", message = "only 5 chars/digits")
    private String postCode;
    @StudentCode(value = "BT19", message = "must start with BT19")
    private String studentCode;

    public Student() {}

    public Student(String firstName, String lastName, String country, String favoriteLanguage, List<String> favoriteOS, Integer freePasses, String postCode, String studentCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.favoriteLanguage = favoriteLanguage;
        this.favoriteOS = favoriteOS;
        this.freePasses = freePasses;
        this.postCode = postCode;
        this.studentCode = studentCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public List<String> getFavoriteOS() {
        return favoriteOS;
    }

    public void setFavoriteOS(List<String> favoriteOS) {
        this.favoriteOS = favoriteOS;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

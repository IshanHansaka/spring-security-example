package com.telusko.spring_security_example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.spring_security_example.model.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {

    private List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Navin", 100),
            new Student(2, "Kiran", 100)));

    @GetMapping("/students")
    public List<Student> getStudents() {

        return students;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/students")
    public void createStudent(@RequestBody Student student) {
        students.add(student);
    }
}
package com.telusko.spring_security_example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping
    public String welcome(HttpServletRequest request) {
        return "welcome to home page! " + request.getSession().getId();
    }
}

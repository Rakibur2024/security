package com.spring.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security")
public class TestController {
    @GetMapping("/test")
    public String test(){
        System.out.println("Test Method");
        return "Test";
    }
}

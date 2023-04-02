package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String sendGreetings() {
        LocalDate today = LocalDate.now();  
        System.out.println(today);
        return today;
    }
}

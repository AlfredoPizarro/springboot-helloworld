package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.util.Locale;
import java.util.*;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String sendGreetings() {
     Locale locale = Locale.getDefault();
     String lang = locale.getDisplayLanguage();
        return lang;
    }
}

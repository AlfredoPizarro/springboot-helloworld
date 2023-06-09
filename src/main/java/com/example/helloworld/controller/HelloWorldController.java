package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.text.DateFormat;  
import java.util.Date;  
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.*;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String sendGreetings() {
     Locale locale = Locale.getDefault();
     String lang = locale.getDisplayLanguage();
     Date currentDate = new Date();
     String dateToStr = DateFormat.getInstance()
                               .format(currentDate);
        return "Current language:" + lang + "====== Current date: " + dateToStr;
    }
}

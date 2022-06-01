package com.example.httprest.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JavaToController {

    @GetMapping("/jsp/java")
    public String jspToJava() {

        return "jspdemo2";
    }
    
}

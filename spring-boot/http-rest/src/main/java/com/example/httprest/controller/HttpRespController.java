package com.example.httprest.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HttpRespController {

    @GetMapping("/txt")
    public String txt() {

        return "demo.txt";
    }
    
    @GetMapping("/html")
    public String mus() {
        
        return "index";
    }

    @GetMapping("/jsp")
    public String jsp() {

        return "jspdemo";
    }
    

    


}

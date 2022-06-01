package com.example.httprest.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HttpController {
    
    @GetMapping("/get")
    public String get() {

        return "get요청";
    }

    @PostMapping("/post")
    public String post() {

        return "post요청";
    }
    
    @PutMapping("/put")
    public String put() {

        return "post요청";
    }
    
    @DeleteMapping("/delete")
    public String delete() {

        return "delete요청";
    }
    
}

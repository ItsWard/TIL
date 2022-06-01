package com.example.httprest.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class QueryPathController {

    @GetMapping("/chicken")
    public String chickenQuery(String type) {

        return type + "배달갑니다.(쿼리스트링)";
    }

    @GetMapping("/chicken/{type}")
    public String chickenPath(@PathVariable String type) {

        return type + "배달갑니다.(주소변수매핑";
    }
}

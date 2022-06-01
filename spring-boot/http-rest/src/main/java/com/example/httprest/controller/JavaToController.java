package com.example.httprest.controller;

import com.example.httprest.domain.User;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JavaToController {

    @GetMapping("/jsp/java")
    public String jspToJava() {

        return "jspdemo2";
    }

    @GetMapping("/jsp/java/model")
    public String jspToJavaToModel(Model model) { //메소드의 파라미터에 Model을 선언하고,

        User user = new User();
        user.setUsername("ward");

        model.addAttribute("username", user.getUsername()); //addAttribute메소드로 전달하면됨 .

        return "jspdemo3";
    }


}

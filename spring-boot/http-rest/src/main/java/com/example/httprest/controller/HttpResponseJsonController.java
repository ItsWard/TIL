package com.example.httprest.controller;

import com.example.httprest.domain.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HttpResponseJsonController {

    @GetMapping("/resp/json")
    public String respJson() {

        return "{\"username\":\"ward\"}";
    }

    @GetMapping("/resp/json/object")
    public User respJsonObject() {
        User user = new User();
        user.setUsername("김와드");
        return user; //1. Message converter가 자동으로 JavaObject를 Json으로 변경하여 통신을 통해 응답을 해줌.
                    //2. @RestController일때만 MessageConverter가 작동한다.
    }

    

    


}

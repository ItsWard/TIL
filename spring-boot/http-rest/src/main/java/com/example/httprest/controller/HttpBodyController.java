package com.example.httprest.controller;

import com.example.httprest.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class HttpBodyController {

    private static final Logger log = LoggerFactory.getLogger(HttpBodyController.class);

    @PostMapping("/body1")
    //기본적으로 x-www-form-urlencoded 타입 파싱 함
    public String xwwwFormUrlencoded(String username) {

        log.info(username);
        return "key=value";
    }

    @PostMapping("/body2")
    public String textPlain(@RequestBody String data) {

        log.info(data);
        return "text/plan 전송옴";
    }

    @PostMapping("/body3")
    public String applicationJson(@RequestBody String data) {

        log.info(data);
        return "json전송옴";
    }

    @PostMapping("/body4")
    public String applicationJsonToObject(@RequestBody User user) {

        log.info(user.getUsername());
        return "jsonObject 전송옴";
    }
}

package io.security.springsecurity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {

    @GetMapping("/")
    public String index() {

        return "home";
    }

    @GetMapping("/loginPage")
    public String login() {

        return "loginPage";
    }




}

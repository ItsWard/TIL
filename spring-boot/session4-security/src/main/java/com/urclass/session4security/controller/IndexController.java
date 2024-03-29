package com.urclass.session4security.controller;

import com.urclass.session4security.model.Member;
import com.urclass.session4security.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final MemberRepository memberRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping("/")
    public @ResponseBody String index() {

        return "index";
    }

    @GetMapping("/user")
    public @ResponseBody String user() {

        return "user";
    }
    @GetMapping("/admin")
    public @ResponseBody String admin() {

        return "admin";
    }
    @GetMapping("/manager")
    public @ResponseBody String manager() {

        return "manager";
    }

    @GetMapping("/login_form")
    public String login() {
        return "loginForm";
    }

    @GetMapping("/join")
    public String joinForm() {
        return "joinForm";
    }

    @PostMapping("/join")
    public String join(Member member) {
        member.setRole("ROLE_USER");
        String rawPassword = member.getPassword();
        String encPassword = bCryptPasswordEncoder.encode(rawPassword);
        member.setPassword(encPassword);

        memberRepository.save(member);

        return "redirect:/login";
    }


}

package com.ward.introduction.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello") //thymeleaf의 기본 주소는 /가 없음
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        return "hello"; //뷰 리졸버가 자동으로 화면을 찾아서 처리함
        //resources:templates/viewName.html
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody //응답 데이터를 직접 넣어주겠다.
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name; // 템플릿(html 파일 없이, 데이터를 그대로 출력함
    }

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }


    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

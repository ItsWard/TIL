package com.example.httprest.domain;


import org.springframework.context.annotation.Bean;

public class User {

    private String username;
    @Bean
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}



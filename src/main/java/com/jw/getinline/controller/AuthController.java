package com.jw.getinline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String login(){
        return "Auth/login";
    }

    @GetMapping("/sign-up")
    public String signUp(){
        return "Auth/sign-up";
    }
}

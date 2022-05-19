package com.learn.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomController {

    @GetMapping("/welcome")
    public String sayHellow() {
        return "welcome from SPring Application";
    }
}

package com.onceagain.bboteca.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MainController {

    @GetMapping("/")
    public String hello() {
        return "welcome to my personal page";
    }
}

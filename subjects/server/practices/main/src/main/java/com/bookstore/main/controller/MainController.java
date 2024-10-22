package com.bookstore.main.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MainController {

    @GetMapping("/")
    public String index() {
        return "welcome to my page";
    }
}

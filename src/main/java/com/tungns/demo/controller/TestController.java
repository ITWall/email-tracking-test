package com.tungns.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "ping")
public class TestController {
    @GetMapping
    public String ping() {
        System.out.println("pong");
        return "pong";
    }
}

package com.tungns.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping(value = "ping")
public class TestController {
    @GetMapping
    public String ping(HttpServletRequest request) {
        System.out.println("pong");
        System.out.println(request.getRemoteAddr());
        return "pong";
    }
}

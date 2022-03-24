package com.tungns.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

@RestController
@RequestMapping(value = "ping")
public class TestController {
    @GetMapping
    public String ping(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("pong");
        System.out.println(request.getRemoteAddr());
        Cookie cookie= new Cookie("userName", "TungNguyen");
        response.addCookie(cookie);
        Arrays.stream(request.getCookies()).toList().stream().map(Cookie::getValue).forEach(System.out::println);
        return "pong";
    }
}

package com.tungns.demo.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

@RestController
@RequestMapping(value = "ping")
public class TestController {

    @GetMapping(value = "tracking/{id}")
    public String ping(HttpServletRequest request, HttpServletResponse response, @PathVariable("id") String id) {
        System.out.println("pong from id " + id);
        System.out.println(request.getRemoteAddr());
        System.out.println(request.getHeader("User-Agent"));
        response.addCookie(new Cookie("cookieName", "TungNguyen"));
        return "pong";
    }
}

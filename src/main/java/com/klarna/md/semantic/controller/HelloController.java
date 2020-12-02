package com.klarna.md.semantic.controller;

import com.klarna.md.semantic.response.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping
    @RequestMapping("/hello")
    public Greeting hello() {

        return new Greeting(1L, "Hello world");
    }

    @GetMapping
    @RequestMapping("/ping")
    public Object ping() {

        return "ping";
    }
}

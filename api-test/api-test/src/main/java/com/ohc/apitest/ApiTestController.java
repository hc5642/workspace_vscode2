package com.ohc.apitest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiTestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Api-Test!";
    }
}
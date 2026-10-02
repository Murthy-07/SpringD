package com.springdemo.springd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping
    public String hello() {

        return "Hello World";
    }

    @RequestMapping("/murthy")
    public int price(){
        return 567;
    }
}
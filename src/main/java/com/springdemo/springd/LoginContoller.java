package com.springdemo.springd;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class LoginContoller{


        @RequestMapping("/login")
        public String log() {
            return "Welcome to login page";
        }
    }


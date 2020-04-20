package com.example.springdevops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping
    public String hello() {
        System.out.println("just saying hi");

        return "Hi All, Welcome to DevOps Code pipeline demo";
    }
}

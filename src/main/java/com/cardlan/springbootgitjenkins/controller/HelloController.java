package com.cardlan.springbootgitjenkins.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHi(){
        return "hello git jenkins";
    }

    @GetMapping("/jenkins")
    public String jenkins(){
        return "hello idea git jenkins";
    }
}

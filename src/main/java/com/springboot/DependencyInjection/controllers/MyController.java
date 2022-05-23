package com.springboot.DependencyInjection.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("hello world!");
        return "hello folks!";
    }
}

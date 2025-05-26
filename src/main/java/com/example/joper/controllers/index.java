package com.example.joper.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class index {
    @GetMapping("/")
    public String ShowMe(){
        return "index";
    }
}

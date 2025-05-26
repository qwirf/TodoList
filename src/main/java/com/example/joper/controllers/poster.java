package com.example.joper.controllers;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.joper.model.onemodel;
import com.example.joper.repositories.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("/savel")
public class poster {

    @Autowired
    private repository repositoryone;
    @PostMapping("savel")
    public String zasev(@RequestParam("text")String text){
        repositoryone.save(new onemodel(text));
        return "redirect:/";

    }
    
}
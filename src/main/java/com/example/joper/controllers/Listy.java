package com.example.joper.controllers;
import org.springframework.stereotype.Controller;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List; // Импортируем List
import org.springframework.web.bind.annotation.GetMapping;
import com.example.joper.model.onemodel;
import com.example.joper.repositories.repository;
import org.springframework.ui.Model; 
@Controller
public class Listy {
    @Autowired
    private repository repositoryt;


    @GetMapping("/yapi")
    public String yapi(Model model){
        List<onemodel> alOnemodelsl = repositoryt.findAll();
        List<String> titles = alOnemodelsl.stream()
            .map(onemodel::getTitle)
            .collect(Collectors.toList());
        //отправка данных из бд на шаблон
        model.addAttribute("titles",titles);
        return "yapi";
    }
}

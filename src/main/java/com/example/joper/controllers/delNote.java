package com.example.joper.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.joper.model.onemodel;
import com.example.joper.repositories.repository;

import org.springframework.ui.Model;

@Controller
public class delNote {
    @Autowired
    private repository repositoryu;
    @PostMapping("/delnote")
    public ModelAndView deliteNote(@RequestParam("inputTextfordel") String inputTextfordel,Model model){
        List<onemodel> ModelToDelete = repositoryu.findByTitleContaining(inputTextfordel);
        if(!ModelToDelete.isEmpty()){
            for(onemodel onemodel : ModelToDelete){
                repositoryu.delete(onemodel);
            }
        }
        return new ModelAndView("redirect:/yapi");
    }
}

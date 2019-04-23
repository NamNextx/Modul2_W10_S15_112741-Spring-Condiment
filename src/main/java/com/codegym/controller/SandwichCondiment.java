package com.codegym.controller;

import com.codegym.model.Condiment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@Controller
public class SandwichCondiment {
    @GetMapping("/home")
    public ModelAndView home()
    {
        ModelAndView modelAndView=new ModelAndView("home","condiments",new Condiment());
        return modelAndView;
    }

    @PostMapping("/result")
    public ModelAndView result(@ModelAttribute ("condiments") Condiment condiments){
        ModelAndView modelAndView=new ModelAndView("home");

        modelAndView.addObject("selected",condiments.getApple());
        modelAndView.addObject("selected",condiments.getTomato());
        modelAndView.addObject("selected",condiments.getMutap());

        return modelAndView;
    }

}


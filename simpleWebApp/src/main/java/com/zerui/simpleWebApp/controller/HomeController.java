package com.zerui.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome Zer";
    }

    @RequestMapping("/about")
    public String about(){
        return "about page";
    }
}

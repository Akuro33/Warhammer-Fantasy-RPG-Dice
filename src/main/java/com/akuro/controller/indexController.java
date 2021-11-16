package com.akuro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    @GetMapping(value = "/home")
    public String getIndex () {
        System.out.println("Index");
        return "index";
    }
    @RequestMapping (value = "/home")
    public String getCoverCSS () {
        return "/cover.css";
    }

}

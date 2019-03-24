package com.HelloWord.HelloWord.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWordControler {

    @GetMapping("/")
    @ResponseBody
    public String sayHello() {
        return "";
    }

}

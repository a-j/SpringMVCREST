package com.mvcrest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MVCRestHelloWorld {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/welcome")
    public ModelAndView helloWorld() {
        String message = "Hello World - Testing JRebel!!! - Awesome";
        return new ModelAndView("welcome", "message", message);
    }
}

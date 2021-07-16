package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String home(){
        return "Hello World!";
    }

}

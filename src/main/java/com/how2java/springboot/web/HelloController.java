package com.how2java.springboot.web;
import java.text.DateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class HelloController {
 
    @RequestMapping("/hello")
    public String hello( Model m) {
    	m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        return "Hello Spring Boot!";
    }
 
}
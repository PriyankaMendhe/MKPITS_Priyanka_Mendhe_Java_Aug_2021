package com.example.springcrudpractice.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/new")
    public String display()
    {
        return "form1";
    }

    @RequestMapping("/home")
    public String viewHomePage()
    {
        return "home";
    }

}

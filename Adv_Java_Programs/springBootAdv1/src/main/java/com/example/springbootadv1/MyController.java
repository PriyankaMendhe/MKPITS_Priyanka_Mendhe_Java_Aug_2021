package com.example.springbootadv1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {

    @RequestMapping
    public String display()
    {

        return "mvc1";
    }

    @RequestMapping("/home")
    public String display1()
    {

        return "mvc2";
    }

}

package com.example.springcrud2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController1 {


    @RequestMapping("/h")
    public String BookEntry()
    {
        return "form1";


    }

}

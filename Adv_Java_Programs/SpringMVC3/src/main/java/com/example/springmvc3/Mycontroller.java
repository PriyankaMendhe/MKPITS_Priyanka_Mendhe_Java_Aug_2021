package com.example.springmvc3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/stud")//parent request mapping
public class Mycontroller {

    @RequestMapping("/home")//child under parent"stud"
    public String display()
    {
        return "form1";

    }

    @RequestMapping("/add")////child under parent"stud"
    public String display2()
    {

        return "form2";
    }
}

package com.example.springmvc2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {

    @RequestMapping
    public String display() {
        return "mvc1";//passing html file with controller annotation
    }

}

//with RestController and String return
//@Controller
//public class MyController {
//
//    @RequestMapping
//    public String display() {
//        return "Hello";//passing return
//    }
//
//
//    @RequestMapping("/home")
//    public String display2()
//    {
//        return "mvc2";
//    }
//
//
//}
//




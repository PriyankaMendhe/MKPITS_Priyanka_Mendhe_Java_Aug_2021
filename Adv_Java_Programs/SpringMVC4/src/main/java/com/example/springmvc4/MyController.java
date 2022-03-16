package com.example.springmvc4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {


    @RequestMapping("/home")
    public String displayForm()
    {
        return "form1";
    }

  // @RequestMapping("/success")
   //public String collectData(@RequestParam("uname") String uname, @RequestParam("upass") String upass , Model mod)


    //wiith default value
    @RequestMapping("/success")
    public String collectData(@RequestParam(defaultValue = "default Value",name="uname") String uname, @RequestParam("upass") String upass , Model mod)
    {
        mod.addAttribute("username",uname);
        mod.addAttribute("password",upass);
        return "form2";

    }
}

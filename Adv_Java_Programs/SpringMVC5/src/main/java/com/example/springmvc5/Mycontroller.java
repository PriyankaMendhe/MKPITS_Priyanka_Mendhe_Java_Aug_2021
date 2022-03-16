package com.example.springmvc5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Mycontroller {


    @RequestMapping("/home")
    public String displayForm()
    {
        return "form1";
    }

     @RequestMapping("/success")
    public String collectData(@ModelAttribute("loginObject")login ob)
     {

         return "form2";


     }


     ///another way //
//    @RequestMapping("/success")
//    public String collectData(@RequestParam("uname") String uname, @RequestParam("upass") String upass , Model mod)
//
//    {
//        login ob = new login();
//        ob.setUname(uname);
//        ob.setUpass(upass);
//
//        mod.addAttribute("loginObject",ob);
//
//        return "form2";
//
//    }
}

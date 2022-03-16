package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class MyController {

//    @RequestMapping
//    public String display()
//    {
//
//        return "page1";
//    }

//    by Model
//    @RequestMapping
//    public String display(Model mod)
//    {
//        mod.addAttribute("msg","this is model object data");
//
//        return "page2";
//
//    }


//    //by ModelMap
//        @RequestMapping
//    public String display(ModelMap mod)
//    {
//        mod.addAttribute("msg","this is model object data");
//
//        return "page2";
//
//    }

    //map object
//    @RequestMapping
//    public String display(Map<String,Object> mod)
//    {
//        mod.put("msg","this is model object data");
//
//        return "page2";
//
//    }


    //MOdelandView
    @RequestMapping
    public ModelAndView display()
    {
        ModelAndView mod = new ModelAndView("page2");
        mod.addObject("msg","this is model object data");

        return mod ;

    }

}

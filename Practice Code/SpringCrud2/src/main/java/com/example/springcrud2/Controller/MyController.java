package com.example.springcrud2.Controller;


import com.example.springcrud2.Model.Book;
import com.example.springcrud2.Repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public class MyController {


    private BookRepo repo;

    @RequestMapping("/home")
    public String displayForm()
    {
        return "form1";
    }


//    @RequestMapping("/save")
//    public String bookSave(@ModelAttribute("bookObject") Book ob){
//
//        repo.save(ob);
//        return "Save";
//
//    }

//     public String   bookUpdate(){
//
//         return "Update";
//
//     }
//
//    public String bookDataFetch(){
//
//        return "read";
//
//    }
//
//    public String bookDataDelete(){
//
//
//        return "delete";
//
//
//    }


}

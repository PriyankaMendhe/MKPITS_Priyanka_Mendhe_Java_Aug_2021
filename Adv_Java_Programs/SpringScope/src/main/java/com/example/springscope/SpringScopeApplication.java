package com.example.springscope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringScopeApplication {

    public static void main(String[] args) {

        ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/bean.xml");
        Vehicle vob = (Vehicle) appcont.getBean("vob");

        Vehicle vob1 = (Vehicle) appcont.getBean("vob");


        if(vob==vob1)
        {
            System.out.println("Equal");// if been Scope="Singleton"
        }
        else
        {
            System.out.println("not Equal");// if been Scope="Prototype"
        }

    }

}

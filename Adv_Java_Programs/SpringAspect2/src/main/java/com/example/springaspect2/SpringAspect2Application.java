package com.example.springaspect2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringAspect2Application {

    public static void main(String[] args) {

        ApplicationContext appcont = new ClassPathXmlApplicationContext("bean.xml");

        Emp e1 = appcont.getBean("eob",Emp.class);

        System.out.println(e1.getId()+ ""+e1.getName());

    }

}

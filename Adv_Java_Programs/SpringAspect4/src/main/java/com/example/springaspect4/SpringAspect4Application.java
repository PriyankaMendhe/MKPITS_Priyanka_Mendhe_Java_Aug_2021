package com.example.springaspect4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringAspect4Application {

    public static void main(String[] args) {

        ApplicationContext appcont = new ClassPathXmlApplicationContext("bean.xml");

        emp e1 = appcont.getBean("eob",emp.class);

        stud s1 = appcont.getBean("sob",stud.class);

        System.out.println(e1.getId()+""+e1.getName());

        System.out.println(s1.getId()+""+s1.getName());
    }

}

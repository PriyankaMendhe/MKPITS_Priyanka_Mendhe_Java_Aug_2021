package com.example.springaspect3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringAspect3Application {

    public static void main(String[] args) {

        ApplicationContext appcont = new ClassPathXmlApplicationContext("bean.xml");

        student s1 = appcont.getBean("sob",student.class);

        System.out.println(s1.getId()+""+s1.getName());

    }

}

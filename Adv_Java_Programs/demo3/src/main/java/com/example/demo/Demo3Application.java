package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Demo3Application {

    public static void main(String[] args) {

        ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/bean.xml");
        Courses courseOB = (Courses) appcont.getBean("courseOB");

         courseOB.course();

    }

}

package com.example.springbeaninheritance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;


public class SpringBeanInheritanceApplication {

    public static void main(String[] args) {

        ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/bean.xml");

        Employee eob= (Employee) appcont.getBean("eob");

        System.out.println(eob);

        Employee DerivedBeen= (Employee) appcont.getBean("DerivedBeen");

        System.out.println(DerivedBeen);



    }

}

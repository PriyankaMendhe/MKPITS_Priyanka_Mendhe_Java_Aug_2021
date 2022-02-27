package com.example.springconstructor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringConstructorApplication {

    public static void main(String[] args) {

        ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/been.xml");

        Employee emp=(Employee) appcont.getBean("emp");
        emp.display();

        Account acc=(Account) appcont.getBean("acc");
        acc.trans();


    }

}

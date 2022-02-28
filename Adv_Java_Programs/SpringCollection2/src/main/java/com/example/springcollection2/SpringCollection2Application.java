package com.example.springcollection2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Set;


public class SpringCollection2Application {

    public static void main(String[] args) {


        ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/bean.xml");
       Report eSet = (Report) appcont.getBean("rob");

       Set<Employee> employees = eSet.getEmployeeSet();

        System.out.println(employees);





    }

}

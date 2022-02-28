package com.example.springcollection3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;


public class SpringCollection3Application {

    public static void main(String[] args) {

        ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/bean.xml");
       Report employeeMap = (Report) appcont.getBean("rob");

        Map<Integer, Employee> employeeMap1 = employeeMap.getEmployeeMap();

        System.out.println(employeeMap1);


    }

}

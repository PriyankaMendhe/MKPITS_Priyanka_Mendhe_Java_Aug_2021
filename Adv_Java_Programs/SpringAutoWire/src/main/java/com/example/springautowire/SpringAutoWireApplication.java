package com.example.springautowire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class SpringAutoWireApplication {

    public static void main(String[] args) {


        ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/bean.xml");

        Report eob = (Report) appcont.getBean("rob");
        List<Employee> lemp =eob.getEmployeeList();

        System.out.println(lemp);

    }

}

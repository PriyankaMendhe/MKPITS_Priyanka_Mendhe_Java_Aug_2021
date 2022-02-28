package com.example.springcollection4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;


public class SpringCOllection4Application {

    public static void main(String[] args) {

        ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/bean.xml");

        Report rob = (Report) appcont.getBean("rob");

        Properties listemp = rob.getListemp();
        System.out.println(listemp);


    }

}

package com.example.springpostprocessorex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringPostProcessorExApplication {

    public static void main(String[] args) {

        ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/bean.xml");

        Vehicle eob = (Vehicle) appcont.getBean("eob");

        System.out.println(eob);

        Vehicle derivedVehicle = (Vehicle) appcont.getBean("derivedVehicle");

        System.out.println(derivedVehicle);

    }

}

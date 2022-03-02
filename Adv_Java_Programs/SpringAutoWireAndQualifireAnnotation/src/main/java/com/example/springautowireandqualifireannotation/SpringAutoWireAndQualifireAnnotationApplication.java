package com.example.springautowireandqualifireannotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringAutoWireAndQualifireAnnotationApplication {

    public static void main(String[] args) {

        ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/bean.xml");

        Employee eob = (Employee) appcont.getBean("eob");

        System.out.println(eob);

        Account aob = (Account) appcont.getBean("aob");

        System.out.println(aob);



    }

}

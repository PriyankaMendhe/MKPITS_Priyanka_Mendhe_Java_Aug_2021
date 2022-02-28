package com.example.springautowire2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringAutoWire2Application {

    public static void main(String[] args) {

        ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/bean.xml");

        Employee eob = (Employee) appcont.getBean("eob");

        eob.display();

        Account acc1 = (Account) appcont.getBean("aob");
        acc1.trans();

    }

}

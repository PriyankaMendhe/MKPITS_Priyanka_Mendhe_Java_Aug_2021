package com.example.springaspect5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;


public class SpringAspect5Application {

    public static void main(String[] args) {


        ApplicationContext appcont = new ClassPathXmlApplicationContext("bean.xml");

        emp e1 = appcont.getBean("eob",emp.class);

//        e1.setId(11);//beforeAdvice call to setter
//        e1.setName("Kiyansh");

        stud s1 = appcont.getBean("sob",stud.class);

        System.out.println(e1.getName()+""+e1.getId());

        e1.printThowsException();

        System.out.println(s1.getName()+""+s1.getId());
    }

}

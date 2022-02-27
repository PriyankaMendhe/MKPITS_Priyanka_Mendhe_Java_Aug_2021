package com.example.springdemo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringDemo3Application {

    public static void main(String[] args) {
        ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/bean.xml");

        Vehicle vehiOB = (Vehicle) appcont.getBean("vehiOB");

        //set this value in been file
//        vehiOB.setId(2);
//        vehiOB.setVname("ALZTO");

          vehiOB.vehicleName();


          //for Account class id and ref store in been file
        Account acc  = (Account) appcont.getBean("acc");
        acc.trans();


    }

}

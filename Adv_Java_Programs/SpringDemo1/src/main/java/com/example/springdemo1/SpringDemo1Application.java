package com.example.springdemo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringDemo1Application {

    public static void main(String[] args) {


        ApplicationContext appcont = new ClassPathXmlApplicationContext("/templates/bean.xml");

        // find in bean xml file object of Employee and call method of employee class
       Employee emp1  = (Employee) appcont.getBean("emp");

       emp1.display();

        // find in bean xml file object of Student and call method of Student class
        Student stud1  = (Student) appcont.getBean("stud");
        stud1.result();


        // find in bean xml file object of Product and call method of Product class
        Product prod1  = (Product) appcont.getBean("prod");
        prod1.productDisplay();








    }

}

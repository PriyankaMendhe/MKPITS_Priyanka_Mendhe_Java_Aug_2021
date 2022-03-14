package com.example.springmvc2;

import com.example.springmvc2.model.student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
public class SpringMvc2Application {

    public static void main(String[] args) {

        SpringApplication.run(SpringMvc2Application.class, args);



    }

}

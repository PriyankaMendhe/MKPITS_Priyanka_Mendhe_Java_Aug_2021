package com.example.springbootadv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.springbootadv1.Model")
public class SpringBootAdv1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdv1Application.class, args);
    }

}

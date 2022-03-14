package com.example.springdbms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.beans.AppletInitializer;
import java.sql.Connection;
import java.sql.DriverManager;


public class SpringDbmsApplication {

    public static void main(String[] args) {

        ApplicationContext appcont = new ClassPathXmlApplicationContext("bean.xml");

        try{

            //normal connection with db
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/springdb","root","root");
//            System.out.println("Database Connected");


         // connection with DB by driverMnaager DATASOUrce

          DriverManagerDataSource dataSource =  appcont.getBean("datasource1", DriverManagerDataSource.class);
           Connection con =  dataSource.getConnection();
            System.out.println("DataBase COnnected");

        }catch(Exception ee)
        {
            System.out.println(ee.toString());

        }



    }

}

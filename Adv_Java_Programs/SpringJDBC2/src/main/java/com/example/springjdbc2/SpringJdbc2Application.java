package com.example.springjdbc2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.SQLOutput;

//JDBC TEMPLATe
public class SpringJdbc2Application {

    public static void main(String[] args) {


        ApplicationContext appcont = new ClassPathXmlApplicationContext("bean.xml");

        //to perform CRUD operation on DB.(insert, update etc)
        JdbcTemplate template  = appcont.getBean("jdbcTemplate",JdbcTemplate.class);

        String query="insert into student values(?,?,?)";

        int result = template.update(query,1,"KIA","NGP");

        System.out.println("record updated"+result+" record inserted");

//        String updateQ = "update student set name= ? where id= ?";
//
//        int result2 = template.update(updateQ,"KIYANSH",1);
//        System.out.println("record update "+result2);

//        String queryDelete ="delete from student where id=?";
//
//        int result3 = template.update(queryDelete,1);
//
//        System.out.println("record delete "+result3);

        String selectQuery = "Select name from student where id=?";
        String result4 = template.queryForObject(selectQuery,String.class,1);
        System.out.println(result4);
        try
        {
            //datasource class establish connection
           DriverManagerDataSource datasource= appcont.getBean("datasource", DriverManagerDataSource.class);
//            datasource.getConnection();
//            System.out.println("connection establish");




        }catch(Exception ee)
        {
            System.out.println(ee.toString());
        }
    }

}

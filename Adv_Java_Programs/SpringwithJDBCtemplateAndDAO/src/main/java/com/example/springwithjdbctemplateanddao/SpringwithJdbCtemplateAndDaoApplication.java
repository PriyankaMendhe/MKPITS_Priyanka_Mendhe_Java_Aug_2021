package com.example.springwithjdbctemplateanddao;

import com.example.springwithjdbctemplateanddao.dao.StudentDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


public class SpringwithJdbCtemplateAndDaoApplication {


    public static void main(String[] args) {

        ApplicationContext appcont = new ClassPathXmlApplicationContext("bean.xml");



           DriverManagerDataSource  datasource =appcont.getBean("datasource", DriverManagerDataSource.class);
//           datasource.getConnection();
           StudentDaoImpl template =appcont.getBean("implementation", StudentDaoImpl.class);

          student s1 = new student();
          s1.setId(1);
          s1.setName("KIA");
          s1.setAddr("NGP");
        student s2 = new student();
        s2.setId(2);
        s2.setName("KIA");
        s2.setAddr("NGP");

          template.insert(s1);
          template.insert(s2);
          template.updateByID(1);
          //template.displayBYID(1);

          template.displayAll();
        template.deleteBYID(1);



    }

}

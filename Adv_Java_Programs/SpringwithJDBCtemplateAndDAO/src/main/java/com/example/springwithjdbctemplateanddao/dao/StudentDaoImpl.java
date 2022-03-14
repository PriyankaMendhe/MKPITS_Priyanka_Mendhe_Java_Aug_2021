package com.example.springwithjdbctemplateanddao.dao;

import com.example.springwithjdbctemplateanddao.student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements studentDAO{
    JdbcTemplate template;
    @Override
    public void insert(student ob1) {


        String query1="insert into student values(?,?,?)";

        int result =this.template.update(query1,ob1.getId(),ob1.getName(),ob1.getAddr());

        System.out.println("record updated"+result+" record inserted");

    }

    @Override
    public void updateByID(int id) {

        String query2="update student set name=? where id=?";

        int result =this.template.update(query2,"Kiyansh",id);

        System.out.println("record updated"+result+" record inserted");

    }

    @Override
    public void deleteBYID(int id) {

        String query3="delete from student where id=?";

        int result =this.template.update(query3,id);

        System.out.println("record delete"+result);

    }

    @Override
    public void displayBYID(int id) {

        String query4="select * from  student where id=?";

        student ob =  (student) this.template.queryForObject(query4,new Object[]{id},new RowDemo());

        System.out.println(ob.toString());

    }

    @Override
    public void displayAll() {



        String query5="select * from  student";
        List<student> list =   this.template.query(query5,new RowDemo());
        System.out.println(list.size());

        for (student ob4:list) {

            System.out.println(ob4.getName()+""+ob4.getAddr()+""+ob4.getId());

        }




    }


    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    class RowDemo implements RowMapper<student>{


        @Override
        public student mapRow(ResultSet rs, int rowNum) throws SQLException {

            student ob2 = new student();

            ob2.setId(rs.getInt("id"));
            ob2.setName(rs.getString("name"));
            ob2.setAddr(rs.getString("address"));//must same to table column name

            return ob2;

        }
    }
}

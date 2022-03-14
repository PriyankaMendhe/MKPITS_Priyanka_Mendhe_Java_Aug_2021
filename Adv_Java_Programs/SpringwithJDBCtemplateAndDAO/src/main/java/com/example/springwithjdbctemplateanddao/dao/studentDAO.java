package com.example.springwithjdbctemplateanddao.dao;

import com.example.springwithjdbctemplateanddao.student;

public interface studentDAO {

    public void insert(student ob1 );

    public  void updateByID(int id);

    public void deleteBYID(int id);

    public void displayBYID(int id);

    public void displayAll();


}

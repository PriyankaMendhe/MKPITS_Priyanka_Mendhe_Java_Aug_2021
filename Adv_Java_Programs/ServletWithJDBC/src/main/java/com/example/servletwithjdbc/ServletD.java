package com.example.servletwithjdbc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//@WebServlet(name = "ServletD", value = "/ServletD")
public class ServletD extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("uname");
        String pass = request.getParameter("pass");
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","root");
            out.println("Successfully connected");
            out.println("<br>");



            Statement stmt=con.createStatement();
            String qr=("insert into userLogin values ('"+name+"','"+pass+"')");
            stmt.executeUpdate(qr);
            out.println("data insert");



        }catch(Exception ee)
        {
            out.println(ee.toString());

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

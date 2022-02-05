package com.example.servletwithjdbc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

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


//for insert data
//            Statement stmt=con.createStatement();
//            String qr=("insert into userLogin values ('"+name+"','"+pass+"')");
//            stmt.executeUpdate(qr);
//            out.println("data insert");

  //for to check login credential

            PreparedStatement ps = con.prepareStatement("Select * from userLogin where username=? and password=?");
            ps.setString(1,name);
            ps.setString(2,pass);

            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                   response.sendRedirect("Success.html");
                // out.println("Succesfully login");

            }
            else
            {
                response.sendRedirect("Error.html");
                 // out.println("Succesfully not login");

            }



        }catch(Exception ee)
        {
            out.println(ee.toString());

        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

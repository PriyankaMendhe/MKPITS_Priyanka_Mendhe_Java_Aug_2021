package com.example.demo1;

import java.io.*;
import java.util.Date;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

//@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World another message in h1 tag!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello

        PrintWriter out = response.getWriter();
       /* out.println("Welcome to server");
         out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");*/

       /* out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");*/

//    action logic to collect data from form

        String name = request.getParameter("name");
        String address = request.getParameter("addr");
        String email = request.getParameter("email");
        String mobileNo = request.getParameter("mno");
        String dob = request.getParameter("dob");


                // display to browser
        out.println("Name: "+name+"\n");
        out.println("Address: "+address+"\n");
        out.println(new Date()+"\n");
        out.println("Email-id: "+email+"\n");
        out.println("Mobile No: "+mobileNo+"\n");
        out.println("Date of Birth: "+dob+"\n");




    }

    public void destroy() {
    }
}
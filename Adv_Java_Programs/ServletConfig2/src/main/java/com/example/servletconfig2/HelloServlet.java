package com.example.servletconfig2;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

//@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
     //ServletConfig
        out.println(getServletConfig().getServletName());
        out.println("<br>");
        out.println(getServletConfig().getServletContext());
        out.println("<br>");
        out.println(getServletConfig().getClass());
        out.println("<br>");

     //init-param
        int n1 =Integer.parseInt(getInitParameter("num1"));
        int n2 =Integer.parseInt(getInitParameter("num2"));

        out.println("Init parameter 1: "+n1);
        out.println("<br>");
        out.println("Init parameter 2: "+n2);
        out.println("<br>");
        out.println(n1+n2);

        //context-param

         out.println(getServletContext().getInitParameter("Country"));
         out.println("<br>");
         out.println(getServletContext().getInitParameter("Age"));



    }


    public void destroy() {
    }
}
package com.example.servletrequestredirect;

import java.io.*;
import javax.servlet.RequestDispatcher;
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
        PrintWriter out = response.getWriter();

        String name = request.getParameter("uname");

        try {
            if (name.equals("priyanka")) {

                //print on browser
//            out.println("Success");
//            //with sendRedirect on new html
//            response.sendRedirect("Success.html");

                //with requestDispathcher

                RequestDispatcher rd = request.getRequestDispatcher("Success.html");
                rd.forward(request, response);


            } else {
                //print on browser
//            out.println("Error");

// transfer control to another html file
//            response.sendRedirect("Error.html");
                RequestDispatcher rd = request.getRequestDispatcher("Error.html");
                rd.include(request, response);



            }

        }catch (Exception ee){ out.println(ee.toString());}
//
//        // Hello
//
//        out.println("<html><body>");
//        out.println("<h1>" + message + "</h1>");
//        out.println("</body></html>");
    }

    public void destroy() {
    }
}
<%@ page import="java.io.PrintStream" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2/6/2022
  Time: 11:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display</title>
</head>
<body>
welcome to display page
<%--declartive class level--%>
<%!

    void dis1(PrintWriter write)
    {

       write.println("Hello from declartive with write object");
    }
    void dis2()
    {
       // out.println("Hello2");

    }

%>

<%--jsp service method--%>
<%
    out.println("Hello from jsp service method with out object");
    PrintWriter write = response.getWriter();
dis1(write);
dis2();

%>
</body>
</html>

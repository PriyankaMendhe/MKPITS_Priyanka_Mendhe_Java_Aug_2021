<%@ page import="java.io.PrintStream" %><%--
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

    void dis1()
    {

        System.out.println("Hello");
    }
    void dis2()
    {
        System.out.println("Hello2");

    }

%>

<%--jsp service method--%>
<%
dis1();
dis2();




%>
</body>
</html>

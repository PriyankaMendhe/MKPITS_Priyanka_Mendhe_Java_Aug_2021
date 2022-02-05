<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %><%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2/4/2022
  Time: 12:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%

    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","root");
        out.println("Database connected Successfully");

//    Statement stmt=con.createStatement();
//    String query=("insert into reguser1 values ('"+name+"','"+password+"','"+city+"','"+address+"','"+mobileNo+"','"+dob+"')");
//    stmt.executeUpdate(query);
//    out.println("Account created Successfully");

    }catch(Exception ee) {

        out.println(ee.toString());

    }
%>

<a href="dashboard.jsp">click here to Back Home Page</a>

</body>
</html>

<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %><%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2/2/2022
  Time: 10:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>

<%
    String name = request.getParameter("uname");
    String password = request.getParameter("pass");
    String city = request.getParameter("city");
    String address = request.getParameter("address");
    String mobileNo = request.getParameter("mobileNo");
    String dob = request.getParameter("dob");






%>
<%

    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","root");
//        out.println("Successfully Database Connected");
%>
<%--<font color="green" size="5">Successfully Database Connected</font> <br>--%>

<%

    Statement stmt=con.createStatement();
    String query=("insert into reguser1 values ('"+name+"','"+password+"','"+city+"','"+address+"','"+mobileNo+"','"+dob+"')");
    stmt.executeUpdate(query);
    out.println("Account created Successfully");

%>
<%--<font color="red" size="5">Record inserted successfully</font>--%>

<%

    }catch(Exception ee) {

        out.println(ee.toString());

    } %>

<a href="login.jsp">click here to Login</a>

</body>
</html>

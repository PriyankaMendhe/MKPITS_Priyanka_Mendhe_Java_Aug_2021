<%@ page import="java.sql.*" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page  errorPage="LoginFail.jsp"  %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>

<%
      String name1 = request.getParameter("uname");
      String password1 = request.getParameter("pass");

%>
<%

try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","root");
%>
<%
    //out.println("Successfully Database Connected");

        PreparedStatement ps=con.prepareStatement("select * from reguser1 where uname=? and password=?");
        ps.setString(1,name1);
        ps.setString(2,password1);
        ResultSet rs = ps.executeQuery();

        if(rs.next())
        {
            session.setAttribute("username",name1);
            response.sendRedirect("dashboard.jsp");

        }
        else
        {
            response.sendRedirect("LoginFail.jsp");

        }
//String query=("insert into userlogin values ('"+name+"','"+password+"')");
//stmt.executeUpdate(query);

%>
<font color="red" size="5">Record inserted successfully</font>

<%
            //out.println("Record inserted Successfully");
        }catch(Exception ee) {

    out.println(ee.toString());

        } %>


</body>
</html>
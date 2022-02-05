<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
 <%

     int a=3, b=25;

     if(a>b){

 %>

 <h1>a is greater</h1>

 <%
     }
     else
     {
 %>
<%-- <h1>b is greater</h1>--%>
 <font color="blue" size="15">b is greater</font>

<%
    }

%>

<br/>



</body>
</html>
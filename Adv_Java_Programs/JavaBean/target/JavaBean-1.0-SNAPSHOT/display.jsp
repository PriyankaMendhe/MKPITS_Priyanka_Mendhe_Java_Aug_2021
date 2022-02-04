<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2/4/2022
  Time: 4:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>display</title>
</head>
<body>
<jsp:useBean id="user" class="com.example.javabean.userBean"></jsp:useBean>

<%--<jsp:setProperty name="user" property="uname"></jsp:setProperty>--%>
<%--<jsp:setProperty name="user" property="pass"></jsp:setProperty>--%>
<%--<jsp:setProperty name="user" property="city"></jsp:setProperty>--%>
<%--<jsp:setProperty name="user" property="mobno"></jsp:setProperty>--%>

<%--for all in one property by using *--%>
<jsp:setProperty name="user" property="*"></jsp:setProperty>

<%--to get data on screen set property--%>
<h1>Welcome User <jsp:getProperty name="user" property="uname"/></h1><br><br>
<h1>Welcome User Password <jsp:getProperty name="user" property="pass"/></h1><br><br>
<h1>Welcome User City <jsp:getProperty name="user" property="city"/></h1><br><br>
<h1>Welcome User Mobile No. <jsp:getProperty name="user" property="mobno"/></h1><br><br>


</body>
</html>

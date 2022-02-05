<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Display Page</title>
</head>
<body>
<h2>Hello this is a display1.jsp Page</h2>
My name is: <%=request.getParameter("name") %><br>
Website: <%=request.getParameter("site") %><br>
Topic: <%=request.getParameter("topicname") %><br>
Forward Request came from the page: <%=request.getParameter("reqcamefrom") %>


</body>
</html>


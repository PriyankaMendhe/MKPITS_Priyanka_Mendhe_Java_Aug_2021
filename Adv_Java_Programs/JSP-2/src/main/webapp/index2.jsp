<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP forward example with parameters</title>
</head>
<body>

<jsp:forward page="display1.jsp">
    <jsp:param name="name" value="Priyanka" />
    <jsp:param name="site" value="mkpits.com" />
    <jsp:param name="topicname" value="jsp forward action" />
    <jsp:param name="reqcamefrom" value="index2.jsp" />

</jsp:forward>

</body>
</html>
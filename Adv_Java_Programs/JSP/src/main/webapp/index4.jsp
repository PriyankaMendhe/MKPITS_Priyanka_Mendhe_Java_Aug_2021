<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
  <%
      int i;
      String c[]={"blue","red","yellow","black","green","brown","chocolate","aqua","cyan","black"};

      for(i=0;i<10;i++)
      {
//          out.println(i);
  %>

<%--  <font color="<%= " "+c[i]%>   size=" <%= ""+i %>">--%>
  <font color="<%= " "+c[i]%>"   size="25">
  <%= i %>
  </font>
  <br>
  <%
      }
  %>






</body>
</html>
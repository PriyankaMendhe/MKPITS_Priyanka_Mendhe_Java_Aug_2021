<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2/2/2022
  Time: 11:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
     <link href="dashboard.css" rel="stylesheet">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Dashboard</title>
</head>
<body>

<%
    String welcomeName=(String) session.getAttribute("username");
//    out.println("Welcome "+welcomeName);
%>



<div class="p-3 mb-2 bg-dark text-white" style="text-align: center; "  >
    <font size="5" >Welcome <%= ""+welcomeName.toUpperCase()%> ! </font>


<%--    <font size="5"> <a href="login.jsp">Back</a> </font>--%>
    <div class="dropdown" align="Right" >
        <button class="btn btn-light dropdown" type="button" id="dropdownMenuButton2" data-bs-toggle="dropdown" aria-expanded="false">
            <%= ""+welcomeName.toUpperCase()%><br><font size="1"><sup>Account</sup></font>
        </button>
        <ul list type="none" class="dropdown-menu dropdown-menu" aria-labelledby="dropdownMenuButton2">
            <li><a class="dropdown-item active" href="#">Profile</a></li>
            <li><a class="dropdown-item" href="login.jsp">Log out</a></li>
        </ul>
    </div>



</div>

<!-- The sidebar -->
<div class="sidebar" >
    <a href="AddRecord.jsp">Add Record</a>
    <a href="UpdateRecord.jsp">Update Record</a>
    <a href="ViewRecord.jsp">View Record</a>
    <a href="DeleteRecord.jsp">Delete Record</a>

</div>

<!-- Page content -->
<div class="content">



</div>

<!-- Optional JavaScript; choose one of the two! -->

<!-- Option 1: Bootstrap Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

<!-- Option 2: Separate Popper and Bootstrap JS -->
<!--
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
-->


</body>
</html>

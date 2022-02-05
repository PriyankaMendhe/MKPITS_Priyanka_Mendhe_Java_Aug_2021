<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 2/2/2022
  Time: 4:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SignUp</title>
</head>
<body>

<form action="registrationProcess.jsp">
    <h1>Create your Account</h1>
    <table>
        <tr>
            <td>Username</td>
            <td><input type="text" name="uname"></td>

        </tr>

        <tr>
            <td>Password</td>
            <td><input type="password" name="pass"></td>

        </tr>

        <tr>
            <td>City</td>
            <td><select name="city">
                <option>Nagpur</option>
                <option>Mumbai</option>
                <option>Pune</option>
                <option>Banglore</option>
                </select>
            </td>

        </tr>

        <tr>
            <td>Address</td>
            <td><input type="text" name="address"></td>

        </tr>
        <tr>
            <td>Mobile No</td>
            <td><input type="text" name="mobileNo"></td>

        </tr>

        <tr>
            <td>Date of Birth</td>
            <td><input type="date" name="dob"></td>

        </tr>

        <tr>
            <td></td>
            <td><input type="Submit" ></td>

        </tr>

    </table>
</form>

</body>
</html>

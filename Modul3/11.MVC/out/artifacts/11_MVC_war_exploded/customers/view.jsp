<%--
  Created by IntelliJ IDEA.
  User: Au
  Date: 1/26/2021
  Time: 11:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View customer</title>
</head>
<body>
<h1>Customer details</h1>
<p>
    <a href="/customers">Back to customer list</a>
</p>
<table>
    <tr>
        <td>Name: </td>
        <td>${requestScope["customers"].getName()}</td>
    </tr>
    <tr>
        <td>Email: </td>
        <td>${requestScope["customers"].getEmail()}</td>
    </tr>
    <tr>
        <td>Address: </td>
        <td>${requestScope["customers"].getAddress()}</td>
    </tr>
</table>
</body>
</html>

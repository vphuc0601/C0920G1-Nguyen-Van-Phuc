<%--
  Created by IntelliJ IDEA.
  User: Au
  Date: 2/3/2021
  Time: 5:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
<form method="post" >
    ID:<input type="number" name="id" value="${student_edit.student_id}">
    Name:<input type="text" name="name" value="${student_edit.student_name}">
    Age:<input type="number" name="age" value="${student_edit.student_age}">
    Birthday:<input type="date" name="birthday" value="${student_edit.student_birthday}">
    Email:<input type="text" name="email" value="${student_edit.student_email}">
    Address:<input type="text" name="address" value="${student_edit.student_address}">
</form>
</body>
</html>

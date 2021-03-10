<%--
  Created by IntelliJ IDEA.
  User: Au
  Date: 3/10/2021
  Time: 3:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Converter</title>
</head>
<body>
<form action="/converter" method="post">
    <h1>Currency Converter</h1>
    <h4>Rate</h4>
    <input type="number" name="rate" placeholder="rate">
    <h4>USD</h4>
    <input type="number" name="usd" placeholder="0">
    <button type="submit">Converter</button>
</form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Au
  Date: 1/25/2021
  Time: 2:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Simple Caculator</title>
  </head>
  <body>
  <table border="1">
    <tr>
      <a>Number1:</a><input type="number" name="num1">
    </tr>
    <tr>Operator: <select name="operator">
    <option value="Addition">Addtition</option>
    <option value="Subtraction">Subtraction</option>
    <option value="Multiplication">Multiplication</option>
    <option value="Division">Division</option>
  </select>
    </tr>
    <tr>
      <a>Number2:</a><input type="number" name="num2">
    </tr>
    <tr><button type="submit" name="Result">Caculate</button></tr>
  </table>
  </body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Au
  Date: 3/30/2021
  Time: 4:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>home</title>
</head>
<body>
<h1>CALCULATOR</h1>
<form action="/caculator" method="post">
    <table>
        <tr>
            <td colspan="2"><input type="number" name="num1"></td>
            <td colspan="2"><input type="number" name="num2"></td>
        </tr>
        <tr>
            <td><button type="submit" name="caculator" value="addition(+)">Addition(+)</button></td>
            <td><button type="submit" name="caculator" value="subtraction(-)">Subtraction(-)</button></td>
            <td><button type="submit" name="caculator" value="multiplication(x)">Multiplication(x)</button></td>
            <td><button type="submit" name="caculator" value="division(/)">Division(/)</button></td>
        </tr>
    </table>
</form>
<h3>Result: ${result} ${message}</h3>

</body>
</html>
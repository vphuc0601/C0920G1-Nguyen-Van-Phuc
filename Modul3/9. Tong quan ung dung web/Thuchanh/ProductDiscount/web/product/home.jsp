<%--
  Created by IntelliJ IDEA.
  User: Au
  Date: 3/10/2021
  Time: 4:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<form method="post" action="/discount">
<h1>Product</h1>
<h3>Product Decription:</h3>
<input type="text" name="decription" placeholder="Product Decription">
<h3>List price:</h3>
<input type="number" name="price" placeholder="List price">
<h3>Discount percent:</h3>
<input type="number" name="discount" placeholder="Discount percent">%
<h3><button type="submit">Calculate Discount</button></h3>
</form>
</body>
</html>

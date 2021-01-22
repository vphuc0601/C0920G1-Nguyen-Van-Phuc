<%--
  Created by IntelliJ IDEA.
  User: Au
  Date: 1/22/2021
  Time: 1:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<head>
    <title>Discount</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<br>
<h2>Product Discount Calculator</h2>
<form method="post" action="/display-discount">
    <label>Product: </label><br/>
    <input type="text" name="product" placeholder="PRODUCT" size="30"><br/>
    <label>List Price: </label><br/>
    <input type="text" name="price" placeholder="PRICE" value="0"><br/>
    <label>Discount Percent: </label></br>
    <input type="text" name="discount" placeholder="DISCOUNT" value="0"><a>%</a></br>
    <input type="submit" id="submit" value="Calculate Discount" >
</form>
</body>
</html>
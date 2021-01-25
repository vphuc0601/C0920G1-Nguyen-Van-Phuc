<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Au
  Date: 1/25/2021
  Time: 2:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>Customers</title>
</head>

<body>
<table border="1">
    <h1>CUSTOMERS</h1>

    <tr>
        <th>Name</th>
        <th>Dateofbirth</th>
        <th>Address</th>
        <th>Image</th>
    </tr>
    <c:forEach var="customers" items="${customerslist}">
        <tr>
       <td> <c:out value="${customers.name}"></c:out></td>
       <td> <c:out value="${customers.dateofbirth}"></c:out></td>
       <td> <c:out value="${customers.getAddress()}"></c:out></td>
       <td>
           <img src="${customers.image}" width="80" height="100" />
       </td>

        </tr>
    </c:forEach>
</table>
</body>

</html>

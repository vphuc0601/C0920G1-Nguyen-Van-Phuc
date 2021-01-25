<%--
  Created by IntelliJ IDEA.
  User: Au
  Date: 1/25/2021
  Time: 1:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customers</title>
</head>
<body><table border="1">

        <tr>
            <th>Name</th>
            <th>Dateofbirth</th>
            <th>Address</th>
            <th>Image</th>
        </tr>
        <c:forEach var="customers" items="${customerslist}">
            <tr>
                <td><c:out value="${customers.getName}"/> </td>
                <td><c:out value="${customers.getDateofbirth}"/> </td>
                <td><c:out value="${customers.getAddress}"/></td>
                <td><c:out value="${customers.getImage}"/></td>
            </tr>
        </c:forEach>
    ${tmp}
    <c:out value="${tmp}" />

</table>
</body>
</html>
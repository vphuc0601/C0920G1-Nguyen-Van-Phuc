<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>Product Manager</title>
</head>
<body>
<center>
  <h1>Product Management</h1>
  <h2>
    <a href="/product?action=create">Add New User</a>
  </h2>
  <h2>Search Product</h2>
  <%--    <input type="text" href="/users?action=search">--%>
  <tr>
    <form action="/product">
      <td>
        <input type="text" name="name" id="name" size="15"/>
        <input type="hidden" name="action" value="search">
      </td>
      <td><button type="submit">SEARCH</button></td>
    </form>
  </tr>

</center>
<div align="center">
  <table border="1" cellpadding="5">
    <caption><h2>List of Product</h2></caption>
    <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Color</th>
      <th>Actions</th>
    </tr>
    <c:forEach var="product" items="${productList}">
      <tr>
        <td><c:out value="${product.id}"/></td>
        <td><c:out value="${product.name}"/></td>
        <td><c:out value="${product.color}"/></td>

        <td>
          <a href="/product?action=edit&id=${product.id}">Edit</a>
          <a href="/product?action=delete&id=${product.id}">Delete</a>

        </td>
      </tr>
    </c:forEach>
  </table>
</div>
</body>
</html>
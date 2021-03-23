<%--
  Created by IntelliJ IDEA.
  User: Au
  Date: 3/15/2021
  Time: 11:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
    <title>List</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<h1 style="text-align: center;color: #007bff" >USER MANAGER</h1>

<a href="/user?action=create">
    <button type="submit" class="btn btn-outline-primary">Create New User</button>
</a>
<form method="post" action="/user?action=searchByName">
    <input type="text" name="name" placeholder="Search by Name" >
    <button type="submit" >SEARCH</button>
</form>
<form method="post" action="/user?action=searchByCountry">
    <input type="text" name="country" placeholder="Search By Country" >
    <button type="submit" value="country">SEARCH</button>
</form>
<table class="table table-bordered table-hover">
    <thead>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Country</th>
    </tr>
    </thead>
    <c:forEach var="user" items="${userList}">
        <tr>
            <td> <c:out value="${user.id}"></c:out></td>
            <td> <c:out value="${user.name}"></c:out></td>
            <td> <c:out value="${user.email}"></c:out></td>
            <td> <c:out value="${user.country}"></c:out></td>
            <td>
                <a href="/user?action=edit&id=${user.id}">
                <button class="btn btn-outline-primary">EDIT</button>
                </a>
            </td>
            <td>
                <a href="/user?action=delete&id=${user.id}">
                    <button class="btn btn-outline-primary">DELETE</button>
                </a>
            </td>
        </tr>
    </c:forEach>
</table>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>
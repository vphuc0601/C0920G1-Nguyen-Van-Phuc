<%--
  Created by IntelliJ IDEA.
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>List student</title>

</head>
<body>
    <table border="1">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Date of birth</th>
            <th>Gender</th>
            <th>Rank</th>
            <th>Action</th>
        </tr>
<%--        <%--%>
<%--            List<Student> studentListAbc =--%>
<%--                    (List<Student>) request.getAttribute("studentListFromServlet");--%>
<%--            for (Student student : studentListAbc) {--%>
<%--        %>--%>
<%--        <tr>--%>
<%--            <td><%=student.getId()%></td>--%>
<%--            <td><%=student.getName()%></td>--%>
<%--            <td><%=student.getDateOfBirth()%></td>--%>
<%--        </tr>--%>
<%--        <%--%>
<%--            }--%>
<%--        %>--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<c:forEach var="product" items="${productListFromServlet}">
    <tr>
        <td><c:out value="${product.id}"/></td>
        <td><c:out value="${product.name}"/></td>
        <td><c:out value="${product.color}"/></td>


        <td>
            <a href="/studentServlet?actionUser=update&id=${student.id}">Update</a>
        </td>
    </tr>
</c:forEach>
</table>
${tmp}
<c:out value="${tmp}" />
<%--    <c:set scope=""--%>
</body>
</html>

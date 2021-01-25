<%--
  Created by IntelliJ IDEA.
  User: Au
  Date: 1/25/2021
  Time: 12:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>

<%!
    Map<String, String> dic = new HashMap<>();
%>

<%
    dic.put("hello", "Xin chào");
    dic.put("how", "Thế nào");
    dic.put("book", "Quyển vở");
    dic.put("computer", "Máy tính");

    String word = request.getParameter("word");

    String result = dic.get(word);
    if (result != null) {
        out.println("Result: " + result);
    } else {
        out.println("Not found");
    }
%>

</body>
</html>
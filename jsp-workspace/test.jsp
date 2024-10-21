<%@ page contentType="text/html; charset=utf-8" import="java.util.Date" %>
<html>
<head>
</head>
<body>
    <h1>index</h1>
    <h2>current time</h2>
    <%
        Date time = new Date();
        out.println(time);
    %>
</body>
</html>
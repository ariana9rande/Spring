<%@ page language="java" contentType="text/html; charset=utf-8" %>
<html>
<head>
	<title> request 객체 </title>
</head>
<body>
	<%
	String id = request.getParameter("strID");
	String pass = request.getParameter("strPwd");

	out.println("아이디: " + ID + "<br>");
	out.println("비밀번호: " + pass);
	%>
</body>
</html>
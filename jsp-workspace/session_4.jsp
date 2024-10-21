<%@ page language="java" contentType="text/html; charset=utf-8"%>
<html>
<body>
	<%
	String id = (String)session.getAttribute("ID");
	out.println(id + "님 안녕히 가세요.");
	session.invalidate();
	%>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=utf-8" %>
<HTML>
<BODY>
	<%
	String id = (String)session.getAttribute("ID");
	if(id != null)
	{
	long lastTime = session.getLastAccessedTime();
	long createTime = session.getCreationTime();
	long useTime = (lastTime - createTime) / 1000;
	%>
	<%=id%> 님은 <%=useTime %> 초 동안 사이트에 접속되어 있습니다. 
	<%
	}
	else
	{
		out.println("<p> 먼저 로그인을 하세요. </p>"
		+ "<form action='session_1.jsp' method='post'>"
		+ "<input Type='Submit' Value='로그인'> </form>");
	}
	%>
</BODY>
</HTML>
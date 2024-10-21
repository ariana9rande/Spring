<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head> <meta charset="UTF-8"> </head>
<body>
<h1> Member List </h1>
<ul>
<c:forEach var="member" items="${members}" varStatus="status">
<li> ${status.index+1} : ${member.name}, ${member.email},
${member.registerDateTime} </li>
</c:forEach>
</ul>
</body>
</html>
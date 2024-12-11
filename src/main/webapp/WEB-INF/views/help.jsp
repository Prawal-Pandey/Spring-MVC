<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*,java.time.LocalDateTime"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>

	<%
	String name = (String) request.getAttribute("name");
	%>

	<h1>
		My name is
		<%=name%></h1>

	<%
	LocalDateTime time = (LocalDateTime) request.getAttribute("time");
	%>

	<h2>
		The time is
		<%=time%>
	</h2>


</body>
</html>
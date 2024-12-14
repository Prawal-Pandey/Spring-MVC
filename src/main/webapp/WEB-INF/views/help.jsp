<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*,java.time.LocalDateTime"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>

	<%-- 	<% --%>
	<!-- 	 String name = (String) request.getAttribute("name"); -->
	<%-- 	%> --%>

	<h1>
		My name is ${name}
		<%-- 		<%=name%> --%>
	</h1>

	<%-- 	<% --%>
	<!-- 	 LocalDateTime time = (LocalDateTime) request.getAttribute("time"); -->
	<%-- 	%> --%>

	<h2>
		The time is ${time}
		<%-- 		<%=time.toString()%> --%>
	</h2>

	<h3>Languages : ${lang }</h3>


	<hr>
	<c:forEach var="item" items="${lang}">
		<h3>${item}</h3>
		<h1>
			<c:out value="${item }"></c:out>
		</h1>
	</c:forEach>

</body>
</html>
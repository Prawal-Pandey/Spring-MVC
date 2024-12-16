<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Process Form Details</title>
</head>
<body style="color: orange; background-color: black">
	<h1 style="color: green; background-color: black">${msg }</h1>
	<h1>${user.email }<br> ${user.name }<br>
		${user.password}<br>
	</h1>
</body>
</html>
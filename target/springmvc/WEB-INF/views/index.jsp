<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>This is Home Page</h1>
	<h2>Called By Home Controller</h2>
	<h3>url /home</h3>


	<%
	String name = (String) request.getAttribute("name");
	%>

	<h1>
		Name is
		<%=name%></h1>


	<a href="contact.jsp"><button>Contact Page</button></a>

	<%
	List<String> friends = (List<String>) request.getAttribute("list");
	%>

	<%
	for (String s : friends) {
	%>

	<h2><%=s%></h2>
	<%
	}
	%>
</body>
</html>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<%
	String name = (String) request.getAttribute("name");
	String rollno = (String) request.getAttribute("rollno");
	ArrayList<String> friends = (ArrayList<String>) request.getAttribute("f");
	%>
	<h1><%=name%></h1>
	<h1><%=rollno%></h1>

	<%
		for (String s : friends) {
	%>
	   <h1><%=s %></h1>
	<%
		}
	%>

</body>
</html>
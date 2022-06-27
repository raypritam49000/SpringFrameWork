<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
	<!--  
<%
String id = (String)request.getAttribute("id");
String name = (String)request.getAttribute("name");
String fees = (String)request.getAttribute("fees");
%>

<h1><%=id %></h1>
<h1nameame %></h1>
<h1feesees %></h1>
-->

	<!-- Expression Language -->

	<h1>${id}</h1>
	<h1>${name}</h1>
	<h1>${fees}</h1>
	
	<c:forEach var="item" items="${marks}">
	  <h1>${item}</h1>
	</c:forEach>
	
</body>
</html>
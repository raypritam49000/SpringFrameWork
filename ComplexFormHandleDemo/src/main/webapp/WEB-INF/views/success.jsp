<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${student }</h1>
<h1>Name : ${student.name}</h1>
<h1>Id : ${student.id }</h1>
<h1>Date Of Birth : ${student.date}</h1>
<h1>City : ${student.address.city}</h1>
<h1>Street : ${student.address.street}</h1>
<h1>Courses : ${student.courses}</h1>
<h1>Phone : ${student.phone}</h1>
</body>
</html>
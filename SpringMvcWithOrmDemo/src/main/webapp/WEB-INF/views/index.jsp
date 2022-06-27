<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<form action="showData" method="post">
	  <h1>${Header}</h1>
	  <p>${Desc }</p>
		<table border="2px solid red">
			<tr>
				<td>Name</td>
				<td><input name="name" type="text" required="required"
					placeholder="Enter Here"></td>
			</tr>
			
			<tr>
				<td>Email</td>
				<td><input name="email" type="email" required="required"
					placeholder="Enter Here"></td>
			</tr>
			
			<tr>
				<td>Password</td>
				<td><input name="password" type="password" required="required"
					placeholder="Enter Here"></td>
			</tr>
			
			<tr>
				<td>Phone</td>
				<td><input name="phone" type="tel" required="required"
					placeholder="Enter Here"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit"></td>
				<td><input type="reset" value="Reset"></td>
			</tr>
		</table>
	</form>
</body>
</html>
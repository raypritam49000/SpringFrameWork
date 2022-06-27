<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-3">

		<div class="row">
			<div class="col-md-8 offset-md-2">
				<h1 class="text-center mt-2">Welcome To Product App</h1>

				<table class="table mt-2">
					<thead>
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Product Name</th>
							<th scope="col">Product Price</th>
							<th scope="col">Product Descriptions</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach var="p" items="${list}">
						<tr>
							<th scope="row">TechOnly${p.id }</th>
							<td>${p.name}</td>
							<td class="font-weight-bold">&#8377; ${p.price}</td>
							<td>${p.description}</td>
							<td>
							<a href="delete/${p.id}"><i class="fas fa-trash-alt text-danger" style="font-size: 20px"></i></a>
							<a href="update/${p.id}"><i class="fas fa-pen-nib text-primary" style="font-size: 20px"></i></a>
							</td>
						</tr>
					</c:forEach>	
					</tbody>
					
				</table>
				<div class="container text-center">
					  <a href="addproduct" class="btn btn-outline-success">ADD PRODUCTS</a></div>
			</div>

		</div>

	</div>
</body>
</html>
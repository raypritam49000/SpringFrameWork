<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<%@include file="./base.jsp" %>
</head>
<body>
<div class="continer">
  <div class="row mt-3">
    <div class="col-md-6 offset-md-3">
        <h1 class="text-center mt-2">Change Product Details</h1>
        <form action="${pageContext.request.contextPath}/handleProduct" method="post">
        
        <div class="form-group">
            <label for="id">Enter Product Id</label>
            <input type="text" value="${product.id }" id="id" name="id" class="form-control" required="required"/>
           </div>
           
           <div class="form-group">
            <label for="name">Enter Product Name</label>
            <input type="text" value="${product.name }" id="name" name="name" class="form-control" placeholder="Enter Product Name" required="required"/>
           </div>
           
           <div class="form-group">
            <label for="price">Enter Product Price</label>
            <input type="text" value="${product.price }" id="price" name="price" class="form-control" placeholder="Enter Product Price" required="required"/>
           </div>
           
           <div class="form-group">
            <label for="description">Enter Product Description</label>
            <input type="text" value="${product.description }"id="description" name="description" class="form-control" placeholder="Enter Product Description" required="required"/>
           </div>
           
           <div class="container text-center">
              <button type="submit" class="btn btn-outline-success">Update</button>
              <a href="${pageContext.request.contextPath}/" class="btn btn-outline-danger">Back</a>
           </div>
        </form>
    </div>
  </div>
</div>
</body>
</html>
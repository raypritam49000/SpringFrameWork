<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>   
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<Html>  
<head>   
<title>Registration Page</title>
<link href="<c:url value="/resources/css/style.css"/>"></link>  
<script src="<c:url value="/resources/js/script.js"/>"></script>
</head>  
<body>  
<br>  
<br>  
<img alt="my image" src="<c:url value="/resources/image/group.png"/>" />
<h1><form:errors path="student.*"></form:errors></h1>
<form action="handle" method="post">  
  
<label> Name : </label>         
<input type="text" name="name" size="30" placeholder="Enter Name"/> <br> <br> 

<label> Street : </label>         
<input type="text" name="address.street" size="30" placeholder="Enter Street"/> <br> <br> 

<label> City : </label>         
<input type="text" name="address.city" size="30" placeholder="Enter City"/> <br> <br> 
 
<label> Id : </label>         
<input type="text" name="id" size="30" placeholder="Enter Id"/> <br> <br> 

<label> Date Of Birth : </label>         
<input type="text" name="date" size="30" placeholder="dd/mm/yyyy"/> <br> <br> 

<label> Course : </label>   
<select name="courses">  
<option value="Course">Course</option>  
<option value="BCA">BCA</option>  
<option value="BBA">BBA</option>  
<option value="B.Tech">B.Tech</option>  
<option value="MBA">MBA</option>  
<option value="MCA">MCA</option>  
<option value="M.Tech">M.Tech</option>  
</select>  
<br><br> 
 
<label>Gender : </label><br>  
<input type="radio" name="gender" value="male"/> Male <br>  
<input type="radio" name="gender" value="female"/> Female <br>  
<input type="radio" name="gender" value="other"/> Other <br><br>  
  
<label>Phone :</label>  
<input type="text" name="country code"  value="+91" size="2"/>   
<input type="text" name="phone" size="10"/> <br> <br>  

<input type="submit" value="Submit"/>  
</form>  
</body>  
</html>
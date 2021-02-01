<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee-List</title>
		<link rel="stylesheet" href="/Employee-Management/URLToReach/css/mystyle.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<body>

	<%
		response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");

		if (session.getAttribute("username") == null) {

			response.sendRedirect("login.jsp");
		}
	%>



<div class="container">

	<h1 align="center" style="padding-top: 30px">Employee-List</h1>
	<div align="center" style="padding-top: 15px">
		<form action="showaddEmployee">
			<input type="submit" value="ADD" class="btn btn-primary">
		</form><br><br>
	</div>


	<table border="1" align="center" class="table">
		<thead>
			<tr>

				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
				<th>Address</th>
				<th>Salary</th>
				<th colspan="2">Action</th>

			</tr>
		</thead>
		<c:forEach var="stu" items="${employees }">
			<tr>
				<td>${stu.id}</td>
				<td>${stu.name}</td>
				<td>${stu.email}</td>
				<td>${stu.address}</td>
				<td>${stu.salary}</td>
				<td><a
					onclick="return confirm('Do you want to Update this Employee')"
					href="/Employee-Management/updateEmployee?userid=${stu.id}" class="btn btn-success">Update</a></td>
				<td><a
					onclick="return confirm('Do you want to Delete this Employee')"
					href="/Employee-Management/deleteEmployee?userid=${stu.id}" class="btn btn-primary">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<br>
	<div align="center">



		<form action="logout">
			<a href="/Employee-Management/" class="btn btn-success">Back</a> 
			<input type="submit"
				value="logout" class="btn btn-danger">

		</form>
	</div>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add-Employee</title>
<link rel="stylesheet"
	href="/Employee-Management/URLToReach/css/mystyle.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">


</head>
<body>

	<div align="center">
		<%
			response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");

			if (session.getAttribute("username") == null) {

				response.sendRedirect("login.jsp");
			}
		%>
		<h3 style="padding-top: 30px">Add Employe</h3>

		<form:form action="saveEmployee" method="post"
			modelAttribute="employees">
			<form:hidden path="id" />

			<label>Name</label>
			<form:input path="name" />
			<br>
			<br>
			<label>email</label>
			<form:input path="email" />
			<br>
			<br>
			<label>Address</label>
			<form:input path="address" />
			<br>
			<br>
			<label>Salary</label>
			<form:input path="salary" />
			<br>
			<br>
			<input type="submit" value="Submit" class="btn btn-primary" />

		</form:form>
	</div>
</body>
</html>
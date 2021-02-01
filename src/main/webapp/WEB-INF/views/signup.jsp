<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon"
	href="https://getbootstrap.com/docs/4.0/assets/img/favicons/favicon.ico">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

<title>Employee-Management</title>


<link rel="canonical"
	href="https://getbootstrap.com/docs/4.0/examples/sign-in/">

<!-- Bootstrap core CSS -->
<link href="./Signin Template for Bootstrap_files/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="./Signin Template for Bootstrap_files/signin.css"
	rel="stylesheet">
			<link rel="stylesheet" href="/Employee-Management/URLToReach/css/mystyle.css">
	
</head>
<body>




	<div class="container" align="center">
	<br><br>
		<h1 style="color: red">Employee-Management System</h1><br>
		<h3>Sign Up</h3>

		<form:form modelAttribute="admin" action="savelogin" method="post">

			<label>Username:-</label>
			<form:input path="username"/>
			<br>
			<br>
			<label>Password:-</label>
			<form:input path="password" />
			<br>
			<br>
			<input type="submit" value="Register" class="btn btn-primary">
			<a style="padding-left: 10px;" href="/Employee-Management/login" class="btn btn-success">Log-In</a>
		</form:form>

	</div>
</body>
</html>
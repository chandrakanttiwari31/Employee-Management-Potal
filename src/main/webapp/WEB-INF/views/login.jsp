<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" href="/Employee-Management/URLToReach/css/mystyle.css">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

<title>Log-In</title>
</head>
<body>

	<div class="container" align="center" style="padding-top: 50px">
		<h1>Please Login</h1>

		<form action="login" method="get">

			Username:-<input type="text" name="uname" required><br>
			<br> Password:-<input type="password" name="pass" required><br>
			<br> <input type="submit" value="login" class="btn btn-primary"> <a
				href="/Employee-Management/signup" style="padding-left: 10px;" class="btn btn-success">Sign-Up</a>
				<a 
				href="/Employee-Management/" style="padding-left: 10px;" class="btn btn-warning">Home</a>

		</form>


	</div>
</body>
</html>
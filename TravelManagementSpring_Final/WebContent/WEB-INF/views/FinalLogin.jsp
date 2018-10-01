<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align:center">
	<h2>Welcome to UserLogin</h2>
	<form action="loginvalidate" method="get">
	<table align="center">
	<tr >
	<td>Username</td> <td><input type="text" name="username" required></td>
	</tr>
	<tr>
	<td>Password</td> <td><input type="password" name="password" required></td>
	
	</tr>
	</table>
	<input type="submit">
	</form>
</body>
</html>
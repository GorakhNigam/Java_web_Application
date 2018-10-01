<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align:center">
	<h3>Welcome ${employeeLogin.username} <h3>
	<a href="addempl">New Travel plan</a><br>
	<a href="viewprevplan?username=${employeeLogin.username}">Show all The previous Plan</a><br>
	<a href="updateempl?username=${employeeLogin.username}">Update the last Plan </a><br>
	<!-- <a href="FinalLogin.jsp">Back</a> -->
</body>
</html>
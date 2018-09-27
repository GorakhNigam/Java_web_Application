<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="2">
		<tr>
			<th>Emplcode</th><th>EmpName</th><th>job</th><th>salary</th><th>DOJ</th>			
		</tr>
		<c:forEach var="emp" items="${empList}">
		<tr>
			<td><c:out value="${emp.empcode}"></c:out></td>
			<td><c:out value="${emp.empname}"></c:out></td>
			<td><c:out value="${emp.job}"></c:out></td>
			<td><c:out value="${emp.salary}"></c:out></td>
			<td><c:out value="${emp.doj}"></c:out></td>
			
			<td><a href="updateempl?code=${emp.empcode}">Update</a></td>
			<td><a href="deleteempl?code=${emp.empcode}">Delete</a></td>
		</tr>
		</c:forEach>
	</table>
	<a href="home">Back</a>
</body>
</html>
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
		<table border="1">
		<tr>
			<th>SerialNo</th><th>EmployeeName</th><th>EmpId</th><th>Source</th><th>Destination</th><th>TravelPurpose</th><th>TravelMode</th>
			<th>TravelExpense</th><th>Duration</th><th>Status</th><th>Submit</th>	
		</tr>
		<c:forEach var="emp" items="${empls}">
		<tr>
			<form action="logistic?serialNo=${emp.serialNo}" method="post">
			<!-- <input type="text" name="serialNo" value="<c:out value="${emp.serialNo}"></c:out>"></td> -->
			<td><c:out value="${emp.serialNo}"></c:out></td>
			<td><c:out value="${emp.employeeName}"></c:out></td>
			<td><c:out value="${emp.emailId}"></c:out></td>
			<td><c:out value="${emp.source}"></c:out></td>
			<td><c:out value="${emp.destination}"></c:out></td>
			<td><c:out value="${emp.travelPurpose}"></c:out></td>
			<td><c:out value="${emp.travelMode}"></c:out></td>
			<td><input type="text" name="travelExpense" value="<c:out value="${emp.travelExpense}"></c:out>"></td>
			<td><c:out value="${emp.duration}"></c:out></td>			
			<td><c:out value="${emp.status}"></c:out></td>
			<td><input type="submit"></td>
			</form>
		</tr>
		</c:forEach>
		</table>
</body>
</html>
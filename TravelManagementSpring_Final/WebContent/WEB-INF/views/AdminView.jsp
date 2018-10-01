<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head> --%>
<%-- <meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="admin" method="post">
	<table>
	<tr>
		<td>SerialNo </td>  <td><c:out value="${empls.serialNo}"></c:out></td>
		</tr>
		<tr>
		<td>Employee Name </td>  <td><c:out value="${empls.employeeName}"></c:out></td>
		</tr>
		<tr>
		<td>Employee Id </td> <td><c:out value="${empls.emailId}"></c:out></td>
		</tr>
		<tr>
		<td>Source </td> <td><c:out value="${empls.source}"></c:out></td>
		</tr>
		<tr>
		<td>Destination </td><td><c:out value="${empls.destination}"></c:out></td>
		</tr>
		<tr>
		<td>Travel Purpose </td> <td><c:out value="${empls.travelPurpose}"></c:out></td>
		</tr>
		<tr>
		<td>Travel Mode </td> <td><c:out value="${empls.travelMode}"></c:out></td>
		</tr>
		<tr>
		<td>Duration </td> <td><c:out value="${empls.duration}"></c:out></td>
		</tr>
		<tr>
		<td style="color:red">Status </td> <td><input type="text" name="status" value="<c:out value="${empls.status}"></c:out>"></td>
		</tr>
	</table>
		<input type="submit">
	</form>	
</body>
</html> --%>

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
			<th>TravelExpense</th><th>Duration</th><th>Status</th>		
		</tr>
		<c:forEach var="emp" items="${empls}">
		<tr>
			<form action="admin?serialNo=${emp.serialNo}" method="post">
			<!-- <td><input type="text" name="serialNo" value="<c:out value="${emp.serialNo}"></c:out>"></td> -->
			<td><c:out value="${emp.serialNo}"></c:out></td>
			<td><c:out value="${emp.employeeName}"></c:out></td>
			<td><c:out value="${emp.emailId}"></c:out></td>
			<td><c:out value="${emp.source}"></c:out></td>
			<td><c:out value="${emp.destination}"></c:out></td>
			<td><c:out value="${emp.travelPurpose}"></c:out></td>
			<td><c:out value="${emp.travelMode}"></c:out></td>
			<td><c:out value="${emp.duration}"></c:out></td>			
			<td><input type="text" name="status" value="<c:out value="${emp.status}"></c:out>"></td>
			<td><input type="submit"></td>
			</form>
		</tr>
		</c:forEach>
		
		</table>
</body>
</html>
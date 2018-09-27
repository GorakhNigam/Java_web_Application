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
				
	<form action="updateempl" method="post">
		Employee code  <input  type="text"   name="empcode" value="<c:out value="${empls.empcode}"></c:out>"> <br>
		Employee Name <input type="text" name="empname" value="<c:out value="${empls.empname}"></c:out>"><br>
		Employee Job <input type="text" name="job" value="<c:out value="${empls.job}"></c:out>"><br>
		Employee Salary <input type="text" name="salary" value="<c:out value="${empls.salary}"></c:out>"><br>
		Employee DOJ <input type="date" name="doj" value="<c:out value="${empls.doj}"></c:out>"><br>
		<input type="submit">
	</form>	
		
</body>
</html>
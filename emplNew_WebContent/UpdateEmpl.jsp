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
				
	<form action="UpdateEmpl" method="post">
		Employee code  <input  type="text"   name="empcode" value="<c:out value="${empls.empcode}"></c:out>"> <br>
		Employee Name <input type="text" name="empname" value="<c:out value="${empls.empname}"></c:out>"><br>
		Employee Job <input type="text" name="job" value="<c:out value="${empls.job}"></c:out>"><br>
		Employee Salary <input type="text" name="salary" value="<c:out value="${empls.salary}"></c:out>"><br>
		Employee DOJ <input type="date" name="doj" value="<c:out value="${empls.doj}"></c:out>"><br>
		<input type="submit">
	</form>	
		<%-- <jsp:useBean id="emp" class="com.virtusa.empls.beans.Employee"></jsp:useBean>
		<jsp:setProperty property="*" name="emp"/>
		<jsp:setProperty property="empcode" name="emp" ></jsp:setProperty>
		<jsp:setProperty property="empname" name="emp" ></jsp:setProperty>
		<jsp:setProperty property="job" name="emp" ></jsp:setProperty>
		<jsp:setProperty property="salary" name="emp" ></jsp:setProperty>
		<jsp:setProperty property="doj" name="emp" ></jsp:setProperty> --%>
		
</body>
</html>
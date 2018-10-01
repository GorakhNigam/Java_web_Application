<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="emp" class="com.virtusa.empls.beans.Employee"></jsp:useBean>
	<jsp:setProperty property="empcode" name="emp" value=""></jsp:setProperty>
	<jsp:setProperty property="empname" name="emp" value="virtusa"></jsp:setProperty>
	<jsp:setProperty property="salary" name="emp" value="5000"></jsp:setProperty>
	Employee name = <jsp:getProperty property="empname" name="emp"></jsp:getProperty>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<s:form action="addempl" method="post" commandName="employee">
		Enter Customer code <s:input path="empcode"/>
		<s:errors path="empcode" jspClass="error.jsp"></s:errors><br>
		Enter Customer name <s:input path="empname"/>
		<s:errors path="empname" cssClass="error"></s:errors><br>
		Enter Job <s:input path="job"/>
		<s:errors path="job" cssClass="error"></s:errors><br>
		Enter Salary <s:input path="salary"/>
		<s:errors path="salary" cssClass="error"></s:errors><br>
		Enter DOJ <s:input path="doj"/>
		<s:errors path="doj" htmlClass="error"></s:errors><br>
		<input type="submit" >
	</s:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error{
color:#ff0000;
}
</style>
</head>
<body>
	<s:form action="addcustomer" method="post" commandName="customer">
		Enter Customer code <s:input path="custcode"/>
		<s:errors path="custcode" cssClass="error"></s:errors><br>
		Enter Customer name <s:input path="custname"/>
		<s:errors path="custname" cssClass="error"></s:errors><br>
		Enter Commission <s:input path="commission"/>
		<s:errors path="commission" cssClass="error"></s:errors><br>
		<input type="submit">
	</s:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1><c:out value="${newExpense.expenseName}"></c:out></h1>
		<p>Expense Description: <c:out value="${newExpense.description}"></c:out></p><br>
		<p>Expense Vendor: <c:out value="${newExpense.vendorName}"></c:out></p><br>
		<p>Expense Amount: <c:out value="${newExpense.amount}"></c:out></p><br>
	</div>
</body>
</html>
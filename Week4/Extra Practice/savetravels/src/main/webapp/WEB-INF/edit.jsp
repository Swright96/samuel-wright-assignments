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
	<h1>Edit an Expense</h1>
	<a href="/expenses">go back</a>
	<div id="formField">
			<form:form action="/edit/${newExpense.id}" method="post" modelAttribute="newExpense">
				<input type="hidden" name="_method" value="put">
				<p>
					<form:label path="expenseName">Expense Name</form:label>
					<form:errors path="expenseName"/>
					<form:input path="expenseName"/>
				</p>
				<p>
					<form:label path="vendorName">Vendor Name</form:label>
					<form:errors path="vendorName"/>
					<form:input path="vendorName"/>
				</p>
				<p>
					<form:label path="amount">Amount</form:label>
					<form:errors path="amount"/>
					<form:input path="amount"/>
				</p>
				<p>
					<form:label path="description">Description</form:label>
					<form:errors path="description"/>
					<form:input path="description"/>
				</p>
				<input type="submit" value="Submit">
			</form:form>
		</div>
</body>
</html>
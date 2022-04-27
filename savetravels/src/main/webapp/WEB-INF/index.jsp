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
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>Save Travels</h1>
		
		<div id="tableField">
			<table class="table table-striped">
				<thead>
					<tr>
						
						<th>Expense Name</th>
						<th>Vendor Name</th>
						<th>Amount</th>
						<th>Edit</th>
						
					</tr>
				</thead>
				<tbody>
					<c:forEach var="allExpenses" items="${expense}">
					
						<tr>
						
							<td><c:out value="${allExpenses.expenseName}"></c:out></td>
							<td><c:out value="${allExpenses.vendorName}"></c:out></td>
							<td>$<c:out value="${allExpenses.amount}"></c:out></td>
							<td><a href="/edit/${allExpenses.id}">Edit</a></td>
							<td><a href="/destroy/${allExpenses.id}">Destroy</a></td>
						
						</tr>
					
					</c:forEach>
				</tbody>	
			</table>
		</div>
		
		<div id="formHead">
			<h2>Add an Expense:</h2>
		</div>
		
		<div id="formField">
			<form:form action="/expenses" method="post" modelAttribute="newExpense">
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
				<input type="submit">
			</form:form>
		</div>
	</div>
</body>
</html>
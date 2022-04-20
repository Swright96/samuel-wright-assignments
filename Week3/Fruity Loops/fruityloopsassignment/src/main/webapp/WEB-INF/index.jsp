<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<c:forEach var="fruit" items="${fruits}">
		<c:out value="${fruit.name}"></c:out>
		<c:out value="${fruit.price}"></c:out>
	</c:forEach>
	<c:out value="${fruitsFromList}"></c:out>
	<table class="table">
  		<thead class="table-dark">
  			<tr>
				<th>Fruit</th>
				<th>Price</th>
			</tr>
		<tbody>
			<c:forEach var="fruit" items="${fruits}">
				<tr>
					<td>${fruit.name}</td>
					<td>${fruit.price}</td>
				</tr>
			</c:forEach>
		</tbody>
  		
	</table>
</body>
</html>
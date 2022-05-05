<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	
		<div id="head">
			<h1><c:out value="${newDojo.name}"/></h1>
			<p><a href="/dojos">Go Back</a></p>
		</div>
		
		<div id="ninjas">
			<table class="table table-striped">
				<thead>
					<tr>
					
						<th>First Name</th>
						<th>Last Name</th>
						<th>Age</th>
					
					</tr>
				</thead>
				<tbody>
				
					<c:forEach var="allNinjas" items="${newNinja}">
					
					<tr>
						<td><c:out value="${allNinjas.firstName}"/></td>
						<td><c:out value="${allNinjas.lastName}"/></td>
						<td><c:out value="${allNinjas.age}"/></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	
	</div>
</body>
</html>
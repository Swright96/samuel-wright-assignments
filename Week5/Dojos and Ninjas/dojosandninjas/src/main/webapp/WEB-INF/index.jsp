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
		<h1>New Dojo</h1>
		
		<a id="ninjaLink" href="/ninjas">New Ninja</a>
		
		<div id="NewDojo">
			<form:form action="/dojos" method="post" modelAttribute="newDojo">
				<form:label path="name">Dojo Name</form:label>
				<form:errors path="name"/>
				<form:input path="name"/>
				
				<input type="submit" value="Submit"/>
			</form:form>
		</div>
	
	
		
		<div id="dojos">
			<table class="table table-striped">
			
				<thead>
					<tr>
						<th>Dojo Name</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="allDojos" items="${dojo}">
					
					<tr>
					
						<td><a href="/show/${allDojos.id}"><c:out value="${allDojos.name}"></c:out></a>
					
					</c:forEach>
				</tbody>
			
			</table>
		</div>
	</div>
</body>
</html>
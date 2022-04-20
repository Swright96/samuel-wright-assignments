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
	<table class="table">
  		<thead class="table-dark">
  			<tr>
  				<th>Fruit</th>
  				<th>Price</th>
  			</tr>
  		</thead>
  		<tbody>
    		<tr>
    			<c:forEach var="fruitsFromList" items="${fruits}">
    				<td><c:out value="${fruitsFromList.name}"/></td>
    				<td><c:out value="${fruitsFromList.price}"/></td>	
    			</c:forEach>
    		</tr>
  		</tbody>
	</table>
</body>
</html>
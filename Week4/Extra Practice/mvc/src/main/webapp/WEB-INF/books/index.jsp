<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All the books</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h1>All Books</h1>
		<table class="table table-striped">
		    <thead>
		        <tr>
		            <th>ID</th>
		            <th>Title</th>
		            <th>Language</th>
		            <th>Number of Pages</th>
		        </tr>
		    </thead>
		    <tbody>
		    	<c:forEach var="allBooks" items="${books}">
		        <tr>
		        	<td><c:out value="${allBooks.id}"></c:out></td>
		        	<td><a href="/books/${allBooks.id}"><c:out value="${allBooks.title}"></c:out></a></td>
		        	<td><c:out value="${allBooks.language}"></c:out></td>
		        	<td><c:out value="${allBooks.numberOfPages}"></c:out></td>
		        </tr>
		        </c:forEach>
		    </tbody>
		</table>
		
	</div>
</body>
</html>
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
		<div class="headerMain">
			<h1>Welcome, <c:out value="${user.firstName}"/>!</h1>
			<a href="/logout">logout</a>
		</div>
		<div class="headerSecond">
			<h2>Books from everyone's shelves:</h2>
			<a href="/books/new">Add a book to my shelf!</a>
		</div>
	
		<div class="body">	
			<table class="table table-striped">
		    <thead>
		        <tr>
		            <th>ID</th>
		            <th>Title</th>
		            <th>Author Name</th>
		            <th>Posted By</th>
		        </tr>
		    </thead>
		    <tbody>
		    	<c:forEach var="allBooks" items="${book}">
		        <tr>
		        	<td><c:out value="${allBooks.id}"></c:out></td>
		        	<td><a href="/books/${allBooks.id}"><c:out value="${allBooks.title}"></c:out></a></td>
		        	<td><c:out value="${allBooks.authorName}"></c:out></td>
		        	<td><c:out value="${allBooks.user.firstName}"></c:out></td>
		        </tr>
		        </c:forEach>
		    </tbody>
		</table>
		</div>
	</div>
</body>
</html>
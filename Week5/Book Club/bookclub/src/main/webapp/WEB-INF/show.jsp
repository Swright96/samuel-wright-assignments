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
		<div class="header">
			<h1 style="font-style: italic"><c:out value="${newBook.title}"></c:out></h1>
			<a href="/dashboard">back to the shelves</a>
		</div>
		
		
		<div id="personReadBook">
			<p><c:out value="${newBook.user.firstName}"/> read <c:out value="${newBook.title}"/> by <c:out value="${newBook.authorName}"/></p>
		</div><br>
		
		<hr>
		
		<div id="myThoughts">
			<c:out value="${newBook.myThoughts}"/>	
		</div>
		
		<hr>
	</div>
</body>
</html>
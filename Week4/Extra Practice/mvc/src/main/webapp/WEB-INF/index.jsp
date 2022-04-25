<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><c:out value="${book.title}"></c:out></title>
</head>
<body>
	<div class="container">
		<h1><c:out value="${book.title}"></c:out></h1>
		<div id="description">
			<p>Description: <c:out value="${book.description}"></c:out></p>
		</div>
		<div id="language">
			<p>Language: <c:out value="${book.language}"></c:out></p>
		</div>
		<div id="numOfPages">
			<p>Number of Pages: <c:out value="${book.numberOfPages}"></c:out></p>
		</div>
	</div>
</body>
</html>
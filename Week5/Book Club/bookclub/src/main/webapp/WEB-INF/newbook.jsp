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
			<h1>Add a book to the shelf!</h1>
			<a href="/dashboard">go back</a>
		</div>
		<div class="form">
		<p>
			<form:form action="/books/new" method="post" modelAttribute="newBook">
				<form:input type="hidden" path="user" value="${user.id}"/>
			<p>
				<form:label path="title">Title:</form:label>
				<form:errors path="title"/>
				<form:input path="title"/>
			</p><br>
			<p>
				<form:label path="authorName">Author:</form:label>
				<form:errors path="authorName"/>
				<form:input path="authorName"/>
			</p><br>
			<p>
				<form:label path="myThoughts">My Thoughts:</form:label>
				<form:errors path="myThoughts"/>
				<form:input path="myThoughts"/>
			</p><br>
			
			<input type="submit" value="Submit"/>
			
			
			</form:form>
		</div>
	</div>
</body>
</html>
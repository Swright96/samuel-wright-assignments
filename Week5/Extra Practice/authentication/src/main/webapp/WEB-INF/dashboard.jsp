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
		<h1>Welcome, <c:out value="${user.firstName}"/> <c:out value="${user.lastName}"/>!</h1>
		
		<div class="body">
			<h2>This is your dashboard. Nothing to see here yet.</h2>
			<a href="/logout">logout</a>
		</div>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Counter</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="/css/style.css">
<script type="text/javascript" src="/js/script.js"></script>
</head>
<body>
	<div class="container">
		<h2>You've visited <a href="/">Your Server</a><c:out value="${visits}"></c:out> times!</h2>
		<a href="/">Would you like to add another?</a>
	</div>
</body>
</html>
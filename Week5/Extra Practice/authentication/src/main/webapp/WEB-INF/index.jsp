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
<link rel="stylesheet" href="css/style.css"/>
</head>
<body>
	<div class="container">
		<div id="header">
			<h1>Welcome!</h1>
			<p>Join our growing community!</p>
		</div>	
		<div id="form">
			<div id="register">
				<h2>Register</h2>
				<form:form action="/register" method="post" modelAttribute="newUser">
					
					<p>
						<form:label path="firstName">First Name:</form:label>
						<form:errors path="firstName"/>
						<form:input path="firstName"/>
					</p><br>
					<p>
						<form:label path="lastName">Last Name:</form:label>
						<form:errors path="lastName"/>
						<form:input path="lastName"/>
					</p><br>
					<p>
						<form:label path="email">Email:</form:label>
						<form:errors path="email"/>
						<form:input path="email"/>
					</p><br>
					<p>
						<form:label path="password">Password:</form:label>
						<form:errors path="password"/>
						<form:input type="password" path="password"/>
					</p><br>
					<p>
						<form:label path="confirm">Confirm Password:</form:label>
						<form:errors path="confirm"/>
						<form:input type="password" path="confirm"/>
					</p><br>
				
				<input type="submit" value="Submit"/>
				
				</form:form>
			</div>
			<div id="login">
				<h2>Login</h2>
				<form:form action="/login" method="post" modelAttribute="newLogin">
					
					<p>
						<form:label path="email">Email:</form:label>
						<form:errors path="email"/>
						<form:input path="email"/>
					</p><br>
					<p>
						<form:label path="password">Password:</form:label>
						<form:errors path="password"/>
						<form:input path="password"/>
					</p><br>
					
					<input type="submit" value="Login"/>
					
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>
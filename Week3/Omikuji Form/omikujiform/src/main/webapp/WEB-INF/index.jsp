<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
	<div class="container">
		<h1>Send an Omikuji!</h1>
		<form action="/process" method="post">
			<div id="number">
				<label>Enter a number 5 through 25:</label>
				<input type="number" id="number" name="number" min="5" max="25"><br>
			</div>
			<div class="textform">
				<label>Enter the name of any city.</label>
				<input type="text" id="cityName" name="cityName"><br>
			</div>
			<div class="textform">
				<label>Enter the name of any real person.</label>
				<input type="text" id="personName" name="personName"><br>
			</div>
			<div class="textform">
				<label>Enter professional endeavor or hobby.</label>
				<input type="text" id="endeavor" name="endeavor"><br>
			</div>
			<div class="textform">
				<label>Enter any type of any living animal.</label>
				<input type="text" id="livingThing" name="livingThing"><br>
			</div>
			<div class="textform">
				<label>Say something nice to someone.</label>
				<input type="text" id="somethingNice" name="somethingNice"><br>	
			</div>
			<p>Send and show a friend</p>
		<input id="send" type="submit" value="Send">
		</form>
		
	</div>
</body>
</html>
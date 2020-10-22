<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel = "stylesheet" href = "${pageContext.request.contextPath}/resources/css/header_template.css" />
<style type = "text/css">
	nav{
	float : right;
	}
	ul,li{
		display : inline;
		padding-right : 1em;
	}
</style>
</head>
<body>
	<header>
		<div id = "img"><img src = "https://image.shutterstock.com/image-vector/vector-illustration-diver-letter-d-600w-1647929089.jpg" alt = "logo" /></div><h1>Enrichment Entertainment</h1>
	</header>
	
	<nav>
		<ul>
			<li><a href = "${pageContext.request.contextPath}/contact" >Contact</a></li>
			<li><a href = "${pageContext.request.contextPath}/login" >Login</a></li>
			<li><a href = "${pageContext.request.contextPath}/todayevents">Today Events</a>
		</ul>
	</nav>
	<br />
	<div id="content">
		<p class="box">

			<q>All work and no play makes jack a dull boy!. In this age of
				internet and .technology, we are not entertained but distracted by
				the contant notifications and an itch to look at what is going
				somewhere else.Why not give us an opportunity to entertain you. We
				have a variety of events here. Of course , it may be less cool, but
				we bet you will feel refreshed . Bring in your family ! Bring in
				your friends ! Yo -NO -NO! Let's enjoy the weekend as nature made us
				to enjoy!!!</q>
		</p>

	</div>
</body>
</html>
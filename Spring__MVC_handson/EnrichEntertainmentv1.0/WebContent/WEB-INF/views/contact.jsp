<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact details</title>
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
	<h3>Address</h3>
	<div>
		<p>${address.line1}</p>
		<p>${address.line2}</p>
		<p>${address.city}</p>
		<p>${address.state}</p>
		<p>${address.zip}</p>
		<p>${address.contactNo}</p>

	</div>
</body>
</html>
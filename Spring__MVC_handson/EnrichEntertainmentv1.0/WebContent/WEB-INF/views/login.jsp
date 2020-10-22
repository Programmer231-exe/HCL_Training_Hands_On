<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel = "stylesheet" href = "${pageContext.request.contextPath}/resources/css/header_template.css" />
<style type = "text/css">
	
	form{
	width : 50%;
	margin-right : 25%;
	
	}
	div{
	width : 100%;
	text-align : center;}
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
<div id = "form-holder">
<div><p>${error}</p></div>
<div>
<form action= "${pageContext.request.contextPath}/validate" method = "post">
<br />
  Username : <input type = "text" name = "username" />
  <br />
  <br />
  Password : <input type = "password" name = "password" />
  <br />
  <br />
  <input type = "submit" value = "Login" />


</form>
</div>
</div>
</body>
</html>
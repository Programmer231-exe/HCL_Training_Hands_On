<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored = "false"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to EMS</title>
<style>
	h1{
	text-align : center;
	}
	
</style>
</head>
<body>
<h1>Event Management System</h1>
<div class = "successmessage"><p>Welcome to this event  <%= session.getAttribute("Name") %></p></div>
<form action = "./display">
	<input type = "submit" value = "Get Details"/>
</form></body>
</html>
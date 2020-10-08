<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EMS</title>
<style>
	*{
		box-sizing : box-content;
		text-align : center;
	}
	
	h1{
	text-align : center;
	}
	
	.form{
		margin : auto;
		width : 50%;
	}
	
</style>
</head>
<body>
	<h1>Event Management System</h1>
	<h2><%= "Event Management System" %></h2>
	<div class = "form">
	<form method = "post" action = "./index">
		<fieldset>
			<label for = "name">Event Name : </label><input type = "text" name = "name" id = "name" placeholder = "Enter the event name"/>
		</fieldset>
		<input type = "submit" value = "Go"/>
	</form>
	</div>
</body>
</html>
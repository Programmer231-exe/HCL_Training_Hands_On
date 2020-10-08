 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book My Show</title>
</head>
<body>
	<h1>Book My Show</h1>
	<form action = "./confirm" method ="post">
	<label for = "tickettype">Select Ticket Type:</label><select id = "tickettype" name = "tickettype">
	<option value = "platinum">Platinum</option>
	<option value = "gold">Gold</option>
	<option value = "silver">Silver</option></select>
	<label for = "count"></label><input type = "number" min = "1" max = "10" id = "count" name = "count"/> 
	<input type = "submit" value = "Go"/>
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirm</title>
</head>
<body>
<h1>Ticket Configuration</h1>
<div>The ticket cost is ${cost}</div>
<form action = "./Index"><input type = "submit" value = "Cancel"/></form>
<form action = "./display" method = "post"><input type = "submit" value = "Confirm"/></form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ticket Booked Successfully</title>
</head>
<body>
<h1>Ticket boooked Successfully</h1>
<table border = "1">
<tr><td>Ticket Type</td><td> <%=request.getAttribute("type")%></td></tr>
<tr><td>Ticket count</td><td><%=request.getAttribute("count") %></td></tr>
<tr><td>Ticket Cost</td><td><%=request.getAttribute("cost") %></td></tr>
</table>
</body>
</html>
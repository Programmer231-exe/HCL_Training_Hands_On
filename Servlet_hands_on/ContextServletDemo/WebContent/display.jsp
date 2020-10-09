<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1" isELIgnored = "false" import = "java.lang.*" import = "java.util.*" import = "com.hcltrainings.contextdemo.model.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display</title>
</head>

<body>
<h1>The Events on the date you searched</h1>
<table border = "1">
<tr><th>Event Name</th><th>Event Hall Name</th><th>Price</th></tr>
<%
for(Event event : (List<Event>)request.getAttribute("eventList")){ %>
	<tr><td><%=event.getEventname() %></td><td><%=event.getHallname() %></td><td><%=event.getPrice() %></td></tr>
<%} %>
</table>
</body>
</html>
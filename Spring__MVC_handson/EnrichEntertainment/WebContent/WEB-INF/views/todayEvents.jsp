<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Today Events</title>
<link rel = "stylesheet" href = "${pageContext.request.contextPath}/resources/css/header_template.css" />
<style type = "text/css">
	table,tr,th,td{
		border : 1px solid black;
	}
</style>
</head>
<body>
<header>
		<div id = "img"><img src = "https://image.shutterstock.com/image-vector/vector-illustration-diver-letter-d-600w-1647929089.jpg" alt = "logo" /></div><h1>Enrichment Entertainment</h1>
	</header>
	<h1>Today Events</h1>
	
	
	<table>
	
	<tr><td>Event Name </td><td>Event Organizer</td><td>Event time</td></tr>
	<c:forEach var = "event" items = "${eventlist}">
		<tr><td><c:out value = "${event.getEventName()}" /></td><td><c:out value = "${event.getEventOrganizer()}" /></td>
		<td><c:out value = "${event.getTime()}"/></td></tr>
	</c:forEach>
	
	</table>
</body>
</html>
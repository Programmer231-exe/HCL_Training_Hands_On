<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Displaying the categories</title>
<style>

.invisible{
    display: none;
}

.visible{
    display : block;
}
table{
margin: auto;}
table,tr,th,td{
border : 1px solid black;

font-weight : bold;
font-size : 1em;
}

th,td{
padding : 1em;}

#container{
width : 50%;
margin : auto;
text-align : center;

}

#edit,#delete{
		padding : 0.5em;
		font-size : 1em;
		font-weight : bold;
		border-radius : 10px;
		width : 100%;
		
	}

#edit{
		color : white;
		background-color : green;
	}
	
	#delete{
		color : white;
		background-color : red;
	}
	
	#edit:hover{
		color : green;
		background-color : white;
	}
	
	#delete:hover{
		color : red;
		background-color : white;
	}
	
	#error{
		font-weight : bold;
		color : red;
	}

</style>
</head>
<body>
<div id = "container">
<p id = "error">${message}</p>
<form id = "myform" method = "post">
<table>
<tr><th>Id</th><th>Name</th></tr>
<c:forEach var = "category" items = "${categories}">
	<tr><td>${category.getId()}</td><td><input type = "radio" name = "option" value = <c:out value = "${category.getId()}"/> /> <c:out value = "${category.getName()}"/></td></tr>
</c:forEach>
	<tr><td ><button id = "edit" formaction = "${pageContext.request.contextPath}/edit">Edit</button></td>
	<td><button id = "delete" formaction = "${pageContext.request.contextPath}/delete">Delete</button></td></tr>
</table>
</form>
</div>


</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
<style>

body{
	text-align : center;
}

.myform{
		margin: auto;
		width : 50%;
		text-align : center;
	}
	
	.text{
	width : 100%;
	padding : 0.5em;
	display :  block;
	margin: auto;
	margin-top : 2%;
	margin-bottom : 3%;
	border-radius : 20px;
	}
	
	
	#create
	{
		width : 50%;
		padding : 0.5em;
		font-size : 1em;
		font-weight : bold;
		border-radius : 10px;
		
	}
	
	#create{
		color : white;
		background-color : green;
	}
	#create:hover{
		color : green;
		background-color : white;
	}
	#error{
		font-weight : bold;
		color : red;
	}
</style>
</head>
<body>
<h1>Update a Category</h1>
<div class = "myform">
<p id = "error">${message}</p>
<form action = "${pageContext.request.contextPath}/update" method = "post">
	<input type = "text" name = "id" value = "${id}" hidden = "hidden" />
	<label for = "name" >Category:</label><input class = "text" type = "text" name = "name" />
	<input id = "create" type = "submit" value = "Update" />
</form> 
</div>
</body>
</html>
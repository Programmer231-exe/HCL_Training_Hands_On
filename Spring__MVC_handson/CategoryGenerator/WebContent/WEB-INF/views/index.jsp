<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create a Category</title>
<style type = "text/css">
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
	
	
	
	.button{
		padding : 0.5em;
		font-size : 1em;
		font-weight : bold;
		border-radius : 10px;
		
	}
	
	#create{
		color : white;
		background-color : green;
	}
	
	#display{
		color : white;
		background-color : red;
	}
	
	#create:hover{
		color : green;
		background-color : white;
	}
	
	#display:hover{
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
<div class = "myform">
<p id = "error">${message}</p>
<form action = "${pageContext.request.contextPath}/create" method = "post">
	<label for = "name" >Enter the name :</label> <input class = "text" type = "text" name = "name" />
	<input class = "button" id= "create" type = "submit" value = "Create"/>
	<input class = "button" type = "submit" id = "display" formaction = "${pageContext.request.contextPath}/display" value = "Display"/>
</form>
</div>
</body>
</html>
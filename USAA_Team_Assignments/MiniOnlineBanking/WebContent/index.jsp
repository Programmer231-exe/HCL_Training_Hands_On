<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cloud Banking</title>
<link rel = "shorcut icon" href = "https://image.shutterstock.com/image-vector/piggy-bank-vector-icon-isolated-600w-1194009253.jpg" />
<style type = "text/css">
*{
    box-sizing: content-box;
    
}

body{
    background-image : url("https://image.shutterstock.com/z/stock-photo-hand-putting-coin-to-piggy-bank-1162266442.jpg");
    background-size : 100% ;
    background-repeat: no-repeat;
}

.main-header {
    text-align : center;
    font-family : Arial, Helvetica, sans-serif;
    font-size: 2rem;
    color : green;
    text-shadow: 2px 2px greenyellow ;
}

.min-container{
    border-radius : 20px;
    width : 40%;
    height : 350px;
    background-color : rgba(0,0,0,0.2);
    box-shadow: 2px 2px black ;
    text-align : center;
}

.container{
   height : 70%;
    width : 70%;
    margin : auto;
    margin-top : 2px;
    padding : 2rem;
    
}

.btn{
    
    margin-top : 15%;
    background-color : green;
    padding : 1rem;
    border : 5px solid rgba(0,0,0,0.2);
    border-radius : 20px;
    box-shadow : 2px 5px black;
}

.btn > a{
    font-size: 2rem;
    text-decoration : none;
    color : white;
    width : 100%;
}

.btn:hover, .btn > a:hover{
    color : green;
    background-color : wheat;
    box-shadow : 0px 0px black;

}

footer{
    width : 100%;
    bottom: 0;
   position : fixed;
   text-align : center;
   
}
</style>
</head>
<body>
<body>
<header class = "main-header"><h1>Welcome to Cloud Banking</h1>
</header>
<section class = "min-container">
        
        <div class= "container">
            <div class= "btn"><a href = "./login.ru">Login</a></div>
    		<div class = "btn"><a href = "./register.ru">Register</a></div>
    </div>
        
</section>
<footer>
	<p>Cloud Banking &copy; 2020</p>
</footer>
</body>
</html>
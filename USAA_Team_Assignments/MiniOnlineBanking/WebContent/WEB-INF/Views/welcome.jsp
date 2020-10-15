<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<link rel = "stylesheet" href = "Styles/welcome.css"/>
</head>
<body>
<header>
    <nav><ul><li id ="selected"><a href = "./Welcome.au">Home</a></li>
        <li ><a href = "./transfer.au">Transfer Money</a></li>
        <li><a href = "./transactionlog.au">Transaction Log</a></li>
        <li><a href = "#">Test Log</a></li>
        <li><a href = "log.html">Application Logging</a></li>
        <li id ="logout"><a href = "./logout.au">Logout</a></li>
    </ul>
    </nav>

</header>
<h1  class = "main-header">Welcome ${sessionScope.username}</h1>
<section class = "container">
<article id = "CB-wallet" class = "wallet">
    <div class = "image-holder">
        <p class = "amount">Rs.${walletBal}</p>    
    </div>
    <div class = "desc"> <p>Wallet balance </p> 
    </div> 
    </article>
<article id = "Bank-Bank">
    <div class = "image-holder">
        <p class = "amount">Rs.${accountBal}</p>    
    </div>
    <div class = "desc"> <p>Bank Account balance </p> 
    </div> 
   </article>
<article id = "card-transaction">
    
        <a href = "./transfer.au" ><img class = "image-holder image" src = "https://image.shutterstock.com/image-vector/fast-cash-icon-600w-610271009.jpg" width = "200px" height = "200px"/></a>
    <div class = "desc"> <p>Send Money </p> 
    </div> 
   </article>
    
</section>
<footer>
    <p>CloudBanking &copy; </p>

</footer>
</body>
</html>
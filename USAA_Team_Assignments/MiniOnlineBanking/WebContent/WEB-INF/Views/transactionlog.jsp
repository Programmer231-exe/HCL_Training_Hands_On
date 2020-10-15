<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import = "java.io.*,java.util.*,java.sql.*" %>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Transaction Log</title>
<link rel = "stylesheet" href = "Styles/welcome.css">
<style>

table{
	width : 80%;
	margin-top : 5%;
	margin-left : 10%;
	color : white;
	text-weight : bold;
	border-collapse : collapse;
	background-color : rgba(0,0,0,0.7);
	border : 3px solid white;
}
.balan{
	display : inline;
}
.balan:hover{
	font-size : 50px;
}
th, td{
	padding : 15px;
}
tr:hover{
	font-size : 20px;
}
#transfer_but{
 width : 50%;
 margin-left : 23%;
 height : 50px;
 background-color:green;
 border : 2px solid black;
 border-radius : 20px;
 color : white;
 font-size : 25px;
 text-align : center;
 
}
#transfer_but a {
	color : white;
	text-decoration : none;
}
#transfer_but a:hover{
	font-size : 20px;
}
</style>

</head>
<body>

<sql:setDataSource var = "dbConnection" driver = "com.mysql.cj.jdbc.Driver"
	url = "jdbc:mysql://localhost:3306/mini_cloud_banking" 
	user = "CrazyShiva" password = "hcl" />
	
	
 	<sql:query dataSource = "${dbConnection}" var = "result">
 	SELECT * FROM transactions WHERE `from` LIKE "${sessionScope.username}" OR `to` LIKE "${sessionScope.username}" ORDER BY `Date` DESC LIMIT 7;
 	</sql:query>
<header>
    <nav><ul><li ><a href = "./Welcome.au">Home</a></li>
        <li ><a href = "./transfer.au">Transfer Money</a></li>
        <li id = "selected"><a href = "./transactionlog.au">Transaction Log</a></li>
        <li><a href = "#">Test Log</a></li>
        <li><a href = "log.html">Application Logging</a></li>
        <li id ="logout"><a href = "./logout.au">Logout</a></li>
    </ul>
    </nav>

</header>
<h3>Your transaction log is  </h3>


<section>

	<table border = "1" >

	<tr>
		<th>Transaction_ID</th>
		<th>From</th>
		<th>To</th>
		<th>Amount</th>
		<th>Status</th>
		<th>Time</th>
		<th>Reason</th>
	</tr>
	
	<c:forEach var = "row" items= "${result.rows}" >
		<tr>
			<td><c:out value = "${row.transaction_id}" /></td>
			<td><c:out value = "${row.from}" /></td>
			<td><c:out value = "${row.to}" /></td>
			<td><c:out value = "${row.amount}" /></td>
			<td><c:out value = "${row.status}" /></td>
			<td><c:out value = "${row.Date}" /></td>
			<td><c:out value = "${row.reason}" /></td>
		</tr>
	
	</c:forEach>
	

</table>
</section>
<br />
<br />
<footer>
    <p>CloudBanking &copy; </p>

</footer>


</body>
</html>

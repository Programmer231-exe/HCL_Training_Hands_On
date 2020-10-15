<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transaction</title>
<link rel = "stylesheet" href = "Styles/welcome.css"/>
<link rel = "stylesheet" href = "Styles/transfer.css" />
<style>
.message{
text-align : center;
font-weight : bold;
color : red;
}
</style>
</head>
<body>
 <header>
        <nav><ul><li ><a href = "./Welcome.au">Home</a></li>
        <li id ="selected"><a href = "./transfer.au">Transfer Money</a></li>
        <li><a href = "./transactionlog.au">Transaction Log</a></li>
        <li><a href = "#">Test Log</a></li>
        <li><a href = "log.html">Application Logging</a></li>
        <li id ="logout"><a href = "./logout.au">Logout</a></li>
        </ul>
        </nav>
   
    </header>
<section>
    <form action = "./transfer.au" method = "post">
        <table>
            <tr><td><label for = "type_of">Select the type of transaction:</label></td><td><select id = "type_of" name = "type_of">
                <option value = "self">Self Transaction</option>
                <option value = "another">To Other users</option>
                </select></td></tr>
            <tr><td><label for = "from">From</label></td><td><input name = "from" type = "text" value = "${sessionScope.username}" readonly = "readonly"/></td></tr>
            <tr><td><label for = "from_amount"></label></td><td><select id = "from_amount" name = "from_amount">
                <option value = "wallet">From Wallet</option>
                <option value = "bankaccount">From Bank</option>
                </select></td></tr>
            <tr class = "receiver" id = "myrow"><td><label for = "to">Receiver:</label></td><td><input type = "text" name = "receiver" id = "receiver" /></td></tr>
            <tr><td><label for = "amount">Enter the amount</label></td><td><input type= "number" min = "50"  id = "amount" name = "amount" /></td></tr>
            <tr><td colspan="2"><input class = "submit" type = "submit" value = "Send Money"/></td></tr>
           

        </table>
		
		
		
		
		
		
		
	</form>
</section>
<div class = "message">${transactionmessage}</div>

<script type = "text/javascript">
let transactiontype = document.getElementById("type_of");

transactiontype.addEventListener("change",checkType);
function checkType(){
    let type = transactiontype.value;
    console.log(type);
    if(type === "self"){
        console.log(type);
        document.getElementById("myrow").classList.add("receiver");
    }
    if(type === "another"){
        console.log("another");
        document.getElementById("myrow").classList.remove("receiver");
    }
}
</script>
</body>
</html>
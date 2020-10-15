<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel = "stylesheet" href = "Styles/login_style.css" />
</head>
<body>
<header class = "main-header"><h1>Welcome to Cloud Banking</h1></header>
<section class = "form-template">
	<div class = "form-holder">
		<form  id = "mini-form" action = "./login.ru" class = "login-form" method = "post" onsubmit = "return validate()">
 			<fieldset class = "field-container">
                <label for= "username">User Name</label><input type = "text" name = "username" id = "username" class = "input-field" />
                <label for = "password">Password</label><input type = "password" name = "password" id = "password" class = "input-field"/>
                <button id ="submitting" class = "submit" type = "submit">Login</button>
			</fieldset>
			
		</form>
            </div>
            <div id = "error" class = "error-message">${errorMessage}</div>


            </section>

            

<footer>
	<p>Cloud Banking &copy;2020</p>
</footer>
<script type = "text/javascript">
   
   document.getElementById("mini-form").addEventListener("onsubmit",validate);
   function validate(){
    {
      
      console.log("This is working");
      let errormessage = "";
      let username = document.getElementById("username").value;
      let password = document.getElementById("password").value;
      console.log(username);
      console.log(password);

      if(username == "" && password == ""){
          //alert("Form is empty");
            errormessage += "Username and password should be entered";
            document.getElementById('error').innerHTML= '<p>' + errormessage + '</p>';
          return false;
      }
      if(username == ""){
          //alert("username is null");
          errormessage += "Username should not be empty";
          document.getElementById('error').innerHTML= '<p>' + errormessage + '</p>';
          return false;
      }

      if(password == ""){
        //alert("password is null");
          errormessage += "Password should not be empty";
          document.getElementById('error').innerHTML= '<p>' + errormessage + '</p>';
          return false;
      }
     }
   }

</script>
</body>
</html>
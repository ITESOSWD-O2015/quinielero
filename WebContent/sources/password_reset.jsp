<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="style.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Lato">
<script type="text/javascript" src="scripts.js" ></script>
<title>Quinielero | Password reset</title>

<script>
function validatePasswords() {
	var password = document.getElementById("password").value;
	var confirmPassword = document.getElementById("confirmPassword").value;
	
	if (password == confirmPassword) {
		return true;
	} else {
		alert("Passwords are not equals");
		document.getElementById("confirmPassword").focus();
		return false;
	}
}
</script>
</head>
<body>

<div id="login_div">
<form action="../PasswordResetServlet" method="post" onsubmit="return validatePasswords()">
<table width="100%" cellspacing="15">
	<tr>
		<td><h1>Quinielero</h1></td>
	</tr>
	<tr>
		<td>Enter your username and new password</td>
	</tr>
	<tr>
		<td><input type="text" name="username" id="username" placeholder="Username" class="inputLogin" required></td>
	</tr>
	<tr>
		<td><input type="password" name="password" id="password" placeholder="Password" class="inputLogin" required></td>
	</tr>
	<tr>
		<td><input type="password" name="confirmPassword" id="confirmPassword" placeholder="Confirm password" class="inputLogin" required></td>
	</tr>
	<tr>
		<td><input type="submit" value="Enter"></td>
	</tr>
</table>
</form>
</div>

</body>
</html>
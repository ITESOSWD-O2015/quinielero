<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Quinielero | Password reset</title>
<script>
function checkEmail(){
	var email = document.getElementById("email_input").value;
	if (email != "geovani.serrano.17@gmail.com") {
		alert("Unavailable e-mail!");
		document.getElementbyId("email_input").focus();
	}
}
</script>
</head>
<body>

<div align="center">
<h1>Quinielero</h1>
<br />
Retrieve your account
<br />
<form action="../PasswordResetServlet" method="post">
<table>
<tr>
	<td>Registered e-mail: </td>
	<td><input type="email" name="email" placeholder="Email Address" id="email_input" /></td>"
</tr>
<tr>
	<td>New password: </td>
	<td><input type="password" name="password" placeholder="New Password" /></td>
</tr>
<tr>
	<td colspan="2"><input type="submit" value="Send" /></td>
</tr>
</table>
*We will send you an email to your registered e-mail account
</form>
</div>

</body>
</html>
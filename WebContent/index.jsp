<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Quinielero | Log in</title>
<script type="text/javascript">
function Loadable() {
	document.getElementById("loginUser").focus();
}
function ValidateDate() {
	var user = document.getElementById("loginUser");
	var password = document.getElementById("loginPassword");
	if (user.value == "" || password.value == ""){
		alert("Please enter your log in data");
		user.focus();
		return false;
	} else if (user.value == null || password.value == null) {
		alert("Something has gone wrong. Please try again");
		user.focus();
		return false;
	} else {
		return true;
	}
}
</script>
</head>

<body onload="Loadable()">
<div id="login">
<form action="loginWeb.jr" method="post" onsubmit="return ValidateData();">
<table align="center" cellspacing="10">
  	<tr>
  		<td align="right"><strong>User</strong></td>
    	<td align="left"><input name="user" type="text" id="loginUser" /></td>
  	</tr>
  	<tr>
  		<td align="right"><strong>Password</strong></td>
    	<td align="left"><input name="password" type="password" id="loginPassword" /></td>
  	</tr>
  	<tr>
    	<td align="center" colspan="2"><input name="send" type="submit" id="input_button" value="Log in" /></td>
  	</tr>
</table>
</form>
</div>
</body>
</html>
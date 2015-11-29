<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<%
//Allow access only if session exists
String user = null;
if (session.getAttribute("idUser") == null) {
	
} else {
	user = (String) session.getAttribute("idUser");
	response.sendRedirect("profile/profile.jsp");
}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="sources/style.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Lato">
<script type="text/javascript" src="sources/scripts.js" ></script>
<title>Quinielero</title>
</head>

<body>
<div id="login_div">
<form action="LoginServlet" method="post">
<table width="100%" cellspacing="15">
	<tr>
		<td><h1>Quinielero</h1></td>
	</tr>
	<tr>
		<td><input type="text" name="username" placeholder="Username" class="inputLogin" required></td>
	</tr>
	<tr>
		<td><input type="password" name="password" placeholder="Password" class="inputLogin" required></td>
	</tr>
	<tr>
		<td colspan="2"><a href="sources/password_reset.jsp">Forgot your password?</a></td>
	</tr>
	<tr>
		<td><input type="submit" value="Log in"></td>
	</tr>
</table>
</form>
</div>

</body>
</html>
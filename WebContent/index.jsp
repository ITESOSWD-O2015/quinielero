<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="sources/style.css" rel="stylesheet" type="text/css">
<title>Quinielero</title>
</head>
<body>

	<div id="login_div">
		<form action="LoginServlet" method="post" onsubmit="return valideDatos();">
			<table width="100%" cellspacing="15">
				<tr>
					<td><h3>Quinielero</h3></td>
				</tr>
				<tr>
					<td><input type="text" name="username" placeholder="Username"
						class="inputLogin" required></td>
				</tr>
				<tr>
					<td><input type="password" name="password"
						placeholder="Password" class="inputLogin" required></td>
				</tr>
				<tr>
					<td><input type="submit" value="Log in"></td>
				</tr>
			</table>
		</form>
	</div>

</body>
</html>
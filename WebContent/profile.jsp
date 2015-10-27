<%@ page import="com.quinielero.profile.ProfileUser" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Quinielero | My Profile</title>
</head>
<body>

<div align="center" style="border: solid 5px black; background: #0000FF; width:100%; color: white">
<h2>QUINIELOX</h2>
</div>

<table>
<tr>
	<td>Image here</td>
	<td align="center">
	<p><%= ((ProfileUser)request.getAttribute("profileUser")).getFirstName() %></p>	
	<h3>Contact info</h3>
	<table>
	<tr>
		<td>Street 1: </td><td><% %></td>
	</tr>
	<tr>
		<td>Street 2: </td><td><% %></td>
	</tr>
	<tr>
		<td>City: </td><td><% %></td>
	</tr>
	<tr>
		<td>State: </td><td><% %></td>
	</tr>
	<tr>
		<td>Country: </td><td><% %></td>
	</tr>
	<tr>
		<td>ZIP: </td><td><% %></td>
	</tr>
	<tr>
		<td>Phone number: </td><td><% %></td>
	</tr>
	<tr>
		<td>Member since: </td><td><% %></td>
	</tr>
	</table>
</tr>
</table>

</body>
</html>
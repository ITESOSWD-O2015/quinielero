<%@ page import="com.iteso.quinielero.users.Profile" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/style.css" rel="stylesheet" type="text/css">
<title>Quinielero | Profile</title>
</head>
<body>
<div class="header">
<h3 align="center">Quinielero</h3>
</div>
<table width="100%" cellspacing="10">
<tr>
	<td width="50%">GIANT IMAGE OF USER'S FACE</td>
	<td>
	<table width="100%">
	<tr>
		<td><strong>Username</strong></td>
		<td><%= ((Profile)request.getAttribute("loginUser")).getUsername() %></td>
	</tr>
	<tr>
		<td><strong>First name</strong></td>
		<td><%= ((Profile)request.getAttribute("loginUser")).getFirstName() %></td>
	</tr>
	<tr>
		<td><strong>Last name</strong></td>
		<td><%= ((Profile)request.getAttribute("loginUser")).getLastName() %></td>
	</tr>
	<tr>
		<td colspan="2"><h4>Contact info</h4></td>
	</tr>
	<tr>
		<td><strong>Street 1</strong></td>
		<td><%= ((Profile)request.getAttribute("loginUser")).getStreet1() %></td>
	</tr>
	<tr>
		<td><strong>Street 2</strong></td>
		<td><%= ((Profile)request.getAttribute("loginUser")).getStreet2() %></td>
	</tr>
	<tr>
		<td><strong>City</strong></td>
		<td><%= ((Profile)request.getAttribute("loginUser")).getCity() %></td>
	</tr>
	<tr>
		<td><strong>State</strong></td>
		<td><%= ((Profile)request.getAttribute("loginUser")).getState() %></td>
	</tr>
	<tr>
		<td><strong>Country</strong></td>
		<td><%= ((Profile)request.getAttribute("loginUser")).getCountry() %></td>
	</tr>
	<tr>
		<td><strong>ZIP</strong></td>
		<td><%= ((Profile)request.getAttribute("loginUser")).getZip() %></td>
	</tr>
	<tr>
		<td><strong>Phone</strong></td>
		<td><%= ((Profile)request.getAttribute("loginUser")).getPhone() %></td>
	</tr>
	<tr>
		<td><strong>Nickname</strong></td>
		<td><%= ((Profile)request.getAttribute("loginUser")).getNickname() %></td>
	</tr>
	<tr>
		<td><strong>Member since</strong></td>
		<td><%= ((Profile)request.getAttribute("loginUser")).getMemberSince() %></td>
	</tr>
	</table>
	</td>
</tr>
</table>
</body>
</html>
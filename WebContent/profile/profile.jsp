<%@ page import="com.iteso.quinielero.users.Profile"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% session.setAttribute("loginUser", request.getAttribute("loginUser")); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="sources/style.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Lato">
<script type="text/javascript" src="sources/scripts.js" ></script>
<title>Quinielero | Profile</title>
</head>

<body>
<jsp:include page="../sources/head.jsp" />

<div id="profile">	
<table width="100%" cellspacing="20" align="center">
<tr>
	<td width="50%" align="center"><img style="high:500px; width:500px" src="http://www.lifesgood.es/wp-content/uploads/2014/12/brad-pitt-magazine.jpg"></td>
	<td align="center">
	<h3>Profile</h3>
	<table width="80%">
	<tr>
		<td width="50%"><strong>Username</strong></td>
		<td width="50%"><%= ((Profile)session.getAttribute("loginUser")).getUsername() %></td>
	</tr>
	<tr>
		<td><strong>Nickname</strong></td>
		<td><%= ((Profile)session.getAttribute("loginUser")).getNickname() %></td>
	</tr>
	<tr>
		<td><strong>First name</strong></td>
		<td><%= ((Profile)session.getAttribute("loginUser")).getFirstName() %></td>
	</tr>
	<tr>
		<td><strong>Last name</strong></td>
		<td><%= ((Profile)session.getAttribute("loginUser")).getLastName() %></td>
	</tr>
	<tr>
		<td colspan="2" align="center"><h4>Contact info</h4></td>
	</tr>
	<tr>
		<td><strong>Street 1</strong></td>
		<td><%= ((Profile)session.getAttribute("loginUser")).getStreet1() %></td>
	</tr>
	<tr>
		<td><strong>Street 2</strong></td>
		<td><%= ((Profile)session.getAttribute("loginUser")).getStreet2() %></td>
	</tr>
	<tr>
		<td><strong>City</strong></td>
		<td><%= ((Profile)session.getAttribute("loginUser")).getCity() %></td>
	</tr>
	<tr>
		<td><strong>State</strong></td>
		<td><%= ((Profile)session.getAttribute("loginUser")).getState() %></td>
	</tr>
	<tr>
		<td><strong>Country</strong></td>
		<td><%= ((Profile)session.getAttribute("loginUser")).getCountry() %></td>
	</tr>
	<tr>
		<td><strong>ZIP</strong></td>
		<td><%= ((Profile)session.getAttribute("loginUser")).getZip() %></td>
	</tr>
	<tr>
		<td><strong>Phone</strong></td>
		<td><%= ((Profile)session.getAttribute("loginUser")).getPhone() %></td>
	</tr>
	<tr>
		<td><strong>Member since</strong></td>
		<td><%= ((Profile)session.getAttribute("loginUser")).getMemberSince() %></td>
	</tr>
	<tr>
		<td><strong>Password</strong></td>
		<td><%= ((Profile)session.getAttribute("loginUser")).getPassword() %></td>
	</tr>
	</table>
	</td>
</tr>
</table>
</div>
</body>
</html>
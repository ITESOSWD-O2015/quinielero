<%@ page import="com.iteso.quinielero.users.impl.Profile"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<% 
// Allow access only if session exists
String user = null;
if (session.getAttribute("idUser") == null) {
  	response.sendRedirect("../index.jsp");
} else {
	user = (String) session.getAttribute("idUser");
}
String idUser = null;
Profile loginUser = null;
Cookie[] cookies = request.getCookies();
if (cookies != null) {
	for(Cookie cookie : cookies){
		if("idUser".equals(cookie.getName())){
	        idUser = cookie.getValue();
	    }
	}
	if (idUser.equals(null)) {
		response.sendRedirect("../index.jsp");
	} else {
		loginUser = new Profile(idUser);
	}
	
}

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="../sources/style.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Lato">
<script type="text/javascript" src="sources/scripts.js" ></script>
<title>Quinielero | Profile</title>
</head>

<body>
<jsp:include page="../sources/head.jsp" />

<div id="profile">	
<table width="100%" cellspacing="20" align="center">
<tr>
	<td width="50%" align="center"><img style="high:500px; width:500px" src="http://im.ziffdavisinternational.com/ign_es/screenshot/j/jennifer-lawrence-incendia-la-pantalla/jennifer-lawrence-incendia-la-pantalla_c2d8.jpg"></td>
	<td align="center" valign="top">
	<h3>Profile</h3>
	<table width="80%">
	<tr>
		<td width="50%"><strong>Username</strong></td>
		<td width="50%"><%= loginUser.getUsername() %></td>
	</tr>
	<tr>
		<td><strong>Nickname</strong></td>
		<td><%= loginUser.getNickname() %></td>
	</tr>
	<tr>
		<td><strong>First name</strong></td>
		<td><%= loginUser.getFirstName() %></td>
	</tr>
	<tr>
		<td><strong>Last name</strong></td>
		<td><%= loginUser.getLastName() %></td>
	</tr>
	<tr>
		<td colspan="2" align="center"><h4>Contact info</h4></td>
	</tr>
	<tr>
		<td><strong>Street 1</strong></td>
		<td><%= loginUser.getStreet1() %></td>
	</tr>
	<tr>
		<td><strong>Street 2</strong></td>
		<td><%= loginUser.getStreet2() %></td>
	</tr>
	<tr>
		<td><strong>City</strong></td>
		<td><%= loginUser.getCity() %></td>
	</tr>
	<tr>
		<td><strong>State</strong></td>
		<td><%= loginUser.getState() %></td>
	</tr>
	<tr>
		<td><strong>Country</strong></td>
		<td><%= loginUser.getCountry() %></td>
	</tr>
	<tr>
		<td><strong>ZIP</strong></td>
		<td><%= loginUser.getZip() %></td>
	</tr>
	<tr>
		<td><strong>Phone</strong></td>
		<td><%= loginUser.getPhone() %></td>
	</tr>
	<tr>
		<td><strong>Member since</strong></td>
		<td><%= loginUser.getMemberSince() %></td>
	</tr>
	</table>
	</td>
</tr>
</table>
</div>
</body>
</html>
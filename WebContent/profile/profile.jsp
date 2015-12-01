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
<script>
	function validateForm(){
		var imageType = document.forms["change_pp"]["profile_image"].value;
		var extension = imageType.split('.').pop();
		
		if(extension == 'jpeg' || extension == 'jpg' || extension == 'png')
			return true;
		else{
			alert("You must choose a .jpeg .jpg or .png file");
			return false;
		}
	}
</script>
<script>
	(function(){
		
		document.forms["change_pp"]["profile_image"].value;
		
		"profile"
		
	    $('#profile_image').change( function(e) {
	        var img = URL.createObjectURL(e.target.files[0]);
	        $('.image').attr('src', img);
	    });
	}
</script>
<title>Quinielero | Profile</title>
</head>

<body>
<jsp:include page="../sources/head.jsp" />

<div id="profile">	
<table width="100%" cellspacing="20" align="center">
	<tr>
		<td width="50%" align="center"><img style="high:500px; width:500px" src="http://www.moreloshabla.tv/wp-content/uploads/2015/11/jeniffer-lawrence-1-726x1024.jpg" class="image"></td>		
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
	<tr>	
		<td width="50%" align="center">
			<form name="change_pp" id="change_pp" method="post" onsubmit="return validateForm()"> <!-- action="../ChangePictureServlet"> -->
				<input type="file" id="profile_image" name="profile_image">
				<br>
				<input type="hidden" name="user_id" id="user_id" value="<%=loginUser.getId()%>">
				<input type="submit" value="Change Profile Picture">
			</form>
		</td>
		<td>
			<a href="notifications.jsp">Notifications</a>
		</td>
	</tr>
</table>	
</div>
</body>
</html>
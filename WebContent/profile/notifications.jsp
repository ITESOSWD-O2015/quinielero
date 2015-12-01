<%@ page import="com.iteso.quinielero.users.impl.Profile"
		import="com.iteso.quinielero.users.iNotification"%>
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
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="../sources/style.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Lato">
<script type="text/javascript" src="sources/scripts.js" ></script>
<title>Notifications</title>
</head>
<body>

<div id="profile">
<jsp:include page="../sources/head.jsp" />

<h1>Notifications</h1>

<%
loginUser.setNotifications();
for (iNotification notification : loginUser.getNotifications()) {
	out.println("<h4>" + notification.getTitle() + "</h4><p>" + notification.getDescription() + "</p>");
}

%>
</div>
<form name="notification_form" action="../SendNotification" method="post" id="not_form" >
<h3>Send a message to (all) your friends</h3>
<input type="text" name="notificationsid" id="notificationsid"> <br> <br>
<input type="submit" value="Submit">				
</form>
<a href="profile.jsp">Back</a>

</body>
</html>
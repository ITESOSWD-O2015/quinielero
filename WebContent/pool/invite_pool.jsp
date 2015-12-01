<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%@ page import="com.iteso.quinielero.users.impl.Profile"%>
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
<title>Quinielero | Invite people</title>
<link href="../sources/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript">
	function InviteParticipant() {
		var participante = document.getElementById("participante");
		if(participante.value != ""){
			document.getElementById("demo").innerHTML += participante.value;
			alert("Participante agregado");
		}
		else
			alert("Introduce el nombre de algun participante");
	}
</script>
</head>
<body style="background-color: white">
<jsp:include page="../sources/head.jsp" />
	<div class="mainLogo">
		<h1>
			<a href="index.html">Quinielero</a>
		</h1>
	</div>
	
	<form action="../InvitePeople" method="post" onsubmit="InviteParticipant()">
		<table align="center">

			<tr>
				<td style="font-family: Ek Mukta; color: #919191; font-size: 150%">Participants
				</td>
			</tr>

			<tr>
				<td>
					<p>Jose Franco</p>
					<p>Juan Lopez</p>
					<p id="demo"></p>
				</td>
				
				<td> Which quiniela?<input type="number" name="IdQuinielaToInvite"  placeholder="1"  
					   id="IdQuinielaToInvite" required>
				</td>
				
				<td><input type="text" id="participante" name="participant"
					align="top"></td>
			</tr>

			<tr>
				<td>
					<button id="startpool" value="Start Pool"
						height:30px;  width:80px" onclick="deletePoolFunction()">Start
						Pool</button>
				</td>
				<td>
					<input type="submit" id="invite" value="Invite"
						height:30px;  width:80px">
				</td>

			</tr>
		</table>
	</form>
	




</body>
</html>
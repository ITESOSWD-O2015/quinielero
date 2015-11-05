<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Quinielero | Invite people</title>
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
<body style="background-color: #bf5c71">
	<div class="mainLogo">
		<h1>
			<a href="index.html">Quinielero</a>
		</h1>
	</div>
	<form>
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
					<button type="button" id="invite" value="Invite"
						height:30px;  width:80px" onclick="InviteParticipant()">Invite</button>
				</td>

			</tr>
		</table>
	</form>





</body>
</html>
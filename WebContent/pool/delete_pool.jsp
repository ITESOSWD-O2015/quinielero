<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%@ page import="com.iteso.quinielero.users.Profile"%>
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
<title>Quinielero | Delete pool</title>
<script>
function deletePoolFunction() {
    var x;
    if (confirm("¿Do you want to delete pool? It will be deleted.") == true) {
        x = "Se ha BORRADO la quiniela";
    } else {
        x = "La quiniera NO se ha borrado";
    }
    document.getElementById("demo").innerHTML = x;
}
</script>
</head>
<body style="background-color: white">
<jsp:include page="../sources/head.jsp" />
	<div class="mainLogo">
	</div>

	<form action="../DeletePool" method="post" >
	<table align="center">
		<tr>
		<td>ID Quiniela to delete: <input type="number" name="Id_Quiniela_To_Delete"  placeholder="1"  id="Id_Quiniela_To_Delete" required>
			</td>
			<td style="font-family: Ek Mukta; color: #919191; font-size: 150%">Delete
				Pool</td>
		</tr>
		<tr>
			<td>	<button id="delete" value="Delete"
					style="background: BlueLight; height: 40px; width: 113px"
					onclick="deletePoolFunction()">Delete
					</button>
			</td>
			<td> 	<input type="submit" value="Submit" name="delete_pool_button">	
			</td>
			
		</tr>
	</table>

	<p id="demo"></p>
	</form>

</body>
</html>
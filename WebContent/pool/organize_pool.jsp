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
<link href="../sources/style.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Lato">
<script type="text/javascript" src="sources/scripts.js" ></script>
<title>Quinielero | Organize a pool</title>
<script>
function validateDatos(){	
	
	var maximumS = document.forms["make_pool_form"]["maximum_participants"].value;
	var minimumS = parseInt(document.forms["make_pool_form"]["minimum_participants"].value);
	var name    = document.forms["make_pool_form"]["pool_name"].value;
	
	
	var maximum = parseInt(maximumS);
	var minimum = parseInt(minimumS);	
	var nameAux = name.replace(" ","");
	
	alert("LEYENDO DATOS DE QUINIELA");
	
	if(minimum > maximum){
		alert("Minimum can't be higher than maximum");
		return false;
	}else if(nameAux == ""){
		alert("Your pool's name must have at least one character");
		return false;
	}else
		return true;
	
	
	/*
	
	//current date
	var today = new Date();
	var dd    = "" + today.getDay();
	var mm    = "" + today.getMonth()+1; 
	var yyyy  = "" + today.getFullYear();
	
	//extraction from date
	var day   = "" + startDate.charAt(8) + startDate.charAt(9);   
	var month = "" + startDate.charAt(5) + startDate.charAt(6);
	var year  = "" + startDate.charAt(0) + startDate.charAt(1) + startDate.charAt(2) + startDate.charAt(3);*/
	

}
	

</script>
</head>

<body>
<jsp:include page="../sources/head.jsp" />	

<div class="currentSelection">
	<br><br><center> <h2>Organize Pools</h2></center>
</div>

<div class="firstStep">		
<form name="make_pool_form" action="../CreatePoolServlet" method="post" id="pool_form" onsubmit="return validateDatos()" > 
<h3>Give a name to your pool</h3>
<input type="text" name="pool_name" id="pool_name" required> <br> <br>
<input type="hidden" name="user_id" id="user_id" value="<%=loginUser.getId()%>">

<h3>Select the league for you pool</h3>
<input type="radio" name="select_league_button" value="UEFA Champions League" id="select_league_button" required>  UEFA Champions League <br>
<input type="radio" name="select_league_button" value="Bundesliga"id="select_league_button" > Bundesliga <br>
<input type="radio" name="select_league_button" value="Liga MX" id="select_league_button"> Liga MX <br>
<input type="radio" name="select_league_button" value="FIFA World Cup" id="select_league_button"> FIFA World Cup <br>
<br><br>

<h3>Set the Pool's preferences</h3>
<h4> Set maximum and minimum number of participants (must be between 2 and 99)</h4>
	Minimum: <input type="number" name="minimum_participants" min=2 max=98 placeholder="2"  id="minimum_participants" required>
	Maximum: <input type="number" name="maximum_participants" min=2 max=99 placeholder="99" id="maximum_participants" required>
<br> <br>

<h4> Set the pool's price in mexican pesos (minimum required: $5.00))</h4>
	Price: <input type="number" name="pool_price" min=5 placeholder="50" step="any" id="pool_price" required> 
<br> <br>

<h4>Pick your pool mode:</h4>
<input type="radio" name="select_pool_mode_button" value="Game" id="select_pool_mode_button" required> Game mode <br> 
<input type="radio" name="select_pool_mode_button" value="Round" id="select_pool_mode_button" > Round mode <br> 
<input type="radio" name="select_pool_mode_button" value="League" id="select_pool_mode_button" > League mode <br>

<h4> Select a starting date for the pool))</h4>
	Starting Date: <input type="date" name="start_date" pattern="\d{1,2}/\d{1,2}/\d{4}"  id="start_date" required>
<br> <br>

<h4> Would you like to invite people to your pool right now?</h4>
<input type="radio" name="invite_people_button" value="invitePeople" required> Yes <br>
<input type="radio" name="invite_people_button" value="invitePeople" required> No <br>
<br> <br>			

<h5> Have you filled all blanks? </h5>
	<input type="submit" value="Submit">				

</form>
	
	
	
</div>

</body>
</html>
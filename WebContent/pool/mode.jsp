<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Quiniela Mode</title>
<script type="text/javascript" language="JavaScript">
function carga(){
	document.getElementById("create").focus();
}
function validate(){
	var pool_mode_selection = document.getElementById("select_pool_mode_button");
}
</script>
</head>
<body onload="carga();">


<form action="ModeServlet.jar" method="POST" onsubmit="return validate();" >
<h3>Pick your pool mode:</h3>
<input type="radio" name="select_pool_mode_button" value="game" id="select_league_button" required>  Game mode <br>
<input type="radio" name="select_pool_mode_button" value="round" id="select_league_button" required>  Round mode <br>
<input type="radio" name="select_pool_mode_button" value="league" id="select_league_button" required>  League mode <br>

<input type="submit" value="Create!" id="create">

</form>
</body>
</html>
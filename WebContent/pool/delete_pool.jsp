<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
<body style="background-color:#bf5c71">
	<div class="mainLogo">
		<h1><a href="index.html">Quinielero</a></h1>	
	</div>

<form action="deletePool.jr" method="post"></form>
<table align = "center"> 
<tr>
<td style="font-family:Ek Mukta; color: #919191; font-size:150%" >Delete Pool </td>
</tr>
<tr>
<td> <button id="delete" value = "Delete" style="background:#5a4b4e; height:40px;  width:113px" onclick="deletePoolFunction()">Delete</button> </td>
</tr>
</table>

	<p id="demo"></p>

</body>
</html>
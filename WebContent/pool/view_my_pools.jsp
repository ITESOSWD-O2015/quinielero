<%@page import="com.iteso.quinielero.users.Profile"%>
<%@ page
	language="java"
	contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="sources/style.css" rel="stylesheet" type="text/css">
<meta
	http-equiv="Content-Type"
	content="text/html; charset=ISO-8859-1"
>
<!-- Latest compiled and minified CSS -->
<link
	rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"
>

<!-- Optional theme -->
<link
	rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css"
>

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"
></script>
<title>My pools</title>
</head>
<body>
	<%@ page import="com.iteso.quinielero.quiniela.Quiniela"%>
	<%@ page import="com.iteso.quinielero.quiniela.Team"%>
	<%@ page import="java.util.List"%>
	<%@ page import="java.util.ArrayList"%>
	<%@ page import="java.util.List"%>
	<%
		Quiniela myQuinielaCreated = new Quiniela("Champinions League final stage");
		myQuinielaCreated.setPoolMode("League mode");
		myQuinielaCreated.setLeague("Champinions League");
		myQuinielaCreated.setStart_date("16/02/16");

		Quiniela myQuinielaPart1 = new Quiniela("Liguilla MX");
		myQuinielaPart1.setPoolMode("League mode");
		myQuinielaPart1.setLeague("Liga Bancomer MX");
		myQuinielaPart1.setStart_date("25/11/15");

		Quiniela myQuinielaPart2 = new Quiniela("J17");
		myQuinielaPart2.setPoolMode("Round mode");
		myQuinielaPart2.setLeague("Liga Bancomer MX");
		myQuinielaPart2.setStart_date("20/11/12");

		Profile profile = new Profile();
		profile.addCreatedQuinielas(myQuinielaCreated);
		profile.addActiveQuinielas(myQuinielaPart1);
		profile.addActiveQuinielas(myQuinielaPart2);
	%>

	<p>
	<h1>My Quinielas</h1>
	</p>
	<p>
	<h2>Quinielas that I made:</h2>
	<div class="table-responsive">
		<table class="table">
			<tr>
				<th>Name</th>
				<th>Mode</th>
				<th>League</th>
				<th>Start Date</th>
			</tr>
			<%
				for (Quiniela actualQuiniela : profile.getCreatedQuinielas()) {
					String toHTML = "<tr><td>" + actualQuiniela.getName() + "</td>";
					toHTML = toHTML + "<td>" + actualQuiniela.getPoolMode() + "</td>";
					toHTML = toHTML + "<td>" + actualQuiniela.getLeague() + "</td>";
					toHTML = toHTML + "<td>" + actualQuiniela.getStart_date() + "</td></tr>";
					out.println(String.valueOf(toHTML));
				}
			%>
		</table>
	</div>

	</p>
	<p>
	<h2>Quinielas that I'm part:</h2>
	<div class="table-responsive">
		<table class="table">
			<tr>
				<th>Name</th>
				<th>Mode</th>
				<th>League</th>
				<th>Start Date</th>
			</tr>
			<%
				for (Quiniela actualQuiniela : profile.getActiveQuinielas()) {
					String toHTML = "<tr><td>" + actualQuiniela.getName() + "</td>";
					toHTML = toHTML + "<td>" + actualQuiniela.getPoolMode() + "</td>";
					toHTML = toHTML + "<td>" + actualQuiniela.getLeague() + "</td>";
					toHTML = toHTML + "<td>" + actualQuiniela.getStart_date() + "</td></tr>";
					out.println(String.valueOf(toHTML));
				}
			%>
		</table>
	</div>
		<form action="../LeavePool" method="post" >
			<h5> Would you like to leave a quiniela you are part of? Copy its name and paste it below </h5>
				Name: <input type="text" name="id_quiniela" min=1 max=j  id="id_quiniela" required>
				<button id="leave" value="leave">LEAVE</button>
		</form>	
	
	</p>
	


	

</body>
</html>
<%@ page
	language="java"
	contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta
	http-equiv="Content-Type"
	content="text/html; charset=ISO-8859-1"
>
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
<link
	rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"
>
<link href="sources/style.css" rel="stylesheet" type="text/css">

<!-- Optional theme -->
<link
	rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css"
>
<link
	rel="stylesheet"
	type="text/css"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-select.min.css"
>
<link
	rel="stylesheet"
	type="text/css"
	media="screen"
	href="http://silviomoreto.github.io/bootstrap-select/stylesheets/bootstrap-select.css"
>
<link href="../sources/style.css" rel="stylesheet" type="text/css">
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"
></script>
<meta
	http-equiv="Content-Type"
	content="text/html; charset=ISO-8859-1"
>
<link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.6.2/css/bootstrap-select.min.css" />
<script src="//cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.6.2/js/bootstrap-select.min.js"></script>
<title>Add team to your Quiniela</title>
</head>
<body>

<jsp:include page="../sources/head.jsp" />
	<%@ page import="com.iteso.quinielero.quiniela.impl.Quiniela"%>
	<%@ page import="com.iteso.quinielero.team.Team"%>
	<%@ page import="java.util.List"%>
	<%@ page import="java.util.ArrayList"%>
	<%@ page import="java.util.List"%>

	<%
		/*List<Team> existingTeams = new ArrayList<Team>();
		Team team0 = new Team("Equipo0", 0);
		Team team1 = new Team("Equipo1", 1);
		Team team2 = new Team("Equipo2", 2);
		Team team3 = new Team("Equipo3", 3);
		Team team4 = new Team("Equipo4", 4);
		Team team5 = new Team("Equipo5", 5);
		existingTeams.add(team0);
		existingTeams.add(team1);
		existingTeams.add(team2);
		existingTeams.add(team3);
		existingTeams.add(team4);
		existingTeams.add(team5);
		Quiniela quiniela = new Quiniela();*/
	%>

	<h3>Select a team to add</h3>
	<div class="row">
		<div class="col-xs-4">
		<p>
			<select class="form-control">
				<%
					//for (Team actualTeam : existingTeams) {
						//String toHTML = "<option data-icon=\"glyphicon-picture\">";
						//toHTML = toHTML + actualTeam.toString() + "</option>";
						//out.println(String.valueOf(toHTML));
					//}
				%>
			</select>
			</p><button
				type="button"
				class="btn btn-default btn-lg"
			>Add team.!</button>
		</div>
	</div>
</body>
</html>
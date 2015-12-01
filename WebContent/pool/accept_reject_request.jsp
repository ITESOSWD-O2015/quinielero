<%@ page
	language="java"
	contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link
	href="sources/style.css"
	rel="stylesheet"
	type="text/css"
>
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
<link href="../sources/style.css" rel="stylesheet" type="text/css">
<title>Request to your pool</title>
</head>
<body>

<jsp:include page="../sources/head.jsp" />
	<%@ page import="com.iteso.quinielero.quiniela.impl.Quiniela"%>
	<%@ page import="com.iteso.quinielero.users.impl.Profile"%>
	<%@ page import="java.util.List"%>
	<%@ page import="java.util.ArrayList"%>
	<%@ page import="java.util.List"%>
	<%
		/*Quiniela myQuinielaCreated = new Quiniela("Champinions League final stage");
		myQuinielaCreated.setPoolMode("League mode");
		myQuinielaCreated.setLeagueName("Champinions League");
		myQuinielaCreated.setStart_date("16/02/16");

		Profile profile1 = new Profile("Hugol", "Hugo", "Godínez");
		Profile profile2 = new Profile("Robert45", "Roberto", "Pulido");
		Profile profile3 = new Profile("Polilla", "Pol", "Zepeda");
		Profile profile4 = new Profile("Giovaza", "Giovanni", "Zuno");
		Profile profile5 = new Profile("Artauro", "Arturo", "Hernández");

		myQuinielaCreated.addPending_people(profile1);
		myQuinielaCreated.addPending_people(profile2);
		myQuinielaCreated.addPending_people(profile3);
		myQuinielaCreated.addPending_people(profile4);
		myQuinielaCreated.addPending_people(profile5);*/
	%>
	<h1>
		Request for
		<%
		//out.println(myQuinielaCreated.getName());
	%>
	</h1>
	<div class="table-responsive">
		<table class="table">
			<tr>
				<th>User</th>
				<th>Name</th>
				<th>Last Name</th>
				<th>Accept</th>
			</tr>
			<%
				/*for (Profile actualProfile : myQuinielaCreated.getPending_people()) {
					int i = 1;
					String toHTML = "<tr><td>" + actualProfile.getUsername() + "</td>";
					toHTML = toHTML + "<td>" + actualProfile.getFirstName() + "</td>";
					toHTML = toHTML + "<td>" + actualProfile.getLastName() + "</td>";
					toHTML = toHTML + "<td> <input type=\"checkbox\" id=\"option" + i + "\"</td></tr>";
					out.println(String.valueOf(toHTML));
					i++;
				}*/
			%>
		</table>
		<script>
			function doneFunction(){
				<%
					/*myQuinielaCreated.addParticipanFromPending(profile1);
					myQuinielaCreated.addParticipanFromPending(profile4);*/
				%>
			}
		</script>
		<button	type="button" class="btn btn-primary" onclick="doneFunction()">Done</button>
	</div>
</body>
</html>
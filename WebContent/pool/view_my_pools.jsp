<%@page import="com.iteso.quinielero.users.impl.Profile"%>
<%@ page
	language="java"
	contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link
	href="../sources/style.css"
	rel="stylesheet"
	type="text/css"
>
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
<title>My pools</title>
</head>
<body>

	<%@ page import="com.iteso.quinielero.quiniela.iQuiniela"%>
	<%@ page import="com.iteso.quinielero.quiniela.impl.Quiniela"%>
	<%@ page import="com.iteso.quinielero.quiniela.Team"%>
	<%@ page import="java.util.List"%>
	<%@ page import="java.util.ArrayList"%>
	<%@ page import="java.util.List"%>
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
			for (Cookie cookie : cookies) {
				if ("idUser".equals(cookie.getName())) {
					idUser = cookie.getValue();
				}
			}
			if (idUser.equals(null)) {
				response.sendRedirect("../index.jsp");
			} else {
				loginUser = new Profile(idUser);
			}
		}
		Quiniela quiniela;
	%>

	<jsp:include page="../sources/head.jsp" />

	<p>
	<h1>My Quinielas</h1>
	<p>
	<h2>Quinielas that I made:</h2>
	<div class="table-responsive">
		<table class="table">
			<tr>
				<th>Name</th>
				<th>Mode</th>
				<th>Start Date</th>
			</tr>
			<%
				for (iQuiniela actualQuiniela : loginUser.getCreatedQuinielas()) {
					String toHTML = "<tr><td>" + actualQuiniela.getName() + "</td>";
					toHTML = toHTML + "<td>" + actualQuiniela.getPoolMode() + "</td>";
					toHTML = toHTML + "<td>" + actualQuiniela.getStart_date() + "</td></tr>";
					out.println(toHTML);
				}
			%> 
		</table>
	</div>

	<p>
	<h2>Quinielas that I'm part:</h2>
	<div class="table-responsive">
		<table class="table">
			<tr>
				<th>Name</th>
				<th>Mode</th>
				<th>Start Date</th>
			</tr>
			<%
				for (iQuiniela actualQuiniela : loginUser.getActiveQuinielas()) {
					String toHTML = "<tr><td>" + actualQuiniela.getName() + "</td>";
					toHTML = toHTML + "<td>" + actualQuiniela.getPoolMode() + "</td>";
					toHTML = toHTML + "<td>" + actualQuiniela.getStart_date() + "</td></tr>";
					out.println(toHTML);
				}
			%>
		</table>
	</div>
	<form
		action="../LeavePool"
		method="post"
	>
		<h5>Would you like to leave a quiniela you are part of? Copy its
			name and paste it below</h5>
		Name: <input
			type="text"
			name="id_quiniela"
			min=1
			max=j
			id="id_quiniela"
			required
		>
		<button
			id="leave"
			value="leave"
		>LEAVE</button>
	</form>
</body>
</html>
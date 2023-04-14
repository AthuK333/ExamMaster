<%@page import="com.exammaster.entities.Test"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>Edit Test</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>


	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="#">Admin Dashboard</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="#">Home</a></li>
			</ul>
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="#">Logout</a></li>
			</ul>
		</div>
	</nav>

	<div class="container mt-3">
		<div class="row">
			<div class="col-md-8">
				<h2>Edit Test</h2>
				<h5>Which test do you want to edit?</h5>
				<div class="list-group">


					<a href="#" class="list-group-item list-group-item-action active">List
						of Tests</a>
					<%
					List<Test> li = (List<Test>) request.getAttribute("test");
					for (Test i : li) {
					%>
					<a href="/updtest/<%=i.getTestId()%> "
						class="list-group-item list-group-item-action" name="titles"><%=i.getTitle()%>
					</a>
					<%
					}
					%>
					<!-- <a href="/addt" class="list-group-item list-group-item-action">Create new test</a>
					<a href="ut" class="list-group-item list-group-item-action">Edit test</a>
					<a href="#" class="list-group-item list-group-item-action">Remove test</a>
					<a href="#" class="list-group-item list-group-item-action">View test</a>
					<a href="#" class="list-group-item list-group-item-action">Test statistics</a> -->
				</div>
			</div>
		</div>
	</div>
</body>
</html>
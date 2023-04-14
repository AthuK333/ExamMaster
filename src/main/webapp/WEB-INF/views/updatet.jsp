<%@page import="com.exammaster.entities.Test"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Add New Test</title>
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
		<a class="navbar-brand" href="#">Edit Test</a>
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
	<%Test t =(Test)request.getAttribute("t") ; %>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-8">
				<h2>Edit Test</h2>
				<form action="test" method="post">
					<div class="form-group">
						<label for="title">Title:</label> <input type="text"
							class="form-control" id="title" name="title"  value=<%=t.getTitle()%> readonly="readonly">
							
							<label for="title">New Title:</label> <input type="text"
							class="form-control" id="newtitle" name="newtitle" required>
					</div>
					<div class="form-group">
						<label for="description">Description:</label>
						<textarea class="form-control" id="description" name="description"
							required></textarea>
					</div>
					<div class="form-group">
						<label for="duration">Test Duration (in minutes):</label> <input
							type="number" class="form-control" id="duration" name="duration"
							min="1" required> <br>
						<button type="submit" class="btn btn-primary">Edit
							Questions</button>
				</form>
			</div>
		</div>
	</div>

</body>
</html>
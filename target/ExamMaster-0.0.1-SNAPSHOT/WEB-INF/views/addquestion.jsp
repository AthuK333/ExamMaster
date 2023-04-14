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
		<a class="navbar-brand" href="#">Test Application</a>
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
				<h2>Add New Test</h2>
				<form action="question" method="post">
					<!-- <div class="form-group">
						<label for="title">Title:</label> <input type="text"
							class="form-control" id="title" name="title" required>
					</div>
					<div class="form-group">
						<label for="description">Description:</label>
						<textarea class="form-control" id="description" name="description"
							required></textarea>
					</div>
					<div class="form-group">
						<label for="duration">Test Duration (in minutes):</label> <input
							type="number" class="form-control" id="duration" name="duration"
							min="1" required>
					</div> -->
					<hr>
					<div class="form-group">
						<label for="question">Question:</label> <input type="text"
							class="form-control" id="question" name="question" required>
					</div>
					<div class="form-group">
						<label for="option1">Option 1:</label> <input type="text"
							class="form-control" id="option1" name="option1" required>
					</div>
					<div class="form-group">
						<label for="option2">Option 2:</label> <input type="text"
							class="form-control" id="option2" name="option2" required>
					</div>
					<div class="form-group">
						<label for="option3">Option 3:</label> <input type="text"
							class="form-control" id="option3" name="option3" required>
					</div>
					<div class="form-group">
						<label for="option4">Option 4:</label> <input type="text"
							class="form-control" id="option4" name="option4" required>
					</div>
					<div class="form-group">
						<label for="correct-answer">Correct Answer:</label> <select
							class="form-control" id="correct-answer" name="correct-answer"
							required>
							<option value="">--Select Correct Answer--</option>
							<option value="option1">Option 1</option>
							<option value="option2">Option 2</option>
							<option value="option3">Option 3</option>
							<option value="option4">Option 4</option>
						</select>
					</div>
					<br>
					<button type="submit" class="btn btn-primary">Next Question</button>
				
				</form>
				<br>
				<a href="ad">	<button class="btn btn-primary">Finish</button></a>
			</div>
		</div>
	</div>

</body>
</html>
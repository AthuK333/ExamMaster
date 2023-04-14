<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Register</h1>
	<form method="POST" action="regpage">
		<label for="username">Username:</label> <input type="text"
			id="username" name="username" required> <br> <label
			for="password">Password:</label> <input type="password" id="password"
			name="password" required> <br> <label
			for="password-confirm">Confirm Password:</label> <input
			type="password" id="password-confirm" name="password-confirm"
			required> <br> <label for="role">Role:</label> <select
			id="role" name="role">
			<option value="user">User</option>
			<option value="admin">Admin</option>
		</select> <br>
		<button type="submit">Register</button>
	</form>
</body>
</html>
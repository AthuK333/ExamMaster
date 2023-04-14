<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Update Test</title>
</head>
<body>
	<h1>Update Test</h1>
	<c:if test="${not empty tests}">
		<table>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${tests}" var="test">
				<tr>
					<td>${test.id}</td>
					<td>${test.name}</td>
					<td>
						<form action="updateTest" method="post">
							<input type="hidden" name="id" value="${test.id}" />
							<input type="submit" value="Update" />
						</form>
					</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
	<c:if test="${empty tests}">
		<p>No tests found.</p>
	</c:if>
</body>
</html>
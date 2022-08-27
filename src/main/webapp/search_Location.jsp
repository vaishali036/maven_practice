<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All data</title>
</head>
<body>
<h2>All data</h2>
<a href="show">Add Location</a>
<table>
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Code</th>
		<th>Type</th>
		<th>Delete</th>
		<th>update</th>
	</tr>
	<c:forEach items="${location}" var="location">
	<tr>
		<td>${location.id}</td>
		<td>${location.name}</td>
		<td>${location.code}</td>
		<td>${location.type}</td>
		<td><a href="delete?id=${location.id}">Delete</a></td>
		<td><a href="update?id=${location.id}">Update</a></td>
	</tr>
	</c:forEach>
</table>
</body>
</html>
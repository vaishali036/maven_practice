<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>save Location</title>
</head>
<body>
<h2>save Location</h2>
<a href="listall">All Locations</a>
<form action="saveLocation">
<pre>
Id<input type="text" name="id"/>
Name<input type="text" name="name"/>
Code<input type="text" name="code"/>
type:
urban<input type="radio" name="type" value="urban"/>
rural<input type="radio" name="type" value="rural"/>
<input type="submit" value="save"/>
</pre>
</form>
${msg}
</body>
</html>
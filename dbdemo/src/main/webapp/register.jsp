<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Please enter details</h1>
<hr>
<form action="add" method="post">
<h2>
Roll no:<input type="text" name="rollno"><br>
Name:<input type="text" name="name"><br>
Age:<input type="text" name="age"><br>
<input type="submit" name="b1" value="INSERT">
<input type="reset" name="b2" value="RESET">
</h2>
</form>
<form action="delete">
Roll no:<input type="text" name="rollno"><br>
<input type="submit" name="b1" value="remove">
</form>
</body>
</html>
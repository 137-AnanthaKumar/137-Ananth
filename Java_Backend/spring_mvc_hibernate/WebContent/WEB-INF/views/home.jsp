<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>New USER</h1>

	<P>The time on the server is ${serverTime}.</p>

	<form action="user" method="post">
		<p> User Id : <input type="text" name="id"><br>
		<p> User Name :<input type="text" name="userName"><br>
		<p> User Email:<input type="text" name="userEmail"><br>
		
		 <input
			type="submit" value="add">
	</form>
	<button><a href="http://localhost:9080/spring_mvc_hibernate1/userlist">OLD USERS</a></button>
	
</body>
</html>
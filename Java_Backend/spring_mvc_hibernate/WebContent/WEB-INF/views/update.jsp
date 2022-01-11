<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UpdateUser</title>



</head>
<body>

<form  action="/update" method="post">
		<p> User Id : ${userId}</p><br>
		<p> User Name :<input type="text" name="userName" value="${userName }"></p>
		<p> User Email:<input type="text" name="userEmail" value="${userEmail }"></p>
		
		
		 
	</form>
	<input type=hidden id="id name="id" value="${userId}" />
	<button><a href="/spring_mvc_example/update">UPDATE</a></button>
</body>
</html>
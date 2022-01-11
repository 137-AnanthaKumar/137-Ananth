<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>

 <br><h2>SAVED USERS</h2>
 
 <form action="getSearchResults" method="post">
	userId    : <input type="text" name="id">
	<input
			type="submit" value="search">
	</form>
 
	<table border="1">
		<tr>
			<th>  Id</th>
			<th>Name</th>
			<th>EmailId</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${uList}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.userName}</td>
				<td>${user.userEmail}</td>
				<td><a href="a href="/spring_mvc_hibernate1/update/${user.id}" >Update</a></td>
				<td><a href="/spring_mvc_hibernate1/delete/${user.id} ">Delete</a></td>
			</tr>
		</c:forEach>
		
		
	</table>
	<br><button > <a href="/spring_mvc_hibernate1/">Add Newuser</a> </button>
</body>
</body>
</html>
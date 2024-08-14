<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="<c:url value="/CSS/style.css" />" />
</head>
<body>
	<jsp:include page="home.jsp"></jsp:include>
	<br>

	<div class="container-fluid bg-gradient ">
		<div class="container-sm pt-5">
			<h1>Add Genres </h1>
			<form class="form" name="frm" action="savegen" method="POST">
				<input class="form-control" type="text" name="gentitle" value=""
					placeholder="Type here genres..." /> <br />
				<button class="btn btn-outline-success form-control" type="submit"
					name="s" value="Add New Genres">Add New Genres</button>
			</form>
			<span>${msg}</span>
		</div>

		<br />
		
		<br />
	
		
		
	</div>



</body>
</html>
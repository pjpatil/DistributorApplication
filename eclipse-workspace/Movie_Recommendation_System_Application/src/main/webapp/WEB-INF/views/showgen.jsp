<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="home.jsp"></jsp:include>
	<br>
	<div class="container-fluid container-md ">

		<input class="form-control" type="text" name="gentitle" value=""
			placeholder="Type here genres..." /> <br />

	</div>
	<div class="container-fluid container-md ">
		<h2>Displaye All Genres</h2>

		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col">Sr.No</th>
					<th scope="col">Genres Title</th>
					<th scope="col">UPDATE</th>
					<th scope="col">DELETE</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="s" items="${getallgen}">
					<tr>
						<th scope="row">${s.getGenid()}</th>
						<td >${s.getGentitle()}</td>
						<td><a href="#" >delete</a></td>
						<td><a href="#">update</a></td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>
</body>
</html>
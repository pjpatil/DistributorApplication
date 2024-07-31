<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="CSS/newMaster.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>

<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
	integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
	integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
	crossorigin="anonymous"></script>

<script type="text/javascript" src='JS/validate.js'></script>

</head>
<body>
	<div class="d-flex align-items-start bg-light h-100 m-2">
		<!-- Main Menu  -->
		<div class="nav flex-column nav-pills me-3 w-25 m-2" id="v-pills-tab"
			role="tablist" aria-orientation="vertical">
			<button class="nav-link active" id="v-pills-home-tab"
				data-bs-toggle="pill" data-bs-target="#v-pills-home" type="button"
				role="tab" aria-controls="v-pills-home" aria-selected="true">Home</button>

			<button class="nav-link" id="v-pills-profile-tab"
				data-bs-toggle="pill" data-bs-target="#v-pills-profile"
				type="button" role="tab" aria-controls="v-pills-profile"
				aria-selected="false">Company Master</button>

			<button class="nav-link" id="v-pills-products-tab"
				data-bs-toggle="pill" data-bs-target="#v-pills-products"
				type="button" role="tab" aria-controls="v-pills-products"
				aria-selected="false">Product Master</button>

			<button class="nav-link" id="v-pills-messages-tab"
				data-bs-toggle="pill" data-bs-target="#v-pills-messages"
				type="button" role="tab" aria-controls="v-pills-messages"
				aria-selected="false">Messages</button>

			<button class="nav-link" id="v-pills-settings-tab"
				data-bs-toggle="pill" data-bs-target="#v-pills-settings"
				type="button" role="tab" aria-controls="v-pills-settings"
				aria-selected="false">Settings</button>

		</div>

		<div class="divContent mt-5 w-50">
			<ul class="bg-primary">
				<li><a href='AddNewProduct.jsp'>Add New Product</a></li>
				<li><a href=''>View Product</a></li>
				<li><a href=''>View Vendor wise Products</a></li>
			</ul>
		

</body>
</html>
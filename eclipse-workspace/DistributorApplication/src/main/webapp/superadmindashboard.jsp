<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Super Admin Dashboard</title>
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


		<div class="tab-content w-50" id="v-pills-tabContent">
			<!-- Home  -->
			<div class="tab-pane fade show active " id="v-pills-home"
				role="tabpanel" aria-labelledby="v-pills-home-tab">
				<div class="contener  w-50 ">
					<h1>Distributor aaplication</h1>
					<p>Lorem ipsum dolor sit amet consectetur adipisicing elit.
						Facilis asperiores recusandae accusamus quae. Rem ut quo fugiat
						iusto. Incidunt assumenda eligendi alias? Libero, voluptatem ad
						quidem doloribus suscipit minima in cupiditate quasi animi illum
						ducimus culpa, cumque nobis consequatur numquam explicabo
						voluptatum nam expedita earum nemo a temporibus delectus.</p>
				</div>

			</div>

			<!-- Company Master -->
			<div class="tab-pane fade " id="v-pills-profile" role="tabpanel"
				aria-labelledby="v-pills-profile-tab">
				<!----------------------------- Company Master Menu ---------------------------------->
				<ul class="nav nav-pills mb-3" id="pills-tab" role="tablist">
					<li class="nav-item" role="presentation">
						<button class="nav-link " id="pills-home-tab"
							data-bs-toggle="pill" data-bs-target="#pills-home" type="button"
							role="tab" aria-controls="pills-home" aria-selected="true">New
							Vendor</button>
					</li>
					<li class="nav-item" role="presentation">
						<button class="nav-link" id="pills-profile-tab"
							data-bs-toggle="pill" data-bs-target="#pills-profile"
							type="button" role="tab" aria-controls="pills-profile"
							aria-selected="false">View Vendor</button>
					</li>
					<li class="nav-item" role="presentation">
						<button class="nav-link" id="pills-contact-tab"
							data-bs-toggle="pill" data-bs-target="#pills-contact"
							type="button" role="tab" aria-controls="pills-contact"
							aria-selected="false">Search Vendor</button>
					</li>
				</ul>

				<div class="tab-content" id="pills-tabContent">
					<!-- New Vendor -->
					<div class="tab-pane fade show " id="pills-home" role="tabpanel"
						aria-labelledby="pills-home-tab">

						<form name="frm" id="frm" action="savevendor" method="POST"
							onsubmit="validateName()">

							<div class="form-group">
								<input type="text" name="name" value="" id="txtVend"
									class="form-control" placeholder="Vendor name"
									onkeyup="validateVendor()" /> <span id="msg"></span><br /> <input
									type="submit" name="s" id="btn" value="Add new Vendor"
									class="form-control" />

							</div>

						</form>

					</div>

					<!-- View Vendor -->
					<div class="tab-pane fade" id="pills-profile" role="tabpanel"
						aria-labelledby="pills-profile-tab">
						<p>View Vendor</p>
						<%@page import="org.tech.model.*,org.tech.service.*,java.util.*"%>
						<%!VendorService vendService = new VendorServiceImpl();%>

						<%
						List<VendorModel> vendList = vendService.getvendorList();
						%>

						<div class="form-group">
							<input type="text" name="name" value="" id="txtVend"
								class="form-control" placeholder="Search Data using vendor name"
								onkeyup="searchUsingAjax(this.value)" /> <br />
						</div>

						<div id="showGrid">
							<table class="table table-hover">
								<thead>
									<tr>
										<th scope="col">ID</th>
										<th scope="col">NAME</th>
										<th scope="col">DELETE</th>
										<th scope="col">UPDATE</th>
									</tr>
								</thead>
								<tbody>
									<%
									for (VendorModel vmodel : vendList) {
									%>
									<tr>
										<th scope="row"><%=vmodel.getId()%></th>
										<td><%=vmodel.getName()%></td>
										<td><a href='delvendor?vid=<%=vmodel.getId()%>'>Delete</a></td>
										<td><a
											href='updatevendor?vid=<%=vmodel.getId()%>&vname=<%=vmodel.getName()%>'>Update</a></td>
									</tr>
									<%
									}
									%>
								</tbody>
							</table>
						</div>
					</div>

					<!-- Search Vendor -->
					<div class="tab-pane fade" id="pills-contact" role="tabpanel"
						aria-labelledby="pills-contact-tab">
						<p>Search Vendor</p>

					</div>

				</div>
			</div>

			<!-- Product   -->
			<div class="tab-pane fade" id="v-pills-products" role="tabpanel"
				aria-labelledby="v-pills-products-tab">
				<p>Product page</p>
			</div>


			<!-- Messages  -->
			<div class="tab-pane fade" id="v-pills-messages" role="tabpanel"
				aria-labelledby="v-pills-messages-tab">
				<p>This is some placeholder content the Profile tab's associated
					content. Clicking another tab will toggle the visibility of this
					one for the next. The tab JavaScript swaps classes to control the
					content visibility and styling. You can use it with tabs, pills,
					and any other .nav-powered navigation.</p>
			</div>


			<!-- Settings -->
			<div class="tab-pane fade" id="v-pills-settings" role="tabpanel"
				aria-labelledby="v-pills-settings-tab">
				<p>This is some placeholder content the Messages tab's
					associated content. Clicking another tab will toggle the visibility
					of this one for the next. The tab JavaScript swaps classes to
					control the content visibility and styling. You can use it with
					tabs, pills, and any other .nav-powered navigation.</p>
			</div>

		</div>
	</div>
</body>

</html>
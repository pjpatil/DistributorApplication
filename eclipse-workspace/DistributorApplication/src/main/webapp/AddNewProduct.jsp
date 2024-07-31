<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="newMaster.jsp"></jsp:include>
	<br>
	<%@page import="org.tech.model.*,org.tech.service.*,java.util.*"%>

	<form name='frm' id="frm" action='savevendor' method='POST'
		onsubmit="validateName">
		<div class="form-group" style="display:flex">
		<a href='' style="text-decoration:none ;font-size:25px">+</a>
			<%
			VendorService vendorService = new VendorServiceImpl();
			List<VendorModel> list = vendorService.getvendorList();
			%>
			<select name="name" class="form-control ">
				<option>Select Vendor</option>
				<%
				for (VendorModel vModel : list) {
				%>
				<option value=<%=vModel.getId()%>><%=vModel.getName()%></option>
				<%
				}
				%>
			</select>
		</div>
		<br>
		<div class="form-group" style="display:flex">
		<a href='' style="text-decoration:none ;font-size:25px">+</a>
			<select name="productCategory" class="form-control">
				<option>Select Product Category</option>
			</select>
		</div>
		<br>
		<div class="form-group">
			<select name="productName" class="form-control">
				<option>Select Product</option>
			</select>
		</div>

		<br>
		<div class="form-group">
			<input type="text" name="productPrice" value='' id="prodPrice"
				class="form-control" placeholder="Product name" />
		</div>
		<br>
		<div class="form-group">
			<input type="text" name="manFactDate" value='' id="manFactDate"
				class="form-control" placeholder="Product Manifacturing date" />
		</div>
		<br>
		<div class="form-group">
			<input type="text" name="expDate" value='' id="prodExpDate"
				class="form-control" placeholder="Product Expiry date" />
		</div>
		<br>
		<div class="form-group">
			<input type="submit" name="s" id="btn" value='Add New Product'
				class="form-control" />
		</div>

	</form>
	</div>
	</div>
</body>
</html>
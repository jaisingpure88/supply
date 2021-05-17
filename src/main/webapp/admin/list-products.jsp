<%@ include file="util/header.jsp"%>
<%@ page
	import="java.util.*, com.scm.admin.util.*, com.scm.model.*,com.scm.admin.servlet.*"%>

<html>
<head>
<%
List<Product> theProducts = (List<Product>) request.getAttribute("Product_LIST");
%>

<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-6 bg-dark text-light d-flex align-items-center"
				style="height: 60px">Welcome To Supply Chain Management System</div>
			<div
				class="col-6 bg-dark text-light d-flex align-items-center justify-content-end"
				style="height: 60px">
				<a class="btn btn-secondary" href="logout" role="button">LOG OUT</a>
			</div>
		</div>

		<div class="row">
			<div
				class="cal-12 bg-dark text-light d-flex justify-content-center align-items-center"
				style="height: 100vh">
				<div
					class="col-6 bg-light text-light d-flex align-items-center justify-content-center"
					style="height: 100vh">
					<table class="table table-dark table-striped">
						<thead>
							<tr>
								<th scope="col">Product ID</th>
								<th scope="col">Product Name</th>
								<th scope="col">Product Description</th>
								<th scope="col">Product Price</th>
								<th scope="col">Remove Product</th>
							</tr>
						</thead>
						<tbody>
							<%
							for (Product tempProduct : theProducts) {
							%>
							<form>
								<tr>
									<td scope="row"><%=tempProduct.getProductID()%></td>
									<td><%=tempProduct.getProductName()%></td>
									<td><%=tempProduct.getProductDisc()%></td>
									<td><%=tempProduct.getProductPrice()%></td>
									<td><a href="https://www.google.com/">Remove</a></td>
								</tr>
							</form>

							<%
							}
							%>
						</tbody>


					</table>
				</div>
			</div>
		</div>
		<footer>
			<br> <br> <a href="#">Add Product</a>
		</footer>
</body>
</html>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="util/header.jsp"%>
<body>
	<div class="container-fluid">
		<div class="row">
			<div
				class="col-12 bg-dark text-light d-flex justify-content-center align-items-center"
				style="height: 100vh">

				<form action="userregister" method="post">
					<div>
						<h3>User Register</h3>
					</div>
					<div class="mb-3">
						<label class="form-label">Name</label> <input type="text"
							name="UserName" class="form-control">
					</div>
					<div class="mb-3">
						<label class="form-label">City</label> <input type="text"
							name="UserCity" class="form-control">
						<div class="form-text">our supply chain available in
							'Banglore', 'Delhi', 'Mumbai', 'Indore' city's only;</div>
					</div>
					<div class="mb-3">
						<label class="form-label">Password</label> <input type="password"
							name="UserPassword" class="form-control">
					</div>
					<button type="submit" class="btn btn-primary">Register</button>
					<a class="btn btn-primary" href="login.jsp" role="button">Login</a>

				</form>

			</div>

		</div>

	</div>

</body>
</html>
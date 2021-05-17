<%@ include file="util/header.jsp"%>
<body>
	<div class="container-fluid">
		<div class="row">
			<div
				class="cal-12 bg-dark text-light d-flex justify-content-center align-items-center"
				style="height: 100vh">
				<form action="userlogin" method="post">
				    <div>
						<h3>User Login</h3>
					</div>
					<div class="mb-3">
						<label class="form-label">Name</label> <input type="text"
							name="UserName" class="form-control">
					</div>

					<div class="mb-3">
						<label class="form-label">Password</label> <input type="password"
							name="UserPassword" class="form-control">
					</div>
					<button type="submit" class="btn btn-primary">Login</button>
					<a class="btn btn-primary" href="register.jsp" role="button">Register</a>
				</form>

			</div>
		</div>
	</div>
</body>
</html>
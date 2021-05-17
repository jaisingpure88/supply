
<%@ page import="java.util.*, com.scm.admin.util.*, com.scm.model.*,com.scm.admin.servlet.*"%>

<html>
<head>
<%
	List<Euser> theUser = (List<Euser>) request.getAttribute("User_LIST");

%>
<title>User</title>
</head>
<body>
<div align="center">
<table border="1">
<tr>
	<th>User ID</th>
	<th>User Name</th>
	<th>User City</th>
	<th>Remove User</th>
</tr>
		<% for (Euser tempUser : theUser) { %>
			<tr>
				<td><%= tempUser.getUserID() %></td>
				<td><%= tempUser.getUserName() %></td>
				<td><%= tempUser.getUserCity() %></td>
				<td><a href="https://www.google.com/">Remove</a></td>
			</tr>
			<% }  %>

</table>
</div>
</body>
</html>
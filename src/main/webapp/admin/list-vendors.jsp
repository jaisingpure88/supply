<%@ page import="java.util.*, com.scm.admin.util.*, com.scm.model.*,com.scm.admin.servlet.*"%>

<html>
<head>
<%
	List<Vendor> theVendor = (List<Vendor>) request.getAttribute("Vendor_LIST");

%>
<title>User</title>
</head>
<body>
<div align="center">
<table border="1">
<tr>
	<th>Vendor ID</th>
	<th>Vendor Name</th>
	<th>Vendor City</th>
	<th>Remove Vendor</th>
</tr>
		<% for (Vendor tempVendor : theVendor) { %>
			<tr>
				<td><%= tempVendor.getVrndorID() %></td>
				<td><%= tempVendor.getVendorName() %></td>
				<td><%= tempVendor.getVendorCity() %></td>
				<td><a href="https://www.google.com/">Remove</a></td>
			</tr>
			<% }  %>

</table>
<br><br>
<a href="#">Add Vendor</a>
</div>
</body>
</html>
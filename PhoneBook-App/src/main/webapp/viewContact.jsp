<%@page import="java.util.List"%>
<%@page import="com.conn.DbConnect"%>
<%@page import="com.dao.ContactDao"%>
<%@page import="com.entity.Contact"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="component/allCss.jsp"%>

<style type="text/css">
.crd-ho:hover {
	background-color: #f7f7f7
}
</style>
</head>
<body>
	<%@include file="component/navbar.jsp"%>
	<%
	if (user == null) {
		session.setAttribute("invalidMsg", "Login Please..");
		response.sendRedirect("login.jsp");
	}
	%>
	<div class="container">
		<div class="row p-2">

			<%
			if (user != null) {

				ContactDao dao = new ContactDao(DbConnect.getConn());
				dao.getAllcontact(user.getId());
				List<Contact> contact = dao.getAllcontact(user.getId());

				for (Contact c : contact) {
			%>
			<div class="col-md-3">
				<div class="card crd-ho">
					<div class="card-body">
						<h5>
							Name:<%=c.getName()%>
						</h5>
						<p>
							Ph-no:<%=c.getPhone()%>
						</p>
						<p>
							Email:<%=c.getEmail()%>
						</p>
						<p>
							About:<%=c.getAbout()%>
						</p>
						<div class="text-center">
							<a href="editContact.jsp?cid=<%=c.getId()%>"
								class="btn btn-success btn-sm text-white">Edit</a> <a
								class="btn btn-danger btn-sm text-white">Delete</a>
						</div>
					</div>
				</div>
			</div>
			<%
			}
			}
			%>
		</div>
	</div>
</body>
</html>
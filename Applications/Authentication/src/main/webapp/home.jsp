<%
	if(session.getAttribute("name")==null){
		response.sendRedirect("index.jsp");
	}
%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<link rel = "stylesheet" href="CSS/home.css"/>
</head>
<body>
<div id="homecontainer" class="homecontainer">
	<div class="innercontainer">
		<h1>Welcome <%= session.getAttribute("name") %></h1>
		<a href="logout"> Logout </a>
	</div>
	
</div>
	
</body>
</html>
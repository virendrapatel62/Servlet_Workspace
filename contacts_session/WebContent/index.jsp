<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Contact Manager</h1>
	
	<form action='<%= response.encodeUrl("save-contact") %>' method='post'>
		
		<input placeholder='enter Name' type='text' name='name' />
		<br/>
		<br/>
		<br/>
		<input placeholder='enter Number' type='number' name='mobile' />
		<br/>
		<br/>
		<br/>
		
		<input type='submit' value='Save Contact' />
		<br/>
		<br/>
		<br/>
		
		<a href='<%= response.encodeUrl("show") %>'>Show Contacts</a>
	
	</form>
	
</body>
</html>
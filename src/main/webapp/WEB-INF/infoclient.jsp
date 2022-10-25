<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="com.rsv.beans.Client" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <%
    
       String message = (String) request.getAttribute("message");
    
       if( message != null ){
    	   
    	   out.print(message);
       }
    
    %>
    
    <%  Client client = (Client)  request.getAttribute("client");  %>
    
    <table border="1">
		<div>
			<tr>
				<td>Nom : </td>
				<td><%= client.getNom() %></td>
			</tr>
			
			<tr>
				<td>Prenom : </td>
				<td><%= client.getPrenom() %></td>
			</tr>
			
			<tr>
				<td>Telephone : </td>
				<td><%= client.getTelephone() %></td>
			</tr>
			
		    <tr>
				<td>Email : </td>
				<td><%= client.getEmail() %></td>
			</tr>
       		       	
			
		</div>
	</table>
		
</body>
</html>
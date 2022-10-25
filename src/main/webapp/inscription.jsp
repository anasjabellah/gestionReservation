<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1>Inscription</h1>
    <form action="creer_client" method="POST">
         <table>
			<div>
				<tr>
					<td>Nom : </td>
					<td><input type="text" name="nom" /></td>
				</tr>
				
				<tr>
					<td>Prenom : </td>
					<td><input type="text" name="prenom" /></td>
				</tr>
				
				<tr>
					<td>Telephone : </td>
					<td><input type="text" name="telephone" /></td>
				</tr>
				
			    <tr>
					<td>Email : </td>
					<td><input type="email" name="email" /></td>
				</tr>
	       		       	
				<tr>
					<td></td>
					<td><input type="submit" name="submit" value="Envouer" /></td>
				</tr>
				
			</div>
		</table>
    </form>
    <%
    
       String message = (String) request.getAttribute("message");
    
       if( message != null ){
    	   
    	   out.print(message);
       }
    
    %>
</body>
</html>
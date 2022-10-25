<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h1>Reservation</h1>
    <form action="creer_rsv" method="POST">
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
					<td><input type="text" name="email" /></td>
				</tr>
				
				
				<tr>
			       <td>Type : </td>
			       <select name="type">
			           <option value="1 chambre">1 chambre</option>
			           <option value="2 chambre">2 chambre</option>
			           <option value="3 chambre">3 chambre</option>	
			       </select>
		       </tr>
		       
		       	 <tr>
					<td>prix : </td>
					<td><input type="text" name="prix" /></td>
				</tr>
				
				
				<tr>
			       <td>Option : </td>
			       <select name="option">
			           <option value="mer">mer</option>
			           <option value="jardin">jardin</option>
			           <option value="piscine">piscine</option>	
			       </select>
		       </tr>
		       
		       
				
				<tr>
					<td></td>
					<td><input type="submit" name="submit" value="Envouer" /></td>
				</tr>
			</div>
		</table>
    <%
    
       String message = (String) request.getAttribute("message");
    
       if( message != null ){
    	   
    	   out.print(message);
       }
    
    %>
    </form>
</body>
</html>
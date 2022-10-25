package com.rsv.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.rsv.beans.Client;

@WebServlet(urlPatterns = {"/creer_client"})
public class creer_client extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public creer_client() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String telephone = request.getParameter("telephone");
		String email = request.getParameter("email");
		
		String message ;
		
		if( nom.trim().isEmpty()  ||  prenom.trim().isEmpty() || telephone.trim().isEmpty()  ||  email.trim().isEmpty() ) {
			
			message = "Vous devez remplire tous les champs SVP!!";
			request.setAttribute("message", message);
			this.getServletContext().getRequestDispatcher("/inscription.jsp").forward(request, response);
			
		}else {
			
			message = "Inscription avec Succes";
			request.setAttribute("message", message);
			Client client = new Client();
		
			client.setNom(nom);client.setPrenom(prenom);
			client.setTelephone(telephone);client.setEmail(email);
			
			request.setAttribute("client", client);
			this.getServletContext().getRequestDispatcher("/WEB-INF/infoclient.jsp").forward(request, response);
			
			
		}
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/inscription.jsp").forward(req, resp);
	}
	

}

package com.rsv.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.rsv.beans.Client;
import com.rsv.beans.reservation;

@WebServlet(value = "/creer_rsv")

public class creer_rsv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public creer_rsv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String telephone = request.getParameter("telephone");
		String email = request.getParameter("email");
		String type = request.getParameter("type");
		String option = request.getParameter("option");
		Double prix ;
		
		String message ;
		
		try {
			prix = Double.parseDouble(request.getParameter("peix"));
		} catch (Exception e){
			prix = 0.5 ;
		}

		
		if( nom.trim().isEmpty()  ||  prenom.trim().isEmpty() || telephone.trim().isEmpty()  ||  email.trim().isEmpty() ||   type.trim().isEmpty() || option.trim().isEmpty()  ||  prix == 0.5) {
			message = "Vous devez remplire tous les champs SVP!!";
			request.setAttribute("message", message);
			this.getServletContext().getRequestDispatcher("/reservation.jsp").forward(request, response);
		}else {
			
			message = "reservation avec Succes";
			request.setAttribute("message", message);
			
			reservation reservation = new reservation();
			Client client = new Client();
		
			
			client.setNom(nom);client.setPrenom(prenom);
			client.setTelephone(telephone);client.setEmail(email);
			client.setReservation(reservation);
			
			reservation.setType(type); reservation.setOption(option);
			reservation.setPrix(prix);
			
			
			request.setAttribute("reservation", reservation);
			this.getServletContext().getRequestDispatcher("/WEB-INF/inforsv.jsp").forward(request, response);
		}
		
		
		
	}
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/reservation.jsp").forward(req, resp);
	}
}

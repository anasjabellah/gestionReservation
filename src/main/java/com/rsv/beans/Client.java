package com.rsv.beans;

public class Client {
	
	
	private String nom ;
	private String prenom ;
	private String telephone ;
	private String email ;
	private reservation reservation;
	
	public Client() {}
	
	
	public Client(String nom, String prenom, String telephone, String email) {
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.email = email;
	}
	



	public reservation getReservation() {
		return reservation;
	}


	public void setReservation(reservation reservation) {
		this.reservation = reservation;
	}


	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public String getTelephone() {
		return telephone;
	}



	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + ", email=" + email + "]";
	}
	
	
	
}

package com.rsv.beans;

public class reservation {

	
	
	private String type ;
	private double prix  ;
	private String option ;
	
	
	public reservation(){};
	
	public reservation(String type, double prix, String option) {
		this.type = type;
		this.prix = prix;
		this.option = option;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}


	public String getOption() {
		return option;
	}


	public void setOption(String option) {
		this.option = option;
	}


	@Override
	public String toString() {
		return "reservation [type=" + type + ", prix=" + prix + ", option=" + option + "]";
	}
	
	
	
}





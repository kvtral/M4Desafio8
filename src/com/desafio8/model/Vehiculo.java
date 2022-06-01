package com.desafio8.model;

public abstract class Vehiculo {

	protected String color;
	protected String patente;

	public Vehiculo() {	
		
	}
	
	public Vehiculo (String color, String patente){
		this.color = color;
		this.patente = patente;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}
	
	
	
}

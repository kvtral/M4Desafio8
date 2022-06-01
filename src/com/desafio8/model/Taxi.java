package com.desafio8.model;

public class Taxi  extends Vehiculo {

	private int valorPasaje;
	
	public Taxi() {
		super();
	}

	public Taxi(String color, String patente, int valorPasaje) {
		super(color, patente);
		this.valorPasaje = valorPasaje;
	}

	public int getValorPasaje() {
		return valorPasaje;
	}

	public void setValorPasaje(int valorPasaje) {
		this.valorPasaje = valorPasaje;
	}
	
	public int pagarPasaje(int pasaje) {

		if (pasaje >= getValorPasaje()) {
			int vuelto = pasaje - getValorPasaje();
			System.out.println("Su pasaje ha sido pagado, su vuelto es " + vuelto);
			return vuelto;		
		} else {
			System.out.println("El valor del pasaje es mayor al monto que ha entregado");
			return pasaje;
		}
		
		
	}
	
}

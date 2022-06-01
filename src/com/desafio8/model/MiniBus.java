package com.desafio8.model;

public class MiniBus extends Bus {

	private String tipoViaje;

	public MiniBus() {
		super();
	}

	public MiniBus(String color, String patente, int cantidadDeAsientos, String tipoViaje) {
		super(color, patente, cantidadDeAsientos);
		this.tipoViaje = tipoViaje;
	}

	public String getTipoViaje() {
		return tipoViaje;
	}

	public void setTipoViaje(String tipoViaje) {
		this.tipoViaje = tipoViaje;
	}
	
	
	@Override
	public String toString() {
		return "MiniBus [tipoViaje=" + tipoViaje + ", color=" + color + ", patente=" + patente + "]";
	}

	public void imprimeBus() {
		System.out.println(toString());
	}
	
	
}

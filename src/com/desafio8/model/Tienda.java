package com.desafio8.model;

public class Tienda {

	private Vendedor vendedor;
	private	Vehiculo vehiculo;
	private Cliente cliente;
	private int stock;
	
	public Tienda() {
		
	}

	public Tienda(Vendedor vendedor, Vehiculo vehiculo, Cliente cliente, int stock) {
		super();
		this.vendedor = vendedor;
		this.vehiculo = vehiculo;
		this.cliente = cliente;
		this.stock = stock;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public String existeStock () {
		return "La cantidad de stock es " + getStock();
	}
	
}

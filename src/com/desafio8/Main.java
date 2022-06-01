package com.desafio8;

import com.desafio8.model.*;

public class Main {

	public static void main(String[] args) {

		Cliente cliente = new Cliente("1-9","Alvaro", 38);
		
		Vendedor vendedor = new Vendedor ("2-7","Javier", 50, "Las Dalias 123");
		
		Taxi taxi = new Taxi ("negro", "TX1234", 1000);
		
		Bus bus = new Bus ();
		
		MiniBus miniBus = new MiniBus ("rojo", "MB3214", 20, "Interurbano");
		
		Tienda tienda = new Tienda (vendedor, taxi, cliente, 5);
		
		taxi.pagarPasaje(1500);
		tienda.existeStock();
		System.out.println("Cantidad de Asientos: " + miniBus.getCantidadDeAsientos());
		miniBus.imprimeBus();
		System.out.println("Tipo de Viaje: " + miniBus.getTipoViaje());
		
		System.out.println(tienda.getVendedor().getNombre());
		
		LibroVenta libroVenta = new LibroVenta ("venta_1","20220601");
		libroVenta.guardarVenta(cliente, miniBus);
		
	}

}

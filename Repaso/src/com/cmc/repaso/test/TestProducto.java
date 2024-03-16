package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto1 = new Producto("Manzana" , 5);
		
		producto1.setPrecio(-2);
		double precioConDescuento = producto1.calcularPrecioPromo(2);
		System.out.println("El precio con descuento es: " + precioConDescuento);
	}

}

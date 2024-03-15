package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestDemo {

	public static void main(String[] args) {
		Producto producto1 = new Producto(123, "Refrsco");
		
		producto1.setDescripcion("Bebida sin azucar.");
		producto1.setPrecio(13.80);
		
		producto1.imprimir();

	}
}

package com.clearminds.test;

import com.clearminds.componentes.Producto;

public class Main {

	public static void main(String[] args) {
		Producto producto = new Producto("Papitas", 0.50, "KE34");
		producto.incrementarPrecio(10);
		producto.disminuirPrecio(0.10);

	}

}

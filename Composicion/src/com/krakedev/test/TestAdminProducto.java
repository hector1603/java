package com.krakedev.test;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;

public class TestAdminProducto {

	public static void main(String[] args) {
		AdminProducto admin = new AdminProducto();
		Producto p1 = new Producto("Doritos", 2.50);
		Producto p2 = new Producto("Papitas", 2.50);
		
		Producto mc = admin.buscarMasCaro(p1, p2);
		
		if(mc == null) {
			System.out.println("Tienen el mismo precio");
		} else {
			System.out.println("El producto mas caro es: " + mc.getNombre());			
		}

	}

}

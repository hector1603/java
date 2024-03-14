package com.krakedev.test;

import com.krakedev.Producto;

public class TestProducto {
	public static void main(String[] args) {
		Producto productoA = new Producto("Aspirina", 1.2, 5);
		Producto productoB = new Producto("Paracetamol", 2.8, 12);
		Producto productoC = new Producto("Omeprazol", 5, 20);
		
		productoA.setDescripcion("La aspirina es un analgésico, antiinflamatorio no esteroideo (AINE) y antipirético. También tiene propiedades antiplaquetarias.");
		
		productoB.setDescripcion("El paracetamol es un analgésico y antipirético comúnmente utilizado para aliviar el dolor y reducir la fiebre. No es antiinflamatorio.");
		
		productoC.setDescripcion("El omeprazol es un inhibidor de la bomba de protones (IBP) que reduce la producción de ácido en el estómago.");

		System.out.println("----- Primer producto -----");
		System.out.println("Nombre: " + productoA.getNombre());
		System.out.println("Descripcion: " + productoA.getDescripcion());
		System.out.println("Precio: " + productoA.getPrecio());
		System.out.println("Stock: " + productoA.getStockActual());

		System.out.println("----- Segundo producto -----");
		System.out.println("Nombre: " + productoB.getNombre());
		System.out.println("Descripcion: " + productoB.getDescripcion());
		System.out.println("Precio: " + productoB.getPrecio());
		System.out.println("Stock: " + productoB.getStockActual());

		System.out.println("----- Tercer producto -----");
		System.out.println("Nombre: " + productoC.getNombre());
		System.out.println("Descripcion: " + productoC.getDescripcion());
		System.out.println("Precio: " + productoC.getPrecio());
		System.out.println("Stock: " + productoC.getStockActual());
	}
}

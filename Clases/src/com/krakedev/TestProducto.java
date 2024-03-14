package com.krakedev;

public class TestProducto {
	public static void main(String[] args) {
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		
		productoA.setNombre("Aspirina");
		productoA.setDescripcion("La aspirina es un analgésico, antiinflamatorio no esteroideo (AINE) y antipirético. También tiene propiedades antiplaquetarias.");
		productoA.setPrecio(1.2);
		productoA.setStockActual(5);
		
		productoB.setNombre("Paracetamol");
		productoB.setDescripcion("El paracetamol es un analgésico y antipirético comúnmente utilizado para aliviar el dolor y reducir la fiebre. No es antiinflamatorio.");
		productoB.setPrecio(2.8);
		productoB.setStockActual(12);
		
		productoC.setNombre("Omeprazol");
		productoC.setDescripcion("El omeprazol es un inhibidor de la bomba de protones (IBP) que reduce la producción de ácido en el estómago.");
		productoC.setPrecio(5);
		productoC.setStockActual(20);
		
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

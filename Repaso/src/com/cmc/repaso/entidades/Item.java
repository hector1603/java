package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	
	public Item(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getProductosActuales() {
		return productosActuales;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	public void imprimir() {
		System.out.println(nombre);
		System.out.println("Stock: " + productosActuales);
		System.out.println("Productos devueltos: " + productosDevueltos);
		System.out.println("Productos vendidos: " + productosVendidos);
	}
	
	public void vender(int productosVendidos) {
		productosActuales = productosActuales - productosVendidos;
		this.productosVendidos = this.productosVendidos + productosVendidos; 
	}
	
	public void devolver(int productosVendidos) {
		productosActuales = productosActuales + productosVendidos;
		this.productosVendidos = this.productosVendidos - productosVendidos;
		productosDevueltos = productosDevueltos + productosVendidos;
	}
}

package com.krakedev.demo;

public class Producto {
	private int codigo;
	private String nombre;
	private String descripcion;
	private double precio;
	
	public Producto(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void imprimir() {
		System.out.println("Código: " + getCodigo());
		System.out.println("Nombre: " + getNombre());
		System.out.println("Descripción: " + getDescripcion());
		System.out.println("Precio: " + getPrecio());
	}
}

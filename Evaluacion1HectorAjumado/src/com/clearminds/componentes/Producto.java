package com.clearminds.componentes;

public class Producto {
	private String nombre;
	private double precio;
	private String codigoProducto;
	
	public Producto(String nombre, double precio, String codigoProducto) {
		this.nombre = nombre;
		this.precio = precio;
		this.codigoProducto = codigoProducto;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public void incrementarPrecio(int incremento) {
		double montoIncremento = precio * incremento / 100;
		precio = precio + montoIncremento;
	}
	
	public void disminuirPrecio(double monto) {
		precio = precio - monto;
	}
}

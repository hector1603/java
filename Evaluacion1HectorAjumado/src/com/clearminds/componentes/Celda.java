package com.clearminds.componentes;

public class Celda {
	private Producto producto;
	private int stock;
	private String codigoCelda;
	
	public Celda(String codigoCelda) {
		this.codigoCelda = codigoCelda;
	}
	
	public Celda(Producto producto, int stock, String codigoCelda) {
		this.producto = producto;
		this.stock = stock;
		this.codigoCelda = codigoCelda;
	}

	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getCodigoCelda() {
		return codigoCelda;
	}
	public void setCodigoCelda(String codigoCelda) {
		this.codigoCelda = codigoCelda;
	}

	public void ingresarProducto(Producto producto, int stockInicial) {
		this.producto = producto;
		this.stock = stockInicial;
	}
}

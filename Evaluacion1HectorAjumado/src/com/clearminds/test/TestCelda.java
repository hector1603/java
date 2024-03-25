package com.clearminds.test;

import com.clearminds.componentes.Celda;

public class TestCelda {
	public static void main(String[] args) {
		Celda celda=new Celda("A1");
		System.out.println(celda.getProducto().getNombre());//En esta instrucción se provoca el error
		// La variable que provoca el NullPointerException es celda es decir que esta intentando hacer 
		// null.getProducto()
		
		System.out.println("CELDA:"+celda.getProducto());
		System.out.println("Nombre Producto:"+celda.getProducto().getNombre());
		System.out.println("Precio Producto:"+celda.getProducto().getPrecio());
		System.out.println("Codigo Producto:"+celda.getProducto().getCodigoProducto());
		System.out.println("STOCK:"+celda.getStock());
		System.out.println("*************************************");
	}
}

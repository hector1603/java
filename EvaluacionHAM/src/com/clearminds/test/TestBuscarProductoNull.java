package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarProductoNull {
	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");

		Producto producto = new Producto("Papitas", 0.85, "KE34");
		maquina.cargarProducto(producto, "B1", 4);

		Producto prod = maquina.buscarProductoEnCelda("A1");
		System.out.println("Producto encontrado:" + prod.getNombre());

	}

	/*
	 * El NullPointerException se dio en la linea 15 La varible que produjo este
	 * error fue prod que esta intentando hacer un null.getNombre()
	 */
}

package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		Producto p1 = new Producto("Doritos", 2.51, "ZE12");
		Producto p2 = new Producto("Pan", 0.50, "ZE13");
		Producto p3 = new Producto("Azucar", 5, "ZE14");
		Producto p4 = new Producto("Arina", 3.20, "ZE15");
		Producto p5 = new Producto("Galleta", 1.35, "ZE16");
		Producto p6 = new Producto("Paleta", 0.30, "ZE17");
		
		maquina.agregarCelda(new Celda(p1, 12, "H"));
		maquina.agregarCelda(new Celda(p2, 23, "I"));
		maquina.agregarCelda(new Celda(p3, 15, "J"));
		maquina.agregarCelda(new Celda(p4, 16, "K"));
		maquina.agregarCelda(new Celda(p5, 41, "L"));
		maquina.agregarCelda(new Celda(p6, 8, "M"));
		
		ArrayList<Producto> precioMenor = maquina.buscarMenores(2);
		System.out.println("Productos menores: " + precioMenor.size());
	}
}

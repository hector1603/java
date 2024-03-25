package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		ArrayList<String> cadena;
		String valorCadena;
		cadena = new ArrayList<String>();

		System.out.println(cadena.size());
		
		cadena.add("Uno");
		cadena.add("Dos");
		cadena.add("Tres");
		
		System.out.println(cadena.size());
		
		valorCadena = cadena.get(0);
		System.out.println(valorCadena);
		
		String valor;
		for(int i = 0; i < cadena.size(); i++) {
			valor = cadena.get(i);
			System.out.println("Valor: " + valor);
		}
	}

}

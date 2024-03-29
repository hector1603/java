package com.krakedev.test;

import com.krakedev.Persona;

public class TestPersona {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona("Hector", 29, 1.70);
		Persona persona2 = new Persona("Jadiel", 7, 1.10);
		
		System.out.println("Nombre: " + persona1.getNombre());
		System.out.println("Edad: " + persona1.getEdad());
		System.out.println("Estatura: " + persona1.getEstatura());
		
		System.out.println("------------------");
		
		System.out.println("Nombre: " + persona2.getNombre());
		System.out.println("Edad: " + persona2.getEdad());
		System.out.println("Estatura: " + persona2.getEstatura());
		
		persona2.setNombre("Lucero");
		
		System.out.println("------------------");
		System.out.println("Persona 1: " + persona1.getNombre());
		System.out.println("Persona 2: " + persona2.getNombre());
	}
}

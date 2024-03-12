package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		
		System.out.println("Nombre: " + persona1.nombre);
		System.out.println("Edad: " + persona1.edad);
		System.out.println("Estatura: " + persona1.estatura);
		
		System.out.println("------------------");
		
		persona1.nombre = "Hector";
		persona1.edad = 29;
		persona1.estatura = 1.70;
		
		System.out.println("Nombre: " + persona1.nombre);
		System.out.println("Edad: " + persona1.edad);
		System.out.println("Estatura: " + persona1.estatura);
		
		persona2.nombre = "Lucero";
		
		System.out.println("------------------");
		System.out.println("Persona 1: " + persona1.nombre);
		System.out.println("Persona 2: " + persona2.nombre);
		
	}

}

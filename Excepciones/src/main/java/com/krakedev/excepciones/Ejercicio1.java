package com.krakedev.excepciones;

public class Ejercicio1 {
	public static void main(String[] args) {
		String a = null;
		
		try {
			System.out.println("Inicio");
			System.out.println("CONEXION A LA BASE DE DATOS...");
			a.substring(3);
			System.out.println("Interno del try");
			
		} catch(Exception ex) {
			System.out.println("Ingresa al catch");
		} finally {
			System.out.println("Ingresa al finally");
			System.out.println("CONEXION CERRADA");
		}
		
		System.out.println("Fin...");
		
	}
}

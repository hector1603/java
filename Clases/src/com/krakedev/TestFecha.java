package com.krakedev;

public class TestFecha {

	public static void main(String[] args) {
		Fecha fecha = new Fecha();
		
		fecha.setAnio(2024);
		fecha.setDia(14);
		
		System.out.println("Año: " + fecha.getAnio());
		System.out.println("Día: " + fecha.getDia());
	}

}

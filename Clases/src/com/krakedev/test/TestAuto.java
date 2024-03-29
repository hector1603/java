package com.krakedev.test;

import com.krakedev.Auto;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1 = new Auto("Toyota", 2024, 22000.120);
		Auto auto2 = new Auto("Jeep", 2025, 28000.10);
		
		System.out.println("------ Primer auto ------");
		System.out.println("Marca: " + auto1.getMarca());
		System.out.println("Año: " + auto1.getAnio());
		System.out.println("Precio: " + auto1.getPrecio());
		
		System.out.println("------ Segundo auto ------");
		System.out.println("Marca: " + auto2.getMarca());
		System.out.println("Año: " + auto2.getAnio());
		System.out.println("Precio: " + auto2.getPrecio());
	}

}

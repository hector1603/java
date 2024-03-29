package com.krakedev.test;

import com.krakedev.Cuadrado;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado cuadradoPequenio = new Cuadrado();
		Cuadrado cuadradoMediano = new Cuadrado();
		Cuadrado cuadradoGrande = new Cuadrado();
		
		cuadradoPequenio.setLado(3);
		cuadradoMediano.setLado(5);
		cuadradoGrande.setLado(8);
		
		double areaP = cuadradoPequenio.calcularArea();
		double perimetroP = cuadradoPequenio.calcularPerimetro();
		System.out.println("----------------------");
		System.out.println("Cuadrado pequeño \n Area: " + areaP);
		System.out.println(" Perimetro: " + perimetroP);
		
		double areaM = cuadradoMediano.calcularArea();
		double perimetroM = cuadradoMediano.calcularPerimetro();
		System.out.println("----------------------");
		System.out.println("Cuadrado mediano \n Area: " + areaM);
		System.out.println(" Perimetro: " + perimetroM);
		
		double areaG = cuadradoGrande.calcularArea();
		double perimetroG = cuadradoGrande.calcularPerimetro();
		System.out.println("----------------------");
		System.out.println("Cuadrado grande \n Area: " + areaG);
		System.out.println(" Perimetro: " + perimetroG);

	}
}

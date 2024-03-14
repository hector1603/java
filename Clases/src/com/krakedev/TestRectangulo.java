package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo rec1 = new Rectangulo();
		Rectangulo rec2 = new Rectangulo();

		rec1.setBase(10);
		rec1.setAltura(5);

		int areaRec1 = rec1.calcularArea();
		double perimetroRec1 = rec1.calcularPerimetro();
		System.out.println("Rectangulo 1: \n Area: " + areaRec1);
		System.out.println(" Perimetro: " + perimetroRec1);
		
		System.out.println("------------------------------");

		rec2.setBase(8);
		rec2.setAltura(3);
		int areaRec2 = rec2.calcularArea();
		double perimetroRec2 = rec2.calcularPerimetro();
		System.out.println("Rectangulo 2: \n Area: " + areaRec2);
		System.out.println(" Perimetro: " + perimetroRec2);
	}
}

package com.krakedev;

public class Rectangulo {
	public int base;
	public int altura;
	
	public int calcularArea() {
		int result = base * altura;
		return result;
	}
	
	public double calcularPerimetro() {
		double result;
		result = (base * 2) + (altura * 2);
		return result;
	}

}

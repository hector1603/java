package com.krakedev;

public class Calculadora {
	
	public int sumar(int num1, int num2) {
		int result;
		result = num1 + num2;
		return result;
	}
	
	public int restar(int num1, int num2) {
		int result;
		result = num1 - num2;
		return result;
	}
	
	public double multiplicar(double valor1, double valor2) {
		double result;
		result = valor1 * valor2;
		return result;
	}
	
	public double dividir(double dividendo, double divisor) {
		double result;
		result = dividendo / divisor;
		return result;
	}
	
	public double promediar(double valor1, double valor2, double valor3) {
		double suma;
		double promedio;
		suma = valor1 + valor2 + valor3;
		promedio = suma / 3;
		return promedio;
	}
	
	
}

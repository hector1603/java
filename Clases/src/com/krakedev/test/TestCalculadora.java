package com.krakedev.test;

import com.krakedev.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		int resultSuma;
		int resultResta;
		double resultMultiplicacion;
		double resultDivicion;
		double resultPromedio;
		
		Calculadora calc = new Calculadora();
		
		resultSuma = calc.sumar(5, 3);
		resultResta = calc.restar(8, 5);
		resultMultiplicacion = calc.multiplicar(5, 5);
		resultDivicion = calc.dividir(10, 5);
		resultPromedio = calc.promediar(10, 8, 9);
		
		System.out.println("La suma es: " + resultSuma);
		System.out.println("La resta es: " + resultResta);
		
		System.out.println("------ Resultados del reto ------");
		
		System.out.println("La multiplicacion es: " + resultMultiplicacion);
		System.out.println("La divicion es: " + resultDivicion);
		System.out.println("El promedio es: " + resultPromedio);
		calc.mostrarResultado();
	}

}

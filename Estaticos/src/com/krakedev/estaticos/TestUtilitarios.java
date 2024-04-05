package com.krakedev.estaticos;

public class TestUtilitarios {

	public static void main(String[] args) {
		boolean result = Utilitarios.validar(11);
		System.out.println(result);
		
		double radio = 10;
		double area = Math.PI * radio;
		System.out.println(area);
	}

}

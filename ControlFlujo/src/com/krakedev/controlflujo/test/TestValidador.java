package com.krakedev.controlflujo.test;

import com.krakedev.controlflujo.Validador;

public class TestValidador {

	public static void main(String[] args) {
		Validador validar = new Validador();
			validar.validarEdad(12);
			validar.validarEdad(25);
			validar.validarEdad(18);
			validar.validarEdad(16);
			validar.validarEdad(10);
			validar.validarEdad(-5);
		}
}

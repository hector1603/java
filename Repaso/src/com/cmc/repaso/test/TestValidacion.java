package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion validar = new Validacion();
		
		boolean result = validar.validarMonto(21);
		System.out.println(result);
	}

}

package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestBuscarPorCedula {

	public static void main(String[] args) {
		String cedula = "94801580";
		try {
			Persona persona = AdminPersonas.buscarPorCedula(cedula);
			System.out.println("Persona encontrada:\n" + persona);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

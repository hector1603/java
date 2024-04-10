package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestBuscarFamilia {

	public static void main(String[] args) {
		String apellido = "Aguirre";
		try {
			ArrayList<Persona> personas = AdminPersonas.buscarFamilia(apellido);
			System.out.println("Personas con apellido " + apellido + ":\n" + personas);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}

package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestConsultaPersonas {

	public static void main(String[] args) {
		String nombre = "Hector";
		try {
			ArrayList<Persona> personas = AdminPersonas.buscarPorNombre(nombre);
			
			if(personas.size() > 0) {
				System.out.println(personas);				
			} else {
				System.out.println("No se encontraron personas con el nombre: " + nombre);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

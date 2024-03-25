package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejerecicio2 {

	public static void main(String[] args) {
		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		personas.add(new Persona("Hector", "Ajumado"));
		personas.add(new Persona("Jadiel", "Ajumado"));
		personas.add(new Persona("Lucas", "Ajumado"));
		personas.add(new Persona("Lucero", "Martinez"));
		
		System.out.println("El ArrayList tiien un tamaño de: " + personas.size());
		
		Persona persona;
		for(int i = 0; i < personas.size(); i++) {
			persona = personas.get(i);
			System.out.println(persona.getNombre() + " " + persona.getApellido());
		}

	}

}

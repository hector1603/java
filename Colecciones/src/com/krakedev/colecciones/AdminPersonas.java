package com.krakedev.colecciones;

import java.util.ArrayList;

public class AdminPersonas {
	private ArrayList<Persona> persona;
	
	public AdminPersonas() {
		persona = new ArrayList<Persona>();
	}
	
	public void agregar(Persona persona) {
		this.persona.add(persona);
	}
	
	public void imprimir() {
		Persona mostrarPersona;
		
		for(int i = 0; i < persona.size(); i++) {
			mostrarPersona = persona.get(i);
			System.out.println("Persona: " + mostrarPersona.getNombre() + " " + mostrarPersona.getApellido() + " - " + mostrarPersona.getEdad());
		}
	}
	
	public Persona buscarPorNombre(String nombre) {
		Persona personaEncontrada = null;
		Persona elementoPersona;
		
		for(int i = 0; i < persona.size(); i++) {
			elementoPersona = persona.get(i);
			if(nombre.equals(elementoPersona.getNombre())) {
				personaEncontrada = elementoPersona;
			}
		}
		return personaEncontrada;
	}
	
	public ArrayList<Persona> buscarMayores(int edad) {
		ArrayList<Persona> mayores = new ArrayList<Persona>();
		Persona elementoPersona;
		for(int i = 0; i < persona.size(); i++) {
			elementoPersona = persona.get(i);
			if(elementoPersona.getEdad() > edad) {
				mayores.add(elementoPersona);
			}
		}
		return mayores;
	}
}

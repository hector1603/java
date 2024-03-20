package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.setNombre("Hector");
		p1.setApellido("Ajumado");
		
		Direccion dir = new Direccion();
		dir.setCallePrimaria("Roberto Nicoli");
		dir.setCalleSecundaria("La Tapia");
		dir.setNumero("455");
		p1.setDireccion(dir);
		
		Direccion d1 = p1.getDireccion();
		
		//System.out.println(d1.getCallePrimaria());
		
		p1.imprimir();
		
		System.out.println("------------------------------------------------");
		
		Persona p2 = new Persona();
		Direccion d2 = new Direccion("Calle Progreso", "Pichincha", "321");
		p2.setNombre("Jadiel");
		p2.setDireccion(d2);
		p2.imprimir();
		
		System.out.println("------------------------------------------------");
		
		Persona p3 = new Persona("Lucero", "Martinez");	
		p3.setDireccion(new Direccion("Calle Punata", "Esteban Arce", "24"));
		p3.imprimir();
	}

}

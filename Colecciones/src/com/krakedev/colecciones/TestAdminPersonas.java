package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		AdminPersonas admin = new AdminPersonas();
		
		admin.agregar(new Persona("Mario", "Benedetti", 53));
		admin.agregar(new Persona("Petter", "Parker", 23));
		admin.agregar(new Persona("Duende", "Verde", 67));
		admin.agregar(new Persona("Nicolas", "Tesla", 83));
		admin.agregar(new Persona("Sara", "Connor", 46));
		
		admin.imprimir();
		
		Persona p1 = admin.buscarPorNombre("Diego");
		if(p1 != null) {
			System.out.println("Encontrado: " + p1.getApellido());			
		} else {
			System.out.println("No se encontro a la persona :(");
		}
		
		ArrayList<Persona> personasMayores = admin.buscarMayores(25);
		
		System.out.println("Mayores: " + personasMayores.size());
	}

}

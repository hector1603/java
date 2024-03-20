package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContacto;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		AdminContacto ac = new AdminContacto();
		
		Telefono telef = new Telefono("Claro", "59375412568", 10);
		Telefono telef2 = new Telefono("Claro", "59365214871", 20);
		Contacto c = new Contacto("Hector", "Ajumado", telef, 10);
		
		System.out.println("Nombre: " + c.getNombre() + " " + c.getApellido() + "\nOperadora: " + c.getTelefono().getOperadora() + "\nTeléfono: " + telef.getNumero()
		+ "\nPeso: " + c.getPeso());
		
		Contacto c1 = new Contacto("Marco", "Meneses", telef, 18);
		Contacto c2 = new Contacto("Danna", "Saavedra", telef2, 15);
		
		Contacto pesado = ac.buscarMasPesado(c1, c2);
		
		System.out.println("|----------------- Contacto con mayor peso -------------------|");
		
		System.out.println("Nombre: " + pesado.getNombre() + " " + pesado.getApellido());
		System.out.println("Teléfono: " + pesado.getTelefono().getNumero() + "\nOperadora: " + pesado.getTelefono().getOperadora());
		System.out.println("Peso: " + pesado.getPeso());
		
		boolean operadoras = ac.compararOperadoras(c1, c2);
		System.out.println("Las operadoras son iguales? " + operadoras);
	}

}

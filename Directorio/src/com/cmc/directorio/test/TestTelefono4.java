package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		AdminTelefono at = new AdminTelefono();
		
		Telefono tel1 = new Telefono("movi", "593254125", 10);
		Telefono tel2 = new Telefono("Claro", "593652358", 50);
		Telefono tel3 = new Telefono("movi", "593412547", 30);
		Telefono tel4 = new Telefono("Claro", "593965478", 20);
		
		int total = at.contarClaro(tel1, tel2, tel3, tel4);
		
		System.out.println("Operadora Claro: " + total);
	}

}

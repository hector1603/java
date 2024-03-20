package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		AdminTelefono at = new AdminTelefono();
		
		Telefono tel1 = new Telefono("movi", "0594125478", 10);
		Telefono tel2 = new Telefono("Claro", "0214587456", 12);
		Telefono tel3 = new Telefono("Claro", "0934512789", 20);
		
		int total = at.contarMovi(tel1, tel2, tel3);
		System.out.println("Operadora Movistar: " + total);

	}

}

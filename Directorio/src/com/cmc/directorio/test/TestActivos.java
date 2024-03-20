package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContacto;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		AdminContacto ac = new AdminContacto();
		Telefono tel1 = new Telefono("movi", "593124578", 10);
		tel1.setWhatsApp(false);
		
		Contacto c1 = new Contacto("Jadiel", "Martinez", tel1, 12);
		
		System.out.println(c1.getNombre());
		System.out.println(c1.getApellido());
		System.out.println("WhatsApp: " + c1.getTelefono().getWhatsApp());
		
		System.out.println("-------------------------------------------------");
		
		tel1.setWhatsApp(true);
		ac.activarUsuario(c1);
		System.out.println(c1.getNombre());
		System.out.println(c1.getApellido());
		System.out.println("WhatsApp: " + c1.getTelefono().getWhatsApp());
		System.out.println("Activo: " + c1.getActivo());
		
	}

}

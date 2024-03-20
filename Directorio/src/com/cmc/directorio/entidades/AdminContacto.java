package com.cmc.directorio.entidades;

public class AdminContacto {
	public Contacto buscarMasPesado(Contacto c1, Contacto c2) {
		if(c1.getPeso() > c2.getPeso()) {
			return c1;
		} else if(c1.getPeso() < c2.getPeso()) {
			return c2;
		} else {
			return null;
		}
	}
	
	public boolean compararOperadoras(Contacto con1, Contacto con2) {
		if(con1.getTelefono().getOperadora() ==  con2.getTelefono().getOperadora()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void activarUsuario(Contacto c1) {
		if(c1.getTelefono().getWhatsApp() == true) {
			c1.setActivo(true);			
		}
	}
}

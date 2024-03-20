package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono fono1) {
		if (fono1.getOperadora() == "movi") {
			fono1.setWhatsApp(true);
		}
	}

	public int contarMovi(Telefono fono1, Telefono fono2, Telefono fono3) {
		int cantidadMovi = 0;
		if (fono1.getOperadora() == "movi") {
			cantidadMovi++;
		}
		if (fono2.getOperadora() == "movi") {
			cantidadMovi++;
		}
		if (fono3.getOperadora() == "movi") {
			cantidadMovi++;
		}
		return cantidadMovi;
	}
	
	public int contarClaro(Telefono fono1, Telefono fono2, Telefono fono3, Telefono fono4) {
		int cantidadClaro = 0;
		if(fono1.getOperadora() == "Claro") {
			cantidadClaro++;
		}
		if(fono2.getOperadora() == "Claro") {
			cantidadClaro++;
		}
		if(fono3.getOperadora() == "Claro") {
			cantidadClaro++;
		}
		if(fono4.getOperadora() == "Claro") {
			cantidadClaro++;
		}
		return cantidadClaro;
	}
}

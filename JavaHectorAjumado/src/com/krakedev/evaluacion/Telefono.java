package com.krakedev.evaluacion;

public class Telefono {
	private String numero;
	private String tipo;
	private String estado;
	
	public Telefono(String numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
		
		if(numero != null && tipo != null) {
			if(tipo.equalsIgnoreCase("Movil") || tipo.equalsIgnoreCase("Convencional")) {
				if(tipo.equalsIgnoreCase("Movil") && numero.length() == 10) {
					estado = "C";
				} else if(tipo.equalsIgnoreCase("Convencional") && numero.length() == 7) {
					estado = "C";
				} else {
					estado = "E";
				}
			} else {
				estado = "E";
			}
		} else {
			estado = "E";
		}
	}
	
	public String getNumero() {
		return numero;
	}
	public String getTipo() {
		return tipo;
	}
	public String getEstado() {
		return estado;
	}
	
	
}

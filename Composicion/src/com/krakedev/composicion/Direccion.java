package com.krakedev.composicion;

public class Direccion {
	private String callePrimaria;
	private String calleSecundaria;
	private String numero;
	private double latitud;
	private double longitud;
	
	public Direccion() {
		
	}
	
	public Direccion(String callePrimaria, String calleSecundaria, String numero) {
		this.callePrimaria = callePrimaria;
		this.calleSecundaria = calleSecundaria;
		this.numero = numero;
	}
	
	public String getCallePrimaria() {
		return callePrimaria;
	}
	public void setCallePrimaria(String callePrimaria) {
		this.callePrimaria = callePrimaria;
	}
	public String getCalleSecundaria() {
		return calleSecundaria;
	}
	public void setCalleSecundaria(String calleSecundaria) {
		this.calleSecundaria = calleSecundaria;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

}

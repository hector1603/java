package com.cmc.directorio.entidades;

public class Telefono {
	private String operadora;
	private String numero;
	private int codigo;
	private boolean whatsApp;

	public Telefono(String operadora, String numero, int codigo) {
		this.operadora = operadora;
		this.numero = numero;
		this.codigo = codigo;
		this.whatsApp = false;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public boolean getWhatsApp() {
		return whatsApp;
	}

	public void setWhatsApp(boolean whatsApp) {
		this.whatsApp = whatsApp;
	}

	public void imprimir() {
		System.out.println("Operadora: " + operadora + "\nNúmero: " + numero 
				+ "\nCódigo: " + codigo + "\nWhatsApp: " + whatsApp);
	}
}

package com.cmc.evaluacion.servicios;

public class Utilitario {
	public double redondear(double valor) {
		double numeroRedondeado = (double) Math.round(valor * 100) / 100;
		return numeroRedondeado;
	}
}

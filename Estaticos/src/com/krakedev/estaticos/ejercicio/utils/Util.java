package com.krakedev.estaticos.ejercicio.utils;

public class Util {
	public static String formatearHora(int numero) {
		String valor = numero + "";
		if(numero < 10) {
			valor = "0" + valor;
		}
		return valor;
	}
	
	public static String formatearMinuto(int numero) {
		String valor = numero + "";
		if(numero < 10) {
			valor = "0" + valor;
		}
		return valor;
	}
	
	public static String formatearDias(int numero) {
		String dia;
		if(numero == 0) {
			dia = "LUNES"; 
		} else if(numero == 1) {
			dia = "MARTES";
		} else if(numero == 2) {
			dia = "MIERCOLES";
		} else if(numero == 3) {
			dia = "JUEVES";
		} else if(numero == 4) {
			dia = "VIERNES";
		} else if(numero == 5) {
			dia = "SABADO";
		} else if(numero == 6) {
			dia = "DOMINGO";
		} else {
			dia = "No existe el día " + numero;
		}
		return dia;
	}
}

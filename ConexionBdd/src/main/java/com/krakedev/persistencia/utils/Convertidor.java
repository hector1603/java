package com.krakedev.persistencia.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Convertidor {
	private static final String FECHA = "yyyy/MM/dd";
	private static final String HORA = "HH:mm";
	
	public static Date convertirFecha(String fechaStr) throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat(FECHA);
		Date fecha = null;
		try {
			fecha = sdf.parse(fechaStr);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new Exception("La fecha no tiene el formato correcto");
		}	
		return fecha;
	}
	
	public static Date convertirHora(String horaStr) throws Exception{
		SimpleDateFormat sdf = new SimpleDateFormat(HORA);
		Date hora = null;
		try {
			hora = sdf.parse(horaStr);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new Exception("La hora no tiene el formato correcto");
		}	
		return hora;
	}
}

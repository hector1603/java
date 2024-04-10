package com.krakedev.conexionbdd;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFecha {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String fechaStr = "1998/09/01 10:05:04";
		try {
			Date fecha = sdf.parse(fechaStr);
			System.out.println(fecha);
			long fechaMilis = fecha.getTime();
			System.out.println(fechaMilis);
			java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
			Time timeSQL = new Time(fechaMilis);
			System.out.println(fechaSQL + " | " + timeSQL);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}

package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlarmas {

	public static void main(String[] args) {
		AdminAlarmas aa = new AdminAlarmas();
		aa.agregarAlarma(new Alarma(DiasSemana.LUNES, 12, 0));
		aa.agregarAlarma(new Alarma(DiasSemana.MARTES, 5, 0));
		aa.agregarAlarma(new Alarma(DiasSemana.MIERCOLES, 5, 0));
		aa.agregarAlarma(new Alarma(DiasSemana.JUEVES, 5, 0));
		
		ArrayList<Alarma> alarmasActuales = aa.getAlarmas();
		System.out.println(alarmasActuales);
	}

}

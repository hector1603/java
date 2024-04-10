package com.krakedev.persistencia.test;

import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminPersona {
	public static void main(String[] args) {
		EstadoCivil ul = new EstadoCivil("U","Union Libre");
		EstadoCivil s = new EstadoCivil("S","Soltero");
		EstadoCivil c = new EstadoCivil("C","Casado");
		
		Persona p1 = new Persona("94801580", "Hector", "Ajumado", s);
		
		try {
			Date fechaNacimiento = Convertidor.convertirFecha("1994/03/16");
			Date horaNacimiento = Convertidor.convertirHora("00:26");
			p1.setFechaNacimiento(fechaNacimiento);
			p1.setHoraNacimiento(horaNacimiento);
			
			AdminPersonas.insertar(p1);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}

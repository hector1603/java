package com.krakedev.test;

import com.krakedev.Mensajeria;

public class TestMensajeria {
	
	public static void main(String[] args) {
		Mensajeria mensaje = new Mensajeria();
		
		mensaje.saludar();
		mensaje.saludarPersona("Hector", "Ajumado" + " eres un CRACK");
	}

}

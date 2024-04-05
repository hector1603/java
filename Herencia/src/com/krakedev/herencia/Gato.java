package com.krakedev.herencia;

public class Gato extends Animal{
	@Override
	public void dormir() {
		System.out.println("Gato durmiendo");
	}
	
	public void maullar() {
		System.out.println("Gato maullando...");
	}
	
	public void maullar(String tamanio) {
		System.out.println("Gato " + tamanio + " maullando..." );
	}
}

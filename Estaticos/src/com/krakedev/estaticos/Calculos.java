package com.krakedev.estaticos;

public class Calculos {
	public final double IVA = 13;
	
	public double calcularIVA(double monto) {
		return monto * 12 /100;
	}
}

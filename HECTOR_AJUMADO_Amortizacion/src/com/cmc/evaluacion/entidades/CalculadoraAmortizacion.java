package com.cmc.evaluacion.entidades;

public class CalculadoraAmortizacion {

	public static double calcularCuota(Prestamo prestamo) {
		double interes = (prestamo.getInteres() / 12) / 100;

		double cuota = (prestamo.getMonto() * interes) / (1 - (Math.pow((1 + interes), -(prestamo.getPlazo()))));
		return cuota;
	}

	public void generarTabla(Prestamo prestamo) {
		double cuota = calcularCuota(prestamo);

		for (int i = 0; i < prestamo.getPlazo(); i++) {
			Cuota c = new Cuota(i + 1);
			c.setCuota(cuota);
			prestamo.getCuotas().add(c);
		}

		prestamo.getCuotas().get(0).setInicio(prestamo.getMonto());

		for (int i = 0; i < prestamo.getPlazo(); i++) {
			Cuota cuotaActual = prestamo.getCuotas().get(i);
			Cuota cuotaSiguiente = (i < prestamo.getPlazo() - 1) ? prestamo.getCuotas().get(i + 1) : null;
			calcularValoresCuota(prestamo.getInteres(), cuotaActual, cuotaSiguiente);
		}

		ajustarUltimaCuota(prestamo);
	}

	private void calcularValoresCuota(double interes, Cuota cuotaActual, Cuota cuotaSiguiente) {

		double tasaInteres = interes / 100.0;
		double interesCuota = cuotaActual.getInicio() * tasaInteres;
		double abonoCapital = cuotaActual.getCuota() - interesCuota;
		double saldo = cuotaActual.getInicio() - abonoCapital;

		cuotaActual.setInteres(interesCuota);
		cuotaActual.setAbonoCapital(abonoCapital);
		cuotaActual.setSaldo(saldo);

		if (cuotaSiguiente != null) {
			cuotaSiguiente.setInicio(saldo);
		}

	}

	public void ajustarUltimaCuota(Prestamo préstamo) {
		Cuota ultimaCuota = préstamo.getCuotas().get(préstamo.getPlazo() - 1);
		double saldoFinal = Math.max(0, ultimaCuota.getSaldo());
		ultimaCuota.setCuota(ultimaCuota.getCuota() + saldoFinal);
		ultimaCuota.setAbonoCapital(ultimaCuota.getAbonoCapital() + saldoFinal);
		ultimaCuota.setSaldo(0);
	}

	public void mostrarTabla(Prestamo prestamo) {
		System.out.println("Tabla de Amortización:");
		System.out.println("Numero |  Cuota  |  Inicio  |  Interes  |  Abono  |  Saldo");
		System.out.println("-------------------------------------------------------------");
		for (Cuota cuota : prestamo.getCuotas()) {
			System.out.printf("%5d | %8.2f | %8.2f | %8.2f | %8.2f | %8.2f\n", cuota.getNumero(), cuota.getCuota(),
					cuota.getInicio(), cuota.getInteres(), cuota.getAbonoCapital(), cuota.getSaldo());
		}
	}

}

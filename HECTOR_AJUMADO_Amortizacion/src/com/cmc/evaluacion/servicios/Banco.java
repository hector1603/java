package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.CalculadoraAmortizacion;
import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Prestamo;

public class Banco {
	private ArrayList<Prestamo> prestamos;
	private ArrayList<Cliente> clientes;

	public Banco() {
		this.prestamos = new ArrayList<>();
		this.clientes = new ArrayList<>();
	}

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public Cliente buscarCliente(String cedula) {
		for (Cliente cliente : clientes) {
			if (cliente.getCedula().equals(cedula)) {
				return cliente;
			}
		}
		return null;
	}

	public void registrarCliente(Cliente cliente) {
		if (buscarCliente(cliente.getCedula()) == null) {
			clientes.add(cliente);
			System.out.println("Cliente registrado correctamente.");
		} else {
			System.out.println("El cliente ya existe en el banco.");
		}
	}

	public void asignarPrestamo(String cedulaCliente, Prestamo prestamo) {
	    Cliente cliente = buscarCliente(cedulaCliente);
	    if (cliente == null) {
	        System.out.println("No es cliente del banco.");
	    } else {
	        prestamos.add(prestamo);
	        
	        CalculadoraAmortizacion calculadora = new CalculadoraAmortizacion();
	        calculadora.generarTabla(prestamo);
	        calculadora.mostrarTabla(prestamo); 
	        
	        System.out.println("Préstamo asignado correctamente.");
	    }
	}

	public ArrayList<Prestamo> buscarPrestamos(String cedulaCliente) {
		ArrayList<Prestamo> prestamosCliente = new ArrayList<>();
		for (Prestamo prestamo : prestamos) {
			if (prestamo.getCliente() != null && prestamo.getCliente().getCedula().equals(cedulaCliente)) {
		        prestamosCliente.add(prestamo);
		    }
		}
		if (prestamosCliente.isEmpty()) {
			return null;
		} else {
			return prestamosCliente;
		}
	}
}

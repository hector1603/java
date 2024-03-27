package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;

	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefonos = new ArrayList<>();
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public void agregarTelefono(Telefono telefono) {
		telefonos.add(telefono);
	}

	public void mostrarTelefonos() {
		System.out.println("Teléfonos con estado 'C':");
		for (int i = 0; i < telefonos.size(); i++) {
			Telefono telefonoX = telefonos.get(i);
			if (telefonoX.getEstado() == "C") {
				System.out.println("Teléfono: " + telefonoX.getNumero() + ", Tipo: " + telefonoX.getTipo());
			}
		}
	}

	public ArrayList<Telefono> recuperarIncorrectos() {
        ArrayList<Telefono> incorrectos = new ArrayList<>();
        for (Telefono telefono : telefonos) {
            if (telefono.getEstado() == "E") {
                incorrectos.add(telefono);
            }
        }
        return incorrectos;
    }
	
	public void imprimir() {
		System.out.println("Cédula: " + cedula 
						+ "\nNombre: " + nombre
						+ "\nApellido: " + apellido);
		if(direccion != null) {
			System.out.println("Dirección: " 
							+ "\n Calle Principal: " + direccion.getCallePrincipal()
							+ "\n Calle Secundaria: " + direccion.getCalleSecundaria());
		} else {
			System.out.println("No existe una dirección asociada.");
		}
	}

	public void imprimir2() {
		System.out.println("**** " + nombre + " " + apellido + " ****");
		if (direccion != null) {
			System.out.println("Dirección: " + direccion.getCallePrincipal() + " y " + direccion.getCalleSecundaria());
		} else {
			System.out.println("No tiene una dirección asociada");
		}
	}
}

package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private ArrayList<Contacto> incorrectos;
	private ArrayList<Contacto> correctos;

	public Directorio() {
		this.contactos = new ArrayList<>();
		this.fechaModificacion = new Date();
		this.correctos = new ArrayList<>();
		this.incorrectos = new ArrayList<>();
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}
	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}
	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}
	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}



	public Contacto buscarPorCedula(String cedula) {
		Contacto contactoEncontrado = null;
		for (int i = 0; i < contactos.size(); i++) {
			Contacto contactoX = contactos.get(i);
			if (cedula.equals(contactoX.getCedula())) {
				contactoEncontrado = contactoX;
			}
		}
		return contactoEncontrado;
	}

	public boolean agregarContacto(Contacto contacto) {
		if(buscarPorCedula(contacto.getCedula()) == null) {
			contactos.add(contacto);
			fechaModificacion = new Date();
			return true;
		}
		return false;
	}
	
	public String consultarUltimaModificacion() {
		SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return formatoFecha.format(fechaModificacion);
	}
	
	public int contarPerdidos() {
		int contarPerdidos = 0;
		for(int i = 0; i < contactos.size(); i++) {
			Contacto contactoX = contactos.get(i);
			if(contactoX.getDireccion() == null) {
				contarPerdidos++;
			}
		}
		return contarPerdidos;
	}
	
	public int contarFijos() {
	    int contarFijos = 0;
	    for (int i = 0; i < contactos.size(); i++) {
	        Contacto contacto = contactos.get(i);
	        ArrayList<Telefono> telefonos = contacto.getTelefonos();
	        for (Telefono telefono : telefonos) {
	            if (telefono.getTipo().equalsIgnoreCase("Convencional") && telefono.getEstado().equals("C")) {
	                contarFijos++;
	                break;
	            }
	        }
	    }
	    return contarFijos;
	}
	
	public void depurar() {
		for(int i = 0; i < contactos.size(); i++) {
			Contacto contactoX = contactos.get(i);
			if(contactoX.getDireccion() != null) {
				correctos.add(contactoX);
			} else {
				incorrectos.add(contactoX);
			}
		}
		contactos.clear();
	}

}

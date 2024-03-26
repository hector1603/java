package krakedev.notas.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;
	
	public Estudiante(String nombre, String apellido, String cedula) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.notas = new ArrayList<>();
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

	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

	
	public void agregarNota(Nota notaNueva) {
	    boolean materiaExistente = false;
	    for (Nota nota : notas) {
	        if (notaNueva.getMateria().getCodigo().equals(nota.getMateria().getCodigo())) {
	            materiaExistente = true;
	            break;
	        }
	    }
	    if (!materiaExistente) {
	        notas.add(notaNueva);
	    } else {
	        System.out.println("Ya existe una nota para esta materia.");
	    }
	}

	
	public void modificarNota(String codigo, double notaNueva) {
		Nota elementoNota;
		for(int i = 0; i < notas.size(); i++) {
			elementoNota = notas.get(i);
			if(codigo == elementoNota.getMateria().getCodigo()) {
				if(notaNueva >= 0 && notaNueva <= 10) {
					elementoNota.setCalificacion(notaNueva);
					System.out.println("Nota modificada exitosamente.");
				}
			} else { 
				System.out.println("No se encontro el código.");
			}
		}		
	}
	
	public double calcularPromedioNotasEstudiante() {
		double sumaNotas = 0;
		
		for(int i = 0; i < notas.size(); i++) {
			Nota elementoNota = notas.get(i);
			sumaNotas += elementoNota.getCalificacion();
		}
		
		if(notas.size() > 0) {
			return sumaNotas / notas.size();
		} else {
			return 0;
		}
		
		
		
		/*
		Nota elementoNota;
		int contador = 0;
		double sumaNotas = 0;
		double total = 0;
		double promedio;
		for(int i = 0; i < notas.size(); i++) {
			elementoNota = notas.get(i);
			total = sumaNotas + elementoNota.getCalificacion();
			contador++;
		}
		promedio = total / contador;
		return promedio;*/
	}
	
	public void mostrar() {
		System.out.print("Nombre: " + nombre + " " + apellido
							+ " Cédula: " + cedula 
							+ " Notas: [");
		for(int i = 0; i < notas.size(); i++) {
			Nota notaX = notas.get(i);
			notaX.mostrar();
		}
		System.out.println("]");
		
		/*
		Nota elementoNota = null;
		System.out.println("Nombre: " + nombre + " " + apellido + "\nCedula: " + cedula);
		for(int i = 0; i < notas.size(); i++) {
			elementoNota = notas.get(i);
			System.out.println("Materia: " + elementoNota.getMateria() + " Calificación: " + elementoNota.getCalificacion());
		}
		*/
	}
}

package krakedev.notas.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes;

	public Curso() {
		this.estudiantes = new ArrayList<>();
	}

	public Curso(ArrayList<Estudiante> listaEstudiantes) {
		this.estudiantes = listaEstudiantes;
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public Estudiante buscarEstudiantePorCedula(Estudiante estudiante) {

		if (estudiantes != null) {
			for (Estudiante estudiante1 : estudiantes) {
				if (estudiante.getCedula().equals(estudiante1.getCedula())) {
					return estudiante1;
				}
			}
		}
		return null;

		/*
		 * for(int i = 0; i < estudiantes.size(); i++) { Estudiante elementoEstudiante =
		 * estudiantes.get(i); if(elementoEstudiante.equals(estudiante)) { return
		 * elementoEstudiante; } } System.out.println("No existe el estudiante.");
		 * return null;
		 */
	}

	public void matricularEstudiante(Estudiante estudiante) {
		Estudiante estudianteEncontrado = buscarEstudiantePorCedula(estudiante);
		if (estudianteEncontrado == null) {
			estudiantes.add(estudiante);
		}
	}

	public double calcularPromedioCurso() {
		Estudiante elementoEstudiante;
		double promedioCurso;
		double promedioIndividual = 0;
		double total = 0;
		int contador = 0;
		for (int i = 0; i < estudiantes.size(); i++) {
			elementoEstudiante = estudiantes.get(i);
			if (elementoEstudiante != null) {
				promedioCurso = promedioIndividual + elementoEstudiante.calcularPromedioNotasEstudiante();
				contador++;
				total = promedioCurso / contador;
			} else {
				System.out.println("Error.");
			}
		}
		return total;
	}

	public void mostrar() {
		for(int i = 0; i < estudiantes.size(); i++) {
			Estudiante estudianteX = estudiantes.get(i);
			estudianteX.mostrar();
		}
	}
}

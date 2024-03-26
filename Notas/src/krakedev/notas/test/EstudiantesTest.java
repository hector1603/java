package krakedev.notas.test;

import krakedev.notas.entidades.Estudiante;
import krakedev.notas.entidades.Materia;
import krakedev.notas.entidades.Nota;

public class EstudiantesTest {
	public static void main(String[] args) {
		Estudiante estudiante = new Estudiante("Jaimito", "Perez", "1234567890");
		Estudiante estudiante2 = new Estudiante("Juan", "Perez", "1234567890");
		Materia ciencias = new Materia("3", "Ciencias");
		Materia matematicas = new Materia("2", "Matematicas");

		Nota nuevaNota = new Nota(ciencias, 9.0);
		Nota nuevaNota2 = new Nota(ciencias, 9.0);
		Nota nuevaNota3 = new Nota(matematicas, 2.0);
		Nota nuevaNota4 = new Nota(matematicas, -8.0);

		estudiante.agregarNota(nuevaNota);
		// No deberia dejar ingresar esta nota ya que la calificacion esta duplicada.
		estudiante.agregarNota(nuevaNota2);
		// No deberia dejar ingresar esta nota ya que la calificacion es menor a 0.
		estudiante.agregarNota(nuevaNota3);
		estudiante.agregarNota(nuevaNota4);
		
		estudiante.modificarNota("3", 10.00);
		// No deberia dejar modificar esta nota ya que la calificacion es menor a 0.
		estudiante.modificarNota("3", -1);
		System.out.println(estudiante.calcularPromedioNotasEstudiante());

		estudiante.mostrar();
	}
}

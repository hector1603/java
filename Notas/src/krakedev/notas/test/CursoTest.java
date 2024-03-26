package krakedev.notas.test;

import krakedev.notas.entidades.Curso;
import krakedev.notas.entidades.Estudiante;
import krakedev.notas.entidades.Materia;
import krakedev.notas.entidades.Nota;

public class CursoTest {

	public static void main(String[] args) {
		     Curso curso1 = new Curso();
			 Materia sociales= new Materia("COD1", "Sociales");
			 Materia matematicas= new Materia("COD2", "Matematicas");
			 Materia lenguaje= new Materia("COD3", "Lenguaje");

			 Estudiante estudiante = new Estudiante("Juan", "Perez", "1234567890");
			 Estudiante estudiante2 = new Estudiante("Juancito", "Gomez", "12345678290");
		     Nota nota1 = new Nota(sociales, 10.0);
		     Nota nota2 = new Nota(matematicas, 10.0);
		     Nota nota3 = new Nota(lenguaje, 10.0);
		     
		     Nota nota11 = new Nota(sociales,5.0);
		     Nota nota12 = new Nota(matematicas, 5.0);
		     Nota nota13 = new Nota(lenguaje, 10.0);
		     
		     //Agrega 3 nuevas calificaciones  a Estudiante 1
		     estudiante.agregarNota(nota1);
		     estudiante.agregarNota(nota2);
		     estudiante.agregarNota(nota3);

		     //Agrega 3 nuevas calificaciones  a Estudiante 2
		     estudiante2.agregarNota(nota11);
		     estudiante2.agregarNota(nota12);
		     estudiante2.agregarNota(nota13);
	
		     curso1.matricularEstudiante(estudiante);
		     curso1.matricularEstudiante(estudiante2);
		     
		     System.out.println(curso1.getEstudiantes().size());
		     System.out.println(curso1.calcularPromedioCurso());

		     curso1.mostrar();
	}

}


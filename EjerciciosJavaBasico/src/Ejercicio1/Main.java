package Ejercicio1;

public class CalculoNotasMain {
	public static void main(String[] args) {

//		Calcular la nota media, nota mayor y nota menor de una serie de alumnos.

		Alumnos[] alumnos = new Alumnos[5];
		alumnos[0] = new Alumnos("Juan", 5, 6, 7);
		alumnos[1] = new Alumnos("Pedro", 6, 7, 8);
		alumnos[2] = new Alumnos("Maria", 7, 8, 9);
		alumnos[3] = new Alumnos("Luis", 8, 9, 10);
		alumnos[4] = new Alumnos("Ana", 9, 10, 10);

//		Recorrer con un foreach cada alumno y mostrar su nombre, nota media, nota mayor y nota menor.
		for (Alumnos alumno : alumnos) {
			System.out.println(alumno.getNombre() +
					" tiene una media de " +
					alumno.getMedia() +
					", la nota mayor es " +
					alumno.getMayor() +
					" y la nota menor es " +
					alumno.getMenor());
		}

	}
}
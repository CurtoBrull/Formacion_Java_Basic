package Ejercicio1;

public class Main {
	public static void main(String[] args) {

//		Calcular la nota media, nota mayor y nota menor de una serie de alumnos.

		Alumnos[] alumnos = new Alumnos[5];
		alumnos[0] = new Alumnos("Juan", 5.5, 6.0, 7.3);
		alumnos[1] = new Alumnos("Pedro", 6.4, 7.0, 8.7);
		alumnos[2] = new Alumnos("Maria", 7.0, 8.0, 9.5);
		alumnos[3] = new Alumnos("Luis", 8.1, 9.2, 10.0);
		alumnos[4] = new Alumnos("Ana", 9.9, 10.0, 10.0);

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
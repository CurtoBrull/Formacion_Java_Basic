package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class Main {
	public static void main(String[] args) {

		System.out.println("-------- EJ 1 ----------");


//		1.	Filtrar los elementos divisibles por algún número específico que oscila entre 0 y 10.

//		Lista de números a dividir
		List<Integer> numbers = Arrays.asList(
				0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		);

		int value = numRandom(0, 10);
		System.out.println("El valor aleatorio es: " + value);

		System.out.println("Los números divisibles por " + value + " son los siguientes:");
		try {
//			Filtrar
			numbers.stream()
					.filter(num -> num % value == 0)
					.forEach(System.out::println);
		} catch (ArithmeticException e) {
			System.out.println("No se puede dividir por 0");
		}

		System.out.println("\n-------- EJ 2 ----------");

//		2.	Filtrar los elementos con una letra mayúscula en cualquier índice específico.

		List<String> words = new ArrayList<>();
		words.add("Primeros");
		words.add("sEgundos");
		words.add("teRceros");
		words.add("cuaRtos");
		words.add("quinTos");
		words.add("sextoS");


//		Aleatorio para la posición buscada
		int index = numRandom(0, 5);
		System.out.print("La palabra con la letra mayúscula en el índice " + index + " es: ");

//		Filtrar la lista
		words.stream()
				.filter(word -> Character.isUpperCase(word.charAt(index)))
				.forEach(System.out::println);

		System.out.println("\n-------- EJ 3 ----------");

//	3.	Filtrado de los elementos que terminan con letras alfabéticas personalizadas.

//		Añado algunas palabras a la lista que terminen de forma diferente entre ellas
		words.add("Cualquier");
		words.add("Javier");
		words.add("Curto");
		words.add("Brull");


		System.out.println("Las palabras que terminan en 'ier' son las siguientes:");
//		Filtrado con endsWith
		words.stream()
				.filter(word -> word.endsWith("ier"))
				.forEach(System.out::println);

		System.out.println("\n-------- EJ 4 ----------");

//		Ejercicios con la clase Curso

		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Curso profesional de Java", 6.5f, 50, 200));
		cursos.add(new Curso("Curso profesional de Python", 8.5f, 60, 800));
		cursos.add(new Curso("Curso profesional de DB", 4.5f, 70, 700));
		cursos.add(new Curso("Curso profesional de Android", 7.5f, 10, 400));
		cursos.add(new Curso("Curso profesional de Escritura", 1.5f, 10, 300));

//		•	Obtener la cantidad de cursos con una duración mayor a 5 horas.

//		Filtrado por duración y recuento del resultado con count
		int count1 = (int) cursos.stream()
				.filter(curso -> curso.getDuracion() > 5)
				.count();
		System.out.println("Total de cursos de más de 5 horas = " + count1);

		System.out.println("\n-------- EJ 5 ----------");


//		•	Obtener la cantidad de cursos con una duración menor a 2 horas.

//		Filtrado por duración y recuento del resultado con count
		int count2 = (int) cursos.stream()
				.filter(curso -> curso.getDuracion() < 2)
				.count();

		System.out.println("Total de cursos de menos de 2 horas = " + count2);

		System.out.println("\n-------- EJ 6 ----------");


//		•	Listar el título de todos aquellos cursos con una cantidad de vídeos mayor a 50.

//		Con un filter
		cursos.stream()
				.filter(curso -> curso.getVideos() > 50)
				.forEach(curso -> System.out.println("El \"" + curso.getTitulo() + "\" tiene más de 50 vídeos"));

		System.out.println("\n-------- EJ 7 ----------");


//		•	Mostrar en consola el título de los 3 cursos con mayor duración.

//		Sorted con los resultados de compare
//		Compare devuelve 0 si son iguales, 1 si el primero es mayor y -1 si el segundo es mayor
		cursos.stream()
				.sorted((dur1, dur2) -> Float.compare(dur2.getDuracion(), dur1.getDuracion()))
				.limit(3) // Limita el resultado a 3
				.forEach(curso -> System.out.println("El \"" + curso.getTitulo() + "\" es uno de los cursos más largos: " + curso.getDuracion() + " horas"));

		System.out.println("\n-------- EJ 8 ----------");

//		•	Mostrar en consola la duración total de todos los cursos.

		double dur = cursos.stream()
				.mapToDouble(Curso::getDuracion)// Mapeo de la duración. En lambda seria curso -> curso.getDuracion()
				.sum(); // Suma del resultado

		System.out.println("La duración total de los cursos es de " + dur + " horas");

		System.out.println("\n-------- EJ 9 ----------");

//		•	Mostrar en consola todos aquellos cursos que superen el promedio en cuanto a duración se refiere.

//		Obtengo el promedio de duración de los cursos con average
		double avg = cursos.stream()
				.mapToDouble(Curso::getDuracion)
				.average()
				.getAsDouble();

		System.out.println("El promedio de duración de los cursos es de " + avg + " horas.");

//		Cursos que superen el promedio
		cursos.stream()
				.filter(curso -> curso.getDuracion() > avg)
				.forEach(curso -> System.out.println("El \"" + curso.getTitulo() + "\" con una duración de " + curso.getDuracion() + " supera el promedio"));

		System.out.println("\n-------- EJ 10 ----------");

//		•	Mostrar en consola la duración de todos aquellos cursos que tengan una cantidad de alumnos inscritos menor a 500.
		System.out.println("Cursos con menos de 500 alumnos:");

//		Filter con los cursos con menos de 500 alumnos e imprimimos la duración de cada uno
		cursos.stream()
				.filter(curso -> curso.getAlumnos() < 500)
				.forEach(curso -> System.out.println("El \"" + curso.getTitulo() + "\" con una duración de " + curso.getDuracion() + " horas tiene " + curso.getAlumnos() + " alumnos"));

		System.out.println("\n-------- EJ 11 ----------");

//		•	Obtener el curso con mayor duración.

//		Se puede reutilizar el codigo del ejercicio 7 y limitarlo a 1
		cursos.stream()
				.sorted((dur1, dur2) -> Float.compare(dur2.getDuracion(), dur1.getDuracion()))
				.limit(1) // Limita el resultado a 1
				.forEach(curso -> System.out.println("El \"" + curso.getTitulo() + "\" es el más largo: " + curso.getDuracion() + " horas"));

		System.out.println("\n-------- EJ 12 ----------");

//		•	Crear una lista de Strings con todos los titulos de los cursos.

//		Se crea una lista de Strings y se le asigna el resultado del map
		List<String> titles =
				cursos.stream()
						.map(Curso::getTitulo) // Mapeo del titulo. En lambda seria curso -> curso.getTitulo()
						.collect(Collectors.toList()); // Se crea un collector para convertir el stream en una lista

		System.out.println("Títulos de todos los cursos:");
		titles.forEach(title -> {
			int ind = titles.indexOf(title);
			System.out.println(ind + 1 + ". " + title);
		});
	}

	/**
	 * Generador de número aleatorio entre 2 valores
	 *
	 * @param min
	 * @param max
	 * @return num aleatorio
	 */
	public static int numRandom(int min, int max) {
		Random random = new Random();
		return random.nextInt(max + min) + min;
	}

}
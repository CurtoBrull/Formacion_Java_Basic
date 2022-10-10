package Ejercicio6;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {

		String texto = "hola mundo";
		System.out.println(reverse(texto));

//		1. Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
		String[] array = {"hola", "mundo", "desde", "array"};

		for (String i : array) {
			System.out.print(i + " ");
		}
		System.out.println("\n");

//		2. Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
		int[][] array2 = {
				{1, 2, 3},
				{4, 5, 6}
		};

//		2.1. Recorriendo con for por cada fila
		for (int i = 0; i < array2.length; i++) {
//			2.2. Recorriendo con for por cada columna
			for (int j = 0; j < array2[i].length; j++) {
				System.out.println("Posición: " + i + "-" + j + "\nValor = " + array2[i][j]);
			}
		}
//		3. Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3.er elemento y muestra el resultado final.
		Vector<Integer> vector = new Vector<>();

		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		vector.add(5);

		System.out.println("\nVector original = " + vector);

		vector.remove(1);
		vector.remove(2);

		System.out.println("Vector modificado = " + vector);

//		4. Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
		/*
		 * Los vectores al desbordarse por defecto duplican su tamaño por lo que puede ser un problema cuando son cantidades grandes de datos.
		 * Se puede indicar la capacidad y el incremento en cada desbordamiento para evitar este problema.
		 */

//		5. Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("hola");
		arrayList.add("mundo");
		arrayList.add("con");
		arrayList.add("ArrayList y LinkedList");

		System.out.println("\nDesde ArrayList:");
		for (String i : arrayList) {
			System.out.print(i + " ");
		}

		LinkedList<String> linkedList = new LinkedList<>(arrayList);
		System.out.println("\nDesde LinkedList:");

		for (String i : linkedList) {
			System.out.print(i + " ");
		}

		System.out.println("\n");

		/*
		 * 6. Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
		 * A continuación, con otro bucle, recórrelo y elimina los números pares.
		 * Por último, vuelve a recorrerlo y muestra el ArrayList final.
		 * Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
		 */

		ArrayList<Integer> arrayList2 = new ArrayList<>();

//		 6.1. Rellenando el ArrayList
		for (int i = 1; i <= 10; i++) {
			arrayList2.add(i);
		}

		System.out.println(arrayList2);

//		6.2. Recorriendo con for
		for (int i = 0; i < arrayList2.size(); i++) {
//			6.2. Eliminando los números pares
			if (arrayList2.get(i) % 2 == 0) {
				arrayList2.remove(i);
			}
		}

//		 6.3. Recorriendo con for
		for (int i = 0; i < arrayList2.size(); i++) {
//			6.3. Mostrando el ArrayList final
			System.out.print(arrayList2.get(i) + " ");
		}

		System.out.println("\n");



		/*
		 * 7. Crea una función DividePorCero.
		 * Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante (desde "main", por ejemplo).
		 * Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
		 */

		DividePorCero(1);

		/*
		 * 8. Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
		 * La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
		 */

		copiaFichero("OBC_Ejercicios_Java/src/Ejercicio6/texto.txt", "OBC_Ejercicios_Java/src/Ejercicio6/textoCopy.txt");

	}

	public static void copiaFichero(String fileIn, String fileOut) {

		try {
			InputStream in = new FileInputStream(fileIn);

			BufferedInputStream ficheroBuffer = new BufferedInputStream(in);

			PrintStream out = new PrintStream(fileOut);

			out.write(ficheroBuffer.readAllBytes());


			/*int dato = ficheroBuffer.read();
			while (dato != -1) {
				System.out.print((char) dato);
				dato = ficheroBuffer.read();
			}*/

			in.close();
			out.close();

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}


	}

	/**
	 * Función que genera una excepción del tipo ArithmeticException
	 */
	public static void DividePorCero(int a) {
		try {
			int resultado = a / 0;
		} catch (ArithmeticException e) {
			System.out.println("Esto no puede hacerse");
		} finally {
			System.out.println("Demo de código");
		}
	}

	/**
	 * Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
	 *
	 * @param texto Cadena de texto a invertir
	 * @return texto al revés
	 */
	public static StringBuilder reverse(String texto) {
//		Crear cadena vacía
		StringBuilder reverse = new StringBuilder();
//		Recorrer la cadena de atrás hacia adelante empezando por el último índice
		for (int i = texto.length() - 1; i >= 0; i--) {
			reverse.append(texto.charAt(i));
		}
		return reverse;
	}
}



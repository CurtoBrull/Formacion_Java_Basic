package Ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Javier Curto Brull
 */
public class JavaBasico {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> datos = new ArrayList<>();
		int num = 0;

		System.out.println("Introduce un número del 1 al 9:");

//		Se ejecuta mientras el número esté entre 1 y 9
		do {
			try {
//				Se ejecuta mientras el número sea menor a 1 o mayor que 9
				do {
					num = Integer.parseInt(scanner.nextLine());
					if (num > 0 && num < 10) {
//						Se añade al array
						datos.add(num);
//						Se ejecuta la función que comprueba la cantidad de menores de 5
						menoresDeCinco(datos);
					} else {
						System.err.println("Fuera del rango, inténtelo de nuevo:");
					}
				} while (num < 1 || num > 9);
//			Si no es un número salta el error
			} catch (NumberFormatException e) {
				System.err.println("No se ha introducido un número. Vuelva a intentarlo.");
				e.printStackTrace();
			}
		} while (num >= 0 && num < 10);
	}

	/**
	 * Método que imprime los valores que contiene el array
	 *
	 * @param datos ArrayList de números
	 */
	private static void pintaArray(ArrayList<Integer> datos) {
		System.out.println("El array actualmente contiene los siguientes números:");
//		Bucle foreach para recorrer el array y mostrarlo en consola
		for (Integer dato : datos) {
			System.out.print(dato + " ");
		}
		System.out.println();
	}

	/**
	 * Método que comprueba la cantidad de números del array menos a 5 y corta el programa si llega a 3
	 *
	 * @param datos ArrayList de números
	 */
	private static void menoresDeCinco(ArrayList<Integer> datos) {
//		Llama a la función para pintar el array
		pintaArray(datos);
		int count = 0;
//		Bucle for para recorrer el array
		for (int i = 0; i < datos.size(); i++) {
//			Comprobación de números menores a 5 y suma al contador
			if (datos.get(i) < 5) {
				count++;
			}
		}
//		Si el contador llega a 3 se corta el programa
		if (count == 3) {
			System.out.println("Se han introducido 3 valores menores a 5. Fin del programa.");
			System.exit(0);
		} else { // Mientras no llegue a 3 el contador sigue mostrando el mensaje para introducir números
			System.out.println("Cantidad de números menores de 5: " + count + ". Sigue introduciendo números:");
		}
	}
}
package Ejercicio3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/*
		 * Calcular la cadena más larga en un ArrayList de Strings.
		 * Programa Java para calcular el String de mayor longitud de todos los contenidos en un ArrayList
		 * de String.
		 *
		 * El programa utilizará los siguientes métodos además del método main:
		 * Método leerArray(): este método recibe como parámetro el arrayList de Strings vacío.
		 * En el método se rellena el arrayList con varios elementos de tipo String.
		 *
		 * Método cadenaMasLarga():este método recibe como parámetro el ArrayList de Strings
		 * con todas las cadenas y devuelve el String de mayor longitud.
		 */

//		Declarar el ArrayList de Strings
		ArrayList<String> textos = new ArrayList<>();

//		Rellenar el ArrayList
		leerArray(textos);

//		Llamar al método cadenaMasLarga() para obtener el String más largo
		String cadenaMasLarga = cadenaMasLarga(textos);
		System.out.println("La cadena más larga es: " + cadenaMasLarga);
	}

	/**
	 * Recibe como parámetro el arrayList de Strings vacío.
	 * En el método se rellena el arrayList con varios elementos de tipo String.
	 * @param textos ArrayList de Strings vacío
	 * @return ArrayList<String>
	 */
	public static ArrayList<String> leerArray(ArrayList<String> textos) {
		textos.add("Hola");
		textos.add("Adiós");
		textos.add("Ejemplo");
		textos.add("Ejemplo de texto");
		return textos;
	}

	/**
	 * Recibe como parámetro el ArrayList de Strings con todas las cadenas y devuelve el String de mayor longitud.
	 * @param textos ArrayList de Strings con todas las cadenas
	 * @return String
	 */
	public static String cadenaMasLarga(ArrayList<String> textos) {
//		Inicializar variable vacía
		String cadenaMasLarga = "";
//		Recorrer el ArrayList con foreach
		for (String texto : textos) {
//			Mete en la variable el texto si es mayor que la variable
			if (texto.length() > cadenaMasLarga.length()) {
				cadenaMasLarga = texto;
			}
		}
		return cadenaMasLarga;
	}
}
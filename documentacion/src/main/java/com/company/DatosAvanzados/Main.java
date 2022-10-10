package com.company.DatosAvanzados;

public class Main {

	public static void main(String[] args) {

		var cadena = "Nueva cadena";
		int cadenaLen = cadena.length();
		System.out.println(cadenaLen);

		String cadenaMays = cadena.toUpperCase();
		System.out.println(cadenaMays);

		String cadenaMin2 = cadena.toLowerCase();
		System.out.println(cadenaMin2);

		boolean result = cadena.startsWith("Nue");
		System.out.println(result);

		boolean result2 = cadena.endsWith("na");
		System.out.println(result2);

		char letra = cadena.charAt(0);
		System.out.println(letra);

		for (int i = 0; i < cadena.length(); i++) {
			System.out.print(cadena.charAt(i) + "-");
		}
		System.out.println();

		for (int i = cadenaLen - 1; i >= 0; i--) {
			System.out.print(cadena.charAt(i));
		}


	}

}

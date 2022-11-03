package Ejercicio2;

public class main {

	public static void main(String[] args) {
		/*
		 * Programa Java que muestre todos los valores de un contador de 5 dígitos empezando por 00000
		 * y acabando en 99999 con la particularidad que cada vez que se deba mostrar un 3 se muestre E.
		 */

//		Crear los números del 00000 al 99999
		for (int i = 0; i < 100000; i++) {
//			Convertir el número a String para hacer un replace de los 3 por E
			String numero = String.valueOf(i);

//			Comprobar si el número tiene 5 dígitos
			if (numero.length() < 5) {
//					Si el número es de 1 dígito, añadir 4 ceros
				if (numero.length() < 2) {
					numero = "0000" + numero;
//					Si el número es de 2 dígitos, añadir 3 ceros
				} else if (numero.length() < 3) {
					numero = "000" + numero;
//					Si el número es de 3 dígitos, añadir 2 ceros
				} else if (numero.length() < 4) {
					numero = "00" + numero;
				} else {
//					Si el número es de 4 dígitos, añadir 1 cero
					numero = "0" + numero;
				}
			}
//			Si encuentra en el número un 3 lo reemplaza por E
			numero = numero.replace("3", "E");
			System.out.println(numero);
		}
	}
}

package com.company.ArraysListas;

public class ArrayMain {
	public static void main(String[] args) {
		String nombre1 = "Nombre 1";
		String nombre2 = "Nombre 2";
		String nombre3 = "Nombre 3";

//        Longitud fija
		String[] nombres = new String[3];
		String[] nombres2 = new String[]{nombre1, nombre2, nombre3};
		int[] numeros = new int[5];
		Coche[] coches = new Coche[2];

		nombres[0] = nombre1;
		nombres[1] = nombre2;
		nombres[2] = nombre3;

		for (int i = 0; i < nombres.length; i++) {
			System.out.println(i + " = " + nombres[i]);
		}

		for (int i = 0; i < nombres2.length; i++) {
			System.out.println(i + " = " + nombres2[i]);
		}


	}
}

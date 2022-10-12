package com.company.EntradaSalidaDatos;

import java.util.Scanner;

public class ScannerMain {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Introducir datos:");
		String datos = scanner.nextLine();
		System.out.println("Introduce número:");
		int numero = scanner.nextInt();

		System.out.println("Salida Datos: " + datos + " " + numero);
	}
}

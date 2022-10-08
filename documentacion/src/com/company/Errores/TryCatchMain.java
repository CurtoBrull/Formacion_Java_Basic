package com.company.Errores;

import java.util.Scanner;

public class TryCatchMain {
		public static void main(String[] args) {

				Scanner scanner = new Scanner(System.in);

				System.out.println("introduce numeros");

				try {
						int numero1 = scanner.nextInt();
						int numero2 = scanner.nextInt();
						int result = numero1 / numero2;
						System.out.println(result);
				} catch (ArithmeticException e) {
						System.err.println("Error de tipo Aritmetic " + e.getClass());
				} catch (Exception e) {
						System.err.println("El error es de tipo " + e.getClass());
				} finally {
						System.out.println("Llegamos al fin del try catch");
				}

		}
}

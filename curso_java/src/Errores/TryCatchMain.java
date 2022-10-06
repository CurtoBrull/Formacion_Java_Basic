package Errores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchMain {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int x;

		System.out.println("Introduce valor");

		try {
			x = scanner.nextInt();
			System.out.println(x);
		} catch (InputMismatchException e) {
			e.printStackTrace();
			System.out.println("Error con InputMismatchException");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error con exception");
		} finally {
			scanner.close();
			System.out.println("Scanner closed");
		}

		System.out.println("El programa sigue después del error");
	}

}

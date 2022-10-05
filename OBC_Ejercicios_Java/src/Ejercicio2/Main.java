package Ejercicio2;

public class Main {
	public static void main(String[] args) {

		double precio = 25.5;

		System.out.println("El producto cuesta " + precio + " sin IVA.");
		System.out.println("El 21% de IVA es " + (precioIVA(precio) - precio));
		System.out.println("El precio con IVA es de " + precioIVA(precio));
	}

	private static double precioIVA(double precio) {
		double iva = 1.21;
		return precio * iva;
	}
}

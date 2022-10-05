package Ejercicio4;

public class Main {
	public static void main(String[] args) {

		SmartDevice telefono = new SmartDevice("Xiaomi", "Note9", 8, 256, 5000);

		System.out.println(telefono.toString());

		SmartWatch reloj = new SmartWatch("Xiaomi", "Wathc", 512, 1, 120, 142.5);

		System.out.println(reloj.toString());
	}
}

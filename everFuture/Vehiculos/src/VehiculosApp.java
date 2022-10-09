public class VehiculosApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche coche1 = new Coche("Seat", 120, 4);
		Avion avion1 = new Avion("Airbus", 350, 2);
		Barco barco1 = new Barco("Titanic", 100, 0);

		System.out.println("\n Intentamos conducir coche1:");
		coche1.Controlar();
		coche1.Controlar();
		coche1.Terminar();
		coche1.Controlar();
		coche1.Terminar();

		System.out.println("\n Intentamos conducir avion1:");
		avion1.Terminar();
		avion1.Controlar();
		avion1.Terminar();

		System.out.println("\n Intentamos conducir barco1:");
		barco1.Terminar();
		barco1.Controlar();
		barco1.Controlar();
		barco1.Terminar();

		System.out.println("\nLos vehículos conducidos han sido:");
		System.out.println("\t" + coche1);
		System.out.println("\t" + avion1);
		System.out.println("\t" + barco1);

		Coche coche2 = new Coche("Renault", 120, 4);
		Barco barco2 = new Barco("Titanic", 100, 0);
		Barco barco3 = new Barco("Titanic", 100, 2);
		System.out.println("\nComparación de vehículos:");
		System.out.println("\tVehiculos iguales (barco1 vs. barco2): " + barco1.equals(barco2));
		System.out.println("\tVehiculos iguales (barco1 vs. barco3): " + barco1.equals(barco3));
		System.out.println("\tVehiculos iguales (avion1 vs. coche1): " + avion1.equals(coche1));
		System.out.println("\tVehiculos iguales (coche1 vs. coche2): " + coche1.equals(coche2));
	}

}

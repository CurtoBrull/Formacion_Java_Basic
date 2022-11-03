package Ejercicio4;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/*
		 * Escribir un programa Java que crea un ArrayList de Objetos de tipo Coche.
		 * A continuación utilizará el ArrayList para mostrar por pantalla lo siguiente:
		 * Todos los coches introducidos.
		 * Todos los coches de una marca determinada.
		 * Todos los coches con menos de un número determinado de Kilómetros.
		 * El coche con mayor número de Kilómetros.
		 * Todos los coches ordenados por número de kilómetros de menor a mayor.
		 */

		ArrayList<Coche> coches = new ArrayList<>();

		llenarListaCoches(coches);
		listarCoches(coches);

//		Pedir marca y mostrar coches de esa marca
		do {
//			Convertir string a minúsculas para evitar errores
			String marca = JOptionPane.showInputDialog("Introduce la marca de los coches que quieres ver").toLowerCase();
//			Convertir String en minúsculas a Capitalize
			marca = marca.substring(0, 1).toUpperCase() + marca.substring(1);
			if (marca != null) {
				porMarca(coches, marca);
			}
		} while (JOptionPane.showConfirmDialog(null, "¿Quieres ver más coches de una marca?") == JOptionPane.YES_OPTION);


//		Pedir kilometros y mostrar coches con menos kilometros
		do {
			try {
				int kilometros = Integer.parseInt(JOptionPane.showInputDialog("Introduce kilómetros de los vehículos a mostrar"));
				maxKilometros(coches, kilometros);
				break;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Introduce un número");
			}
		} while (true);

//		Mostrar coche con más kilometros
		masKilometros(coches);

//		Mostrar coches ordenados por kilometros
		cochesOrdenados(coches);
	}

	/**
	 * Llenar la lista de coches
	 *
	 * @param coches lista de coches
	 */
	private static void llenarListaCoches(ArrayList<Coche> coches) {
		coches.add(new Coche("Seat", "Ibiza", 120000));
		coches.add(new Coche("Seat", "Leon", 24000));
		coches.add(new Coche("Seat", "Toledo", 10400));
		coches.add(new Coche("Renault", "Clio", 43000));
		coches.add(new Coche("Renault", "Megane", 150000));
		coches.add(new Coche("Renault", "Scenic", 260000));
		coches.add(new Coche("Peugeot", "206", 3400));
		coches.add(new Coche("Peugeot", "307", 5550));
		coches.add(new Coche("Peugeot", "308", 90));
	}

	/**
	 * Listar todos los coches
	 *
	 * @param coches lista de coches
	 */
	private static void listarCoches(ArrayList<Coche> coches) {
		System.out.println("Lista completa de coches:");
		for (Coche coche : coches) {
			System.out.println(coche);
		}
	}

	/**
	 * Listar los coches de una marca
	 *
	 * @param coches lista de coches
	 * @param marca  marca
	 */
	private static void porMarca(ArrayList<Coche> coches, String marca) {
		System.out.println("------------------------");
		System.out.println("Coches de la marca " + marca + ":");
		for (Coche coche : coches) {
			if (coche.getMarca().equals(marca)) {
				System.out.println(coche);
			} else if(!coche.getMarca().equals(marca)){
				System.err.println("No hay coches de la marca " + marca);
				break;
			}
		}
	}

	/**
	 * Listar los coches con menos de un número determinado de Kilómetros
	 *
	 * @param coches lista de coches
	 * @param km     número de kilómetros
	 */
	private static void maxKilometros(ArrayList<Coche> coches, int km) {
		System.out.println("------------------------");
		System.out.println("Coches con menos de " + km + " km:");
		for (Coche coche : coches) {
			if (coche.getKilometros() < km) {
				System.out.println(coche);
			} else if(coche.getKilometros() > km){
				System.err.println("No hay coches con menos de " + km + " km");
				break;
			}
		}
	}

	/**
	 * Listar el coche con mayor número de Kilómetros
	 * @param coches lista de coches
	 */
	private static void masKilometros(ArrayList<Coche> coches) {
		System.out.println("------------------------");
		System.out.println("Coche con más Kilómetros:");

//		Guardamos el primer coche de la lista para luego sobreescribirlo si corresponde
		Coche conMasKilometros = coches.get(0);

//		 Recorremos la lista de coches con foreach
		for (Coche coche : coches) {
//			Comprobar si el coche actual tiene más kilómetros que el anterior guardado
			if (coche.getKilometros() > conMasKilometros.getKilometros()) {
				conMasKilometros = coche;
			}
		}
		System.out.println(conMasKilometros);
	}

	/**
	 * Listar todos los coches ordenados por número de kilómetros de menor a mayor
	 * @param coches lista de coches
	 */
	private static void cochesOrdenados(ArrayList<Coche> coches) {
		System.out.println("------------------------");
		System.out.println("Coches ordenados por Kilómetros de menor a mayor:");

//		Ordenar la lista de coches con el método sort
		coches.sort((a,b) -> a.getKilometros() - b.getKilometros());

		for (Coche coche : coches) {
			System.out.println(coche);
		}
	}
}

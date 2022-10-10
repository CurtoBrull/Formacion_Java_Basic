package com.company.ArraysListas;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
	public static void main(String[] args) {

		List<String> nombres = new ArrayList<>();

		nombres.add("A");
		nombres.add("B");
		nombres.add("C");

		System.out.println(nombres);

		for (String nombre : nombres) {
			System.out.println(nombre);
		}

		List<Coche> coches = new ArrayList<>();

		coches.add(new Coche("Honda"));
		coches.add(new Coche("Renault"));
		coches.add(new Coche("Peugeot"));

		for (Coche coche : coches) {
			System.out.println(coche);
		}

	}
}

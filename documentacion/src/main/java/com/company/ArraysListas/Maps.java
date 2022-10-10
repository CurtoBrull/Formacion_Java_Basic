package com.company.ArraysListas;

import java.util.HashMap;
import java.util.Map;

public class Maps {
	public static void main(String[] args) {

		Map<String, String> personas = new HashMap<>();

//		Clave, Valor
		personas.put("52606126C", "Javier Curto");
		personas.put("25711462S", "Loli Adamuz");
		personas.put("41414141A", "Izhan Curto");

		System.out.println(personas);

		for(String key : personas.keySet()) {
			System.out.println(key + " -> " + personas.get(key));
		}

		for (String key : personas.keySet()) {
			System.out.println(key);
		}

		for (String value : personas.values()) {
			System.out.println(value);
		}

		for(Map.Entry<String, String> pair : personas.entrySet()) {
			System.out.println(pair.getKey() + " -> " + pair.getValue() + "");
		}
	}
}

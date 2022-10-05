package com.company.ArraysListas;

public class Coche {
	String name = "Nombre de coche";

	public Coche(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Coche: " +
				"nombre = '" + name + '\'' ;
	}
}

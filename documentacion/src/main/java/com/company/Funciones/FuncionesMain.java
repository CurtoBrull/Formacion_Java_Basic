package com.company.Funciones;

public class FuncionesMain {
	public static void main(String[] args) {
		showMenu();
		String menu = getMenu();
		System.out.println(menu);
	}

	private static void showMenu() {
		System.out.println("¿Quieres las funciones?");
		System.out.println("1.Aceptar");
		System.out.println("2.Aceptar");
		System.out.println("3.Aceptar");
	}

	private static String getMenu() {
		return "¿Quieres las funciones?";
	}
}

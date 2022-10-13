package com.company.POO;

public class DaysMain {
	public static void main(String[] args) {
		Days day = Days.LUNES;

		switch (day) {
			case LUNES:
				System.out.println("Lunes");
				break;
			case MARTES:
				System.out.println("Martes");
				break;
			case MIERCOLES:
				System.out.println("Miércoles");
				break;
			case JUEVES:
				System.out.println("Jueves");
				break;
			case VIERNES:
				System.out.println("Viernes");
				break;
			case SABADO:
				System.out.println("Sábado");
				break;
			case DOMINGO:
				System.out.println("Domingo");
				break;
		}
	}


}

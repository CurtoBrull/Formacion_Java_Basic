package com.company.POO_Platzi;

public class EnumMain {
	public static void main(String[] args) {
		//Llamar a un Enum
		Day day = Day.SATURDAY;

		switch (day) {
			case MONDAY:
				System.out.println("Lunes");
				break;
			case TUESDAY:
				System.out.println("Martes");
				break;
			case WEDNESDAY:
				System.out.println("Miércoles");
				break;
			case THURSDAY:
				System.out.println("Jueves");
				break;
			case FRIDAY:
				System.out.println("Viernes");
				break;
			case SATURDAY:
				System.out.println("Sábado");
				break;
			case SUNDAY:
				System.out.println("Domingo");
				break;
		}
	}
}

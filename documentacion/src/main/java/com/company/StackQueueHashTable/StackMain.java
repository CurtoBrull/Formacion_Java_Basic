package com.company.StackQueueHashTable;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {

//		Pila - Stack Queue

//		Stack<String> miPila = new Stack<String>();
		Stack miPila = new Stack();

		//		Push - Insertar
		miPila.push("Pila");
		miPila.push("Lola");
		miPila.push("Izhan");
		miPila.push("Javier");
		System.out.println(miPila);

		//      Pop - Eliminar

		String elemento;
		elemento = (String) miPila.pop();
		System.out.println("Pop elemento " + elemento);
		System.out.println(miPila);

		miPila.clear();

		System.out.println("Limpiar pila: " + miPila);

	}
}

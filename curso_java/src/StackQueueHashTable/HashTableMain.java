package StackQueueHashTable;

import java.util.Hashtable;

public class HashTableMain {
	public static void main(String[] args) {
//		Estructura de datos dinámica que permite guardar objetos dentro

//		Declaracion HashTable
		Hashtable tabla = new Hashtable();

//		Hashtable<Key, Value>
//		Hashtable<Integer, String> tabla2 = new Hashtable<>();

//		Put - Poner elemento
		tabla.put(1, "Uno");
		tabla.put(2, "Dos");
		tabla.put(6, "Seis");
		tabla.put("Ferrari", 400);

		System.out.println(tabla.get(1));
		System.out.println(tabla.get(6));
		System.out.println(tabla.get("Ferrari"));



	}
}

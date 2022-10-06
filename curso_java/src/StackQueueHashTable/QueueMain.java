package StackQueueHashTable;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
	public static void main(String[] args) {
//		Queue - Cola
//		First in, first out

//		Queue<TipoDato> cola = new LinkedList();
		Queue cola = new LinkedList();

//		Insertar delante - Add
		cola.add(1);
        cola.add(2);
		cola.add(3);
        cola.add(4);

		System.out.println(cola);

//		Peek - Consultar primer elemento
		System.out.println("Peek -> Mostrar primer elemento: " + cola.peek());
		System.out.println(cola);

//		Eliminar primer elemento - poll
		System.out.println("Poll -> Eliminar primer elemento -> " + cola.poll());
		System.out.println(cola);


	}
}

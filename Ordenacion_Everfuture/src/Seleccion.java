public class Seleccion {
	public static void main(String[] args) {
		// El arreglo
		int[] arreglo = {30, 28, 11, 96, -5, 21, 18, 12, 22, 30, 97, -1, -40, -500};
		System.out.println("Imprimiendo arreglo antes de ordenar...");
		// Imprimiendo arreglo
		for (int i : arreglo) {
			System.out.printf("%d, ", i);
		}
		
		// Ordenamos. Recuerda: en Java los arreglos se pasan por referencia as� que no necesitamos obtener
		// el resultado, ya que dentro de la funci�n se modifica al arreglo
		// M�s informaci�n: https://parzibyte.me/blog/2020/04/04/java-parametros-referencia-valor/
		ordenarPorSeleccion(arreglo);

		System.out.println("\nImprimiendo arreglo despu�s de ordenar...");
		for (int i : arreglo) {
			System.out.printf("%d, ", i);
		}
	}

	public static void ordenarPorSeleccion(int[] arreglo) {
		for (int i = 0; i < arreglo.length - 1; i++) {
			for (int j = i + 1; j < arreglo.length; j++) {
				if (arreglo[i] > arreglo[j]) {
					// ...intercambiarlos, es decir, mover el actual a la derecha y el de la derecha al actual
					int temporal = arreglo[i];
					arreglo[i] = arreglo[j];
					arreglo[j] = temporal;
				}
			}
		}
	}
}

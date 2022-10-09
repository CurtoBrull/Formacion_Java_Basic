public class EjemploUsoLibro {

	public static void main(String arg[]) {
		System.out.println("\n Comienzo ejemplo clase 'Libro' ");

		Libro libro1 = new Libro("Hamlet"/* T�tulo del libro */, "William Shakespeare"/* Autor */, 5
		/* n�mero ejemplares */
		);
		Libro libro2 = new Libro("Don Quijote de la Mancha"/* T�tulo del libro */, "Miguel de Cervantes"/* Autor */, 1
		/* n�mero ejemplares */
		);

		System.out.println("\n Libros de " + libro1 + ": " + libro1.getNumEjemplares());
		System.out.println("\t Pr�stamo de " + libro1.getTitulo() + ". Resultado: " + libro1.prestamo()
				+ ". Ejemplares restantes: " + libro1.getNumEjemplares());
		System.out.println("\t Pr�stamo de " + libro1.getTitulo() + ". Resultado: " + libro1.prestamo()
				+ ". Ejemplares restantes: " + libro1.getNumEjemplares());
		System.out.println("\t Devoluci�n de " + libro1.getTitulo() + ". Resultado: " + libro1.devolucion()
				+ ". Ejemplares restantes: " + libro1.getNumEjemplares());
		System.out.println("\t Devoluci�n de " + libro1.getTitulo() + ". Resultado: " + libro1.devolucion()
				+ ". Ejemplares restantes: " + libro1.getNumEjemplares());
		System.out.println("\t Pr�stamo de " + libro1.getTitulo() + ". Resultado: " + libro1.prestamo()
				+ ". Ejemplares restantes: " + libro1.getNumEjemplares());

		System.out.println("\n Libros de " + libro2 + ": " + libro2.getNumEjemplares());
		System.out.println("\t Pr�stamo de " + libro2.getTitulo() + ". Resultado: " + libro2.prestamo()
				+ ". Ejemplares restantes: " + libro2.getNumEjemplares());
		System.out.println("\t Pr�stamo de " + libro2.getTitulo() + ". Resultado: " + libro2.prestamo()
				+ ". Ejemplares restantes: " + libro2.getNumEjemplares());
		System.out.println("\t Devoluci�n de " + libro2.getTitulo() + ". Resultado: " + libro2.devolucion()
				+ ". Ejemplares restantes: " + libro2.getNumEjemplares());
		System.out.println("\t Devoluci�n de " + libro2.getTitulo() + ". Resultado: " + libro2.devolucion()
				+ ". Ejemplares restantes: " + libro2.getNumEjemplares());
		System.out.println("\t Pr�stamo de " + libro2.getTitulo() + ". Resultado: " + libro2.prestamo()
				+ ". Ejemplares restantes: " + libro2.getNumEjemplares());

		System.out.println("\n Fin ejemplo clase 'Libro' ");
	}
}

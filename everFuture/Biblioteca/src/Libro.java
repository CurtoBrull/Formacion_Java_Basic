public class Libro {

	private final String titulo;
	private final String autor;
	private int ejemplares;
	private int ejemplaresPrestados = 0;

	public Libro(String titulo, String autor, int ejemplares) {
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getNumEjemplares() {
		return ejemplares;
	}

	public int getEjemplaresPrestados() {
		return ejemplaresPrestados;
	}

	public boolean prestamo() {
		if (ejemplares == 0) {
			return false;
		} else {
			ejemplaresPrestados++;
			ejemplares--;
			return true;
		}
	}

	public boolean devolucion() {
		if (ejemplaresPrestados == 0) {
			return false;
		} else {
			ejemplaresPrestados--;
			ejemplares++;
			return true;
		}
	}

	@Override
	public String toString() {
		return titulo;
	}
}

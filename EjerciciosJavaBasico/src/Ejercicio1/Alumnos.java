public class Alumnos {

	private String nombre;
	private int nota1;
	private int nota2;
	private int nota3;

	public Alumnos(){}
	public Alumnos(String nombre, int nota1, int nota2, int nota3) {
		this.nombre = nombre;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}

	public int getNota3() {
		return nota3;
	}

	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}

	/**
	 * Devuelve la media de las notas del alumno
	 * @return media
	 */
	public int getMedia() {
		return (nota1 + nota2 + nota3) / 3;
	}

	/**
	 * Devuelve la nota mayor de las 3 notas del alumno
	 * @return nota mayor
	 */
	public int getMayor() {
		int mayor = nota1;
		if (nota2 > mayor) {
			mayor = nota2;
		}
		if (nota3 > mayor) {
			mayor = nota3;
		}
		return mayor;
	}

	/**
	 * Devuelve la menor nota
	 * @return menor nota
	 */
	public int getMenor() {
		int menor = nota1;
		if (nota2 < menor) {
			menor = nota2;
		}
		if (nota3 < menor) {
			menor = nota3;
		}
		return menor;
	}

	public String toString() {
		return "Nombre: " + nombre + " Nota1: " + nota1 + " Nota2: " + nota2 + " Nota3: " + nota3 + " Media: " + getMedia();
	}
}

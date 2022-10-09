/**
 *
 */

public class Avion extends Vehiculo {

	private int alas;

	public Avion(String nombre, float velocidad, int alas) {
		super(nombre, velocidad);
		this.alas = alas;
	}

	public int getAlas() {
		return alas;
	}

	public void setAlas(int alas) {
		this.alas = alas;
	}

	public String toString() {
		return "Avion{" +
				"alas=" + alas +
				'}';
	}
}

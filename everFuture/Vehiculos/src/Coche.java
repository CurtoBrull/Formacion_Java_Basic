/**
 *
 */

public class Coche extends Vehiculo {

	private int ruedas;

	public Coche(String nombre, float velocidad, int ruedas) {
		super(nombre, velocidad);
		this.ruedas = ruedas;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public String toString() {
		return "Coche{" +
				"ruedas=" + ruedas +
				'}';
	}
}

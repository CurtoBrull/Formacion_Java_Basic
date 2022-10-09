/**
 *
 */

public class Barco extends Vehiculo {

	private int velas;

	public Barco(String nombre, float velocidad, int velas) {
		super(nombre, velocidad);
		this.velas = velas;
	}

	public int getVelas() {
		return velas;
	}

	public void setVelas(int velas) {
		this.velas = velas;
	}

	public String toString() {
		return "Barco{" +
				"velas=" + velas +
				'}';
	}
}

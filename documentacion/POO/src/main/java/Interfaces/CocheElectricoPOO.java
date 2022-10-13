package Interfaces;

public class CocheElectricoPOO extends CochePOO {
	String motorElectrico;

	public CocheElectricoPOO() {

	}

	public CocheElectricoPOO(String motorElectrico) {
		this.motorElectrico = motorElectrico;
	}

	@Override
	public String toString() {
		return "Interfaces.CocheElectricoPOO{" +
				"motorElectrico='" + motorElectrico + '\'' +
				", color='" + color + '\'' +
				", modelo='" + modelo + '\'' +
				", fabricante='" + fabricante + '\'' +
				", peso=" + peso +
				", largo=" + largo +
				", velocidad=" + velocidad +
				'}';
	}
}

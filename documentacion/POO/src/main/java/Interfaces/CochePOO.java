/*

public abstract class CochePOO {}

Si se declara como abstract solo se pueden instanciar clases hijas de esta clase por lo que no se podría crear
un CochePOO pero si un CocheElectricoPOO por ejemplo.
 */


public class CochePOO {
	String color;
	String modelo;
	String fabricante;
	Double peso;
	Double largo;
	Integer velocidad = 0;

	public CochePOO() {
	}

	public CochePOO(String color, String fabricante, String modelo, Double peso, Double largo) {
		this.color = color;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.peso = peso;
		this.largo = largo;
	}

	public void acelerar(Integer cantidad) {
		if (cantidad > 0 && cantidad <= 120) {
			this.velocidad += cantidad;
		}
	}

	@Override
	public String toString() {
		return "CochePOO: \n" +
				"color='" + color + '\'' +
				", modelo='" + modelo + '\'' +
				", fabricante='" + fabricante + '\'' +
				", peso=" + peso +
				", largo=" + largo +
				", velocidad=" + velocidad
				;
	}
}


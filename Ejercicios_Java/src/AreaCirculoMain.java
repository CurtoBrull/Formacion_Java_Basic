import javax.swing.*;

public class AreaCirculoMain {
	public static void main(String[] args) {

		final double PI = Math.PI;

		double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio del circulo"));

		double area = Math.round(PI * Math.pow(radio, 2) * 100.0) / 100.0;

		System.out.println("El area del circulo es: " + area);

	}
}

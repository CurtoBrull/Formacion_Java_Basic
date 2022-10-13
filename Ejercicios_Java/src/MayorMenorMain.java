import javax.swing.*;

public class MayorMenorMain {
	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Introduce primer valor"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Introduce segundo valor"));

		if (x > y) {
			System.out.println(x + " es mayor que " + y);
		} else if (x < y) {
			System.out.println(x + " es menor que " + y);
		} else {
			System.out.println(x + " es igual a " + y);
		}
	}
}

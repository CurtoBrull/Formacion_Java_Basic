import javax.swing.*;

public class ASCIIMain {
	public static void main(String[] args) {

		try {
			char caracter = JOptionPane.showInputDialog("Introduce un caracter").charAt(0);
			int ascii = (int) caracter;
			System.out.println("El codigo ASCII del caracter \"" + caracter + "\" es: " + ascii);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}
}

import javax.swing.*;

public class MatrizAleatoria {
	public static void main(String[] args) {


		int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de elementos"));

		int[] numAleat = new int[elementos];


		for (int i = 0; i < elementos; i++) {
			numAleat[i] = (int) (Math.random() * 100);
		}

		for (int i : numAleat) {
			System.out.println(i);
		}
	}
}

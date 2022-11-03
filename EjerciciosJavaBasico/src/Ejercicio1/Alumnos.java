package Ejercicio1;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class Alumnos {

	private String nombre;
	private double nota1;
	private double nota2;
	private double nota3;



	public Alumnos(){}
	public Alumnos(String nombre, double nota1, double nota2, double nota3) {
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

	public double getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}

	/**
	 * Devuelve la media de las notas del alumno
	 * @return media
	 */
	public double getMedia() {
//		Redondear a dos decimales
		BigDecimal notaRed1 = new BigDecimal(nota1).setScale(2, RoundingMode.HALF_UP);
		BigDecimal notaRed2 = new BigDecimal(nota2).setScale(2, RoundingMode.HALF_UP);
		BigDecimal notaRed3 = new BigDecimal(nota3).setScale(2, RoundingMode.HALF_UP);
		double media = (notaRed1.doubleValue() + notaRed2.doubleValue() + notaRed3.doubleValue()) / 3;

		BigDecimal mediaRed = new BigDecimal(media).setScale(2, RoundingMode.HALF_UP);
		return mediaRed.doubleValue();
	}

	/**
	 * Devuelve la nota mayor de las 3 notas del alumno
	 * @return nota mayor
	 */
	public double getMayor() {
		double mayor = nota1;
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
	public double getMenor() {
		double menor = nota1;
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

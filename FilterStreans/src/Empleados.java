public class Empleados {
	private String nombre;
	private int edad;

	public Empleados(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Empleados [nombre = " + nombre + ", edad = " + edad + "]";
	}
}

package empleados;

public class Empleado {

	private String nombre;
	private String dni;
	private int edad;
	private String lugarResidencia;

	/**
	 * Constructor por defecto aunque no es necesario
	 */
	public Empleado() {
	}

	/**
	 * Constructor con parámetros que inicializa el nombre
	 * @param nombre
	 */
	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empleado\n" +
				"nombre = '" + nombre + "'" ;
	}
}

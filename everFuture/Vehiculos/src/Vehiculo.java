public abstract class Vehiculo implements Controlable {

	private String nombre;
	private float velocidad;

	public Vehiculo(String nombre, float velocidad) {
		this.nombre = nombre;
		this.velocidad = velocidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(float velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public void Controlar() {
		// TODO Auto-generated method stub
	}

	@Override
	public void Terminar() {
		// TODO Auto-generated method stub
	}

	public String toString() {
		return "Vehiculo{" +
				"nombre='" + nombre + '\'' +
				", velocidad=" + velocidad +
				'}';
	}


}

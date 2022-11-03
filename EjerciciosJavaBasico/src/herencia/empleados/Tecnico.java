package herencia.empleados;

public class Tecnico extends Operario {

	public Tecnico(String nombre) {
		super(nombre);
	}

	public Tecnico(){}

	@Override
	public String toString() {
		return "Técnico\nnombre = '" + this.getNombre() + "'";
	}

}

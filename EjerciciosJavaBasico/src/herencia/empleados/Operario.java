package herencia.empleados;

public class Operario extends Empleado {

	public Operario(String nombre) {
		super(nombre);
	}

	public Operario(){}

	@Override
	public String toString() {
		return "Operario\nnombre = '" + this.getNombre() + "'";
	}
}

package herencia;

public class Oficial extends Operario {

	public Oficial(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Oficial\nnombre= '" + this.getNombre() + "'";
	}
}

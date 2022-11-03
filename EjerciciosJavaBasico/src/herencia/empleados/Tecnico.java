package herencia;

public class Tecnico extends Operario {

	public Tecnico(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Técnico\nnombre= '" + this.getNombre() + "'";
	}

}

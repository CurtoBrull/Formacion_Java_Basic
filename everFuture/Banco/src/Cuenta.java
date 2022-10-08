public class Cuenta {

	private String nombre;
	private String numero;
	private double tipo;
	private double importe;

	public Cuenta(String nombre, String numero, double tipo, int importe) {
		this.nombre = nombre;
		this.numero = numero;
		this.tipo = tipo;
		this.importe = importe;
	}

	//	Copia un objeto tipo Cuenta
	public Cuenta(Cuenta cuenta) {
		this.nombre = cuenta.nombre;
		this.numero = cuenta.numero;
		this.tipo = cuenta.tipo;
		this.importe = cuenta.importe;
	}

	public Cuenta() {
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNumeroCuenta(String numero) {
		this.numero = numero;
	}

	public void setTipoInteres(double tipo) {
		this.tipo = tipo;
	}

	public void setSaldo(double importe) {
		this.importe = importe;
	}

	public String getNombre() {
		return nombre;
	}

	public String getNumeroCuenta() {
		return numero;
	}

	public double getTipoInteres() {
		return tipo;
	}

	public double getSaldo() {
		return importe;
	}

	public void ingreso(double cantidadIngreso) {
		if (cantidadIngreso >= 0) {
			importe += cantidadIngreso;
		} else {
			System.err.println("No se ha podido realizar el ingreso");
		}
		getSaldo();
	}

	public void transferencia(Cuenta cuenta2, int i) {
	}

	@Override
	public String toString() {
		return "Cuenta{" +
				"nombre='" + nombre + '\'' +
				", numero='" + numero + '\'' +
				", tipo=" + tipo +
				", importe=" + importe +
				'}';
	}
}

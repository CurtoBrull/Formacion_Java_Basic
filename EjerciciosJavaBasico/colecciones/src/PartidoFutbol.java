public class PartidoFutbol {

	private String equipoLocal;
	private String equipoVisitante;
	private int golesLocal;
	private int golesVisitante;
	private String nombreEstadio;

	public PartidoFutbol(String equipoLocal, String equipoVisitante, int golesLocal, int golesVisitante,
			String nombreEstadio) {
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;
		this.nombreEstadio = nombreEstadio;
	}

	public String getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(String equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public String getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(String equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public int getGolesLocal() {
		return golesLocal;
	}

	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}

	public int getGolesVisitante() {
		return golesVisitante;
	}

	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}

	public String getNombreEstadio() {
		return nombreEstadio;
	}

	public void setNombreEstadio(String nombreEstadio) {
		this.nombreEstadio = nombreEstadio;
	}

	@Override
	public String toString() {
		return 	"Partido: " + equipoLocal +
				" vs " + equipoVisitante +
				", Resultado: " + golesLocal +
				"-" + golesVisitante +
				", Estadio: " + nombreEstadio + ".";
	}



}

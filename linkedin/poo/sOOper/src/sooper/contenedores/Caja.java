package sooper.contenedores;

public class Caja extends Contenedor {

		private int ancho;
		private int largo;

		public Caja(String referencia, int ancho, int largo, int alto) {
				super(referencia, alto);
				this.ancho = ancho;
				this.largo = largo;
		}

		@Override
		public int getSuperficie() {
				return ancho * largo;
		}

		@Override
		public String getTipo() {
				return "Caja";
		}

}
}

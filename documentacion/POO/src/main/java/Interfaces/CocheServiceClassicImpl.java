package Interfaces;

// Obligadas a implementar metodos
public class CocheServiceClassicImpl implements CocheService {


	@Override
	public CochePOO crearCocheDemo() {

		System.out.println("Creando coche Clasico");
		return new CocheElectricoPOO();
	}

	@Override
	public void destruirCoche(CochePOO cochePOO) {
		System.out.println("Destruyendo coche");
	}
}

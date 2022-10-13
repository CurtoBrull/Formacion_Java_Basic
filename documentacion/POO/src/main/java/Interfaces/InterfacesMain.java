package Interfaces;

;

public class InterfacesMain {
	public static void main(String[] args) {

		CocheService service = new CocheServiceClassicImpl();
		CocheService service2 = new CocheServiceSportImpl();

		CochePOO coche1 = service.crearCocheDemo();
		CochePOO coche2 = service2.crearCocheDemo();

		service.destruirCoche(coche1);
		service2.destruirCoche(coche2);
	}
}

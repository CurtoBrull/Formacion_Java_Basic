package Ejercicio5;

public class Main {
	public static void main(String[] args) {

		CocheCRUDImpl cocheCRUD = new CocheCRUDImpl();

		cocheCRUD.save();
        cocheCRUD.findAll();
		cocheCRUD.delete();

	}
}

package ConInterfaces;

import SinInterfaces.Empleado;

public class Main {

//	Simplemente cambiando el tipo de objeto nos siguen valiendo todas las implementaciones
//	static EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDMySQL();
	static EmpleadoCRUD empleadoCRUD = new EmpleadoCRUDExcel();



	public static void main(String[] args) {
		empleadoCRUD.findAll();
		empleadoCRUD.save(new Empleado());
	}

}

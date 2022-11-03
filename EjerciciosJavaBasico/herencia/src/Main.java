import empleados.*;

public class Main {

	public static void main(String[] args) {

		Empleado empleado = new Empleado("Manolo");
//		Cambiar nombre al empleado creado
		empleado.setNombre("Pepe");

		Operario operario = new Operario("Manolo");

		Directivo directivo = new Directivo("Izhan");

//		Creamos un oficial sin nombre
		Oficial oficial = new Oficial();
//		Poner nombre al oficial creado
		oficial.setNombre("Federico");

		Tecnico tecnico = new Tecnico("Juan");

		System.out.println(empleado.toString());
		System.out.println(operario.toString());
		System.out.println(directivo.toString());
		System.out.println(oficial.toString());
		System.out.println(tecnico.toString());
	}
}

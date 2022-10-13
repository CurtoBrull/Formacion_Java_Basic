import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyFilterStream {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(1, 2, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Empleados> empleadosList = new ArrayList<>();

		empleadosList.add(new Empleados("Juan", 20));
		empleadosList.add(new Empleados("Pedro", 30));
		empleadosList.add(new Empleados("Maria", 40));
		empleadosList.add(new Empleados("Jose", 50));

		myList.stream()
				.filter(numeros -> numeros % 2 == 0)
				.distinct()
				.limit(2)
				.forEach(System.out::println);

		empleadosList.stream()
				.filter(empleados -> empleados.getEdad() > 30 && empleados.getNombre().startsWith("M"))
				.forEach(empleados -> System.out.println(empleados.getNombre()));

		empleadosList.stream()
				.filter(empleados -> empleados.getEdad() >= 30)
				.collect(Collectors.toList());

		System.out.println(empleadosList);
	}
}
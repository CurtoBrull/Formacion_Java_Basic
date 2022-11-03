import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MyFilterStream {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(1, 2, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Empleados> empleadosList = new ArrayList<>();

		empleadosList.add(new Empleados("Juan", 20));
		empleadosList.add(new Empleados("Pedro", 30));
		empleadosList.add(new Empleados("Maria", 40));
		empleadosList.add(new Empleados("Jose", 50));
		empleadosList.add(new Empleados("Jose", 50));

		List<Empleados> empleadosList2 = empleadosList;

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

		System.out.println("----------------------");

		empleadosList2.stream().filter(distinctByKey((Empleados::getNombre))).forEach(System.out::println);

	}

	/**
	 * Método que permite filtrar por un campo de una clase
	 * @param keyExtractor Función que permite obtener el campo de la clase
	 * @return Retorna un objeto de tipo Predicate
	 * @param <T> Tipo de dato de la clase
	 */
	public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
		Set<Object> seen = ConcurrentHashMap.newKeySet();
		return t -> seen.add(keyExtractor.apply(t));
	}

}
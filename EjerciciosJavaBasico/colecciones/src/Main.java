import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	public static void main(String[] args) {

//		Crear instancias de PartidoFutbol con duplicados
		PartidoFutbol partido1 = new PartidoFutbol("Barcelona", "Real Madrid", 0, 0, "Camp Nou");
		PartidoFutbol partido2 = new PartidoFutbol("Barcelona", "Real Madrid", 0, 0, "Camp Nou");
		PartidoFutbol partido3 = new PartidoFutbol("Atlético de Madrid", "Athletic Club de Bilbao", 0, 0, "Wanda Metropolitano");
		PartidoFutbol partido4 = new PartidoFutbol("Osasuna", "Real Sociedad", 0, 0, "El Sadar");
		PartidoFutbol partido5 = new PartidoFutbol("Sevilla", "Valencia", 0, 0, "Ramón Sánchez Pizjuán");
		PartidoFutbol partido6 = new PartidoFutbol("Villareal", "Eibar", 0, 0, "Estadio de la Cerámica");

//		Guardar instancias de PartidoFutbol en un ArrayList
		ArrayList<PartidoFutbol> partidos = new ArrayList<>();

		partidos.add(partido1);
		partidos.add(partido2);
		partidos.add(partido3);
		partidos.add(partido4);
		partidos.add(partido5);
		partidos.add(partido6);


//		Recorrer array con foreach
		System.out.println("PARTIDOS FÚTBOL:");

		partidos.forEach(partido -> System.out.println(partido));

		System.out.println("-------------------------------");
		System.out.println("LISTA DE PARTIDOS SIN REPETIR:");

		/*
		HashSet no permite duplicados, pero los objetos PartidoFutbol son diferentes porque
		tienen diferentes direcciones de memoria por lo que he guardado el toString() para poder comparar
		*/
		HashSet<String> sinRepetir = new HashSet<>();
		sinRepetir.add(partido1.toString());
		sinRepetir.add(partido2.toString());
		sinRepetir.add(partido3.toString());
		sinRepetir.add(partido4.toString());
		sinRepetir.add(partido5.toString());
		sinRepetir.add(partido6.toString());

		sinRepetir.forEach(partido -> System.out.println(partido));

		System.out.println("-------------------------------");


//		HasMap no permite claves duplicadas
		HashMap<String, PartidoFutbol> partidosSinDuplicados = new HashMap<>();

//		Poner en el HashMap los partidos donde la clave es el estadio y así evitar duplicados
//		Con un identificador único por partido sería más seguro evitar duplicados

		for (PartidoFutbol partido : partidos) {
			partidosSinDuplicados.put(partido.getNombreEstadio(), partido);
		}

		System.out.println("HASHMAP - RECORRER POR LA CLAVE");
//		Recorrer el HashMap de partidos por la clave que es el nombre del estadio

		partidosSinDuplicados.forEach(
				(estadio, partido) -> System.out.println(estadio + "\n" + partido + "\n")
		);
	}
}
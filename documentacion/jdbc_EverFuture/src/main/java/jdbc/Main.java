package jdbc;

import java.sql.*;

public class Main {

	public static void main(String[] args) {

		try {
			conectar();
			consulta();
			System.out.println("Consulta 1 realizada");
			consulta("López");
			System.out.println("Consulta 2 realizada");
			transaccion();
			System.out.println("Transacción realizada");
			cerrar();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static Connection conexion = null;

	/**
	 * Método que conecta con la base de datos
	 *
	 * @param apellidos Apellidos del empleado
	 * @throws SQLException excepción
	 */
	public static void consulta(String apellidos) throws SQLException {

		String query2 = "SELECT id_alumno, nombre, apellidos FROM alumnos WHERE apellidos = ?";

//		Statement statement = conexion.createStatement();
		PreparedStatement statement = conexion.prepareStatement(query2);
//		Pasar parámetros a la consulta
		statement.setString(1, apellidos);
//		Guardar el resultado de la consulta
		ResultSet resultSet = statement.executeQuery();

		while (resultSet.next()) {
			int id = resultSet.getInt("id_alumno");
			String nombre = resultSet.getString("nombre");
			String apellido = resultSet.getString("apellidos");
			System.out.println(id + " " + nombre + " " + apellidos);
		}
		resultSet.close();
		statement.close();
	}

	/**
	 * Método que conecta con la base de datos
	 *
	 * @throws SQLException excepción
	 */
	public static void consulta() throws SQLException {
		String query1 = "SELECT id_profesor, nombre, apellidos FROM profesores";

		PreparedStatement statement = conexion.prepareStatement(query1);
		statement.executeQuery();
		ResultSet resultSet = statement.executeQuery();

		while (resultSet.next()) {
			int id = resultSet.getInt("id_profesor");
			String nombre = resultSet.getString("nombre");
			String apellido = resultSet.getString("apellidos");
			System.out.println(id + " " + nombre + " " + apellido);
		}
		resultSet.close();
		statement.close();


	}

	/**
	 * Método que conecta con la base de datos para realizar una transacción
	 *
	 * @throws SQLException excepción
	 */
	public static void transaccion() throws SQLException {
//		Sentencias a ejecutar
		final String PROFESOR = "INSERT INTO profesores (id_profesor, nombre, apellidos) VALUES (?, ?, ?)";
		final String ASIGNATURA = "INSERT INTO asignaturas (id_asignatura, nombre, profesor) VALUES (?, ?, ?)";
//		Comenzar la transacción
		PreparedStatement profesor = null, asignatura = null;

		try {
//			Transacción numero 1
			profesor = conexion.prepareStatement(PROFESOR);
			profesor.setInt(1, 50);
			profesor.setString(2, "Javier");
			profesor.setString(3, "García");
			profesor.executeUpdate();
//			Transacción numero 2
			asignatura = conexion.prepareStatement(ASIGNATURA);
			asignatura.setInt(1, 110);
			asignatura.setString(2, "Programación 2");
			asignatura.setInt(3, 50);
			asignatura.executeUpdate();

//			Ejecutar la transacción
			conexion.commit();
			System.out.println("Transacción realizada correctamente");

		} catch (SQLException e) {
//			Deshacer la transacción si falla alguna
			conexion.rollback();
			e.printStackTrace();
		} finally {
//			Cerrar las sentencias
			if (profesor != null) {
				profesor.close();
			}
			if (asignatura != null) {
				asignatura.close();
			}
		}
	}

	/**
	 * Conectar con BD
	 *
	 * @throws SQLException Si hay un error en la conexión
	 */
	public static void conectar() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/ejemplo";
		String password = "Fortuna100,";
		String user = "root";
		conexion = DriverManager.getConnection(url, user, password);
//		AutoCommit desactivado para transacciones
		conexion.setAutoCommit(false);


		System.out.println("Conectado");
	}

	/**
	 * Desconectar de la BD
	 *
	 * @throws SQLException Si hay un error en la desconexión
	 */
	private static void cerrar() throws SQLException {
		if (conexion != null) {
			System.out.println("Desconectado");
			conexion.close();
		}
	}

}
package dao.mysql;

import dao.MatriculaDAO;
import modelos.Matricula;

import java.sql.Connection;
import java.util.List;

public class MYSQLMatriculaDAO implements MatriculaDAO {

	final String INSERT = "INSERT INTO matricula (alumno, asignatura, fecha, nota) VALUES (?, ?, ?, ?)";
	final String UPDATE = "UPDATE matricula SET alumno = ?, asignatura = ?, fecha = ? WHERE alumno = ?";
	final String DELETE = "DELETE FROM matricula WHERE id_alumno = ?";
	final String GETALL = "SELECT id_alumno, nombre, apellidos, fecha_nac FROM matricula";
	final String GETONE = "SELECT id_alumno, nombre, apellidos, fecha_nac FROM matricula WHERE id_alumno = ?";

	private Connection conn;

	public MYSQLMatriculaDAO(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insertar(Matricula matricula) {

	}

	@Override
	public void modificar(Matricula matricula) {

	}

	@Override
	public void eliminar(Matricula matricula) {

	}

	@Override
	public Matricula obtener(Long aLong) {
		return null;
	}

	@Override
	public List<Matricula> obtenerTodos() {
		return null;
	}
}

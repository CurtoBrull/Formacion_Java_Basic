package dao.mysql;

import dao.AlumnoDAO;
import dao.AsignaturaDAO;
import dao.MatriculaDAO;
import dao.ProfesorDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MYSQLDaoManager implements dao.DAOManager {

	private Connection conn;

	private AlumnoDAO alumnos = null;
	private ProfesorDAO profesores = null;
	private AsignaturaDAO asignaturas = null;
	private MatriculaDAO matriculas = null;

	public MYSQLDaoManager(String host, String username, String password, String database) throws SQLException {
		conn = DriverManager.getConnection("jdbc:mysql://" + host + "/" + database, "root", "Fortuna100,");
	}

	@Override
	public AsignaturaDAO getAsignaturaDAO() {
		if (asignaturas == null) {
			asignaturas = new MYSQLAsignaturaDAO(conn);
		}
		return asignaturas;
	}

	@Override
	public ProfesorDAO getProfesorDAO() {
		if (profesores == null) {
			profesores = new MYSQLProfesorDAO(conn);
		}
		return profesores;
	}

	@Override
	public MatriculaDAO getMatriculaDAO() {
		if (matriculas == null) {
			matriculas = new MYSQLMatriculaDAO(conn);
		}
		return matriculas;
	}

	@Override
	public AlumnoDAO getAlumnoDAO() {
		if (alumnos == null) {
			alumnos = new MYSQLAlumnoDAO(conn);
		}
		return alumnos;
	}
}

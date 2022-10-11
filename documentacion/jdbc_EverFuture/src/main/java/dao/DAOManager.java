package dao;

public interface DAOManager {
	AsignaturaDAO getAsignaturaDAO();

	ProfesorDAO getProfesorDAO();

	MatriculaDAO getMatriculaDAO();

	AlumnoDAO getAlumnoDAO();
}
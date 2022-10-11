package dao.mysql;

import dao.AsignaturaDAO;
import dao.DAOExeption;
import modelos.Asignatura;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MYSQLAsignaturaDAO implements AsignaturaDAO {

	final String INSERT = "INSERT INTO asignaturas (nombre, profesor) VALUES (?, ?)";
	final String UPDATE = "UPDATE asignatura SET nombre = ?, profesor = ? WHERE id_asignatura = ?";
	final String DELETE = "DELETE FROM asignatura WHERE id_asignatura = ?";
	final String GETALL = "SELECT id_asignatura, nombre, profesor FROM alumnos";
	final String GETONE = "SELECT id_asignatura, nombre, profesor FROM alumnos WHERE id_asignatura = ?";

	private Connection conn;

	public MYSQLAsignaturaDAO(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insertar(Asignatura asignatura) throws DAOExeption {
		PreparedStatement stat = null;
		ResultSet rs = null;
		try {
			stat = conn.prepareStatement(INSERT);
			stat.setString(1, asignatura.getNombre());
			stat.setLong(2, asignatura.getIdProfesor());

			if (stat.executeUpdate() == 0) {
				throw new DAOExeption("Puede que no se haya guardado");
			}
			rs = stat.getGeneratedKeys();
			if (rs.next()) {
				asignatura.setId(rs.getLong(1));
			} else {
				throw new DAOExeption("No puedo asignar ID a este alumno");
			}

		} catch (SQLException e) {
			throw new DAOExeption("Error en SQL", e);
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					throw new DAOExeption("Error en SQL", e);
				}
			}

			if (stat != null) {
				try {
					stat.close();
				} catch (SQLException e) {
					throw new DAOExeption("Error en SQL", e);
				}
			}
		}
	}

	@Override
	public void modificar(Asignatura asignatura) throws DAOExeption {
		PreparedStatement stat = null;
		try {
			stat = conn.prepareStatement(UPDATE);
			stat.setLong(1, asignatura.getId());

			if (stat.executeUpdate() == 0) {
				throw new DAOExeption("Puede que no se haya guardado");
			}

		} catch (SQLException e) {
			throw new DAOExeption("Error en SQL", e);
		} finally {
			if (stat != null) {
				try {
					stat.close();
				} catch (SQLException e) {
					throw new DAOExeption("Error en SQL", e);
				}
			}
		}

	}

	@Override
	public void eliminar(Asignatura asignatura) throws DAOExeption {
		PreparedStatement stat = null;
		try {
			stat = conn.prepareStatement(DELETE);
			stat.setString(1, asignatura.getNombre());
			stat.setLong(2, asignatura.getIdProfesor());
			stat.setLong(3, asignatura.getId());

			if (stat.executeUpdate() == 0) {
				throw new DAOExeption("Puede que no se haya guardado");
			}

		} catch (SQLException e) {
			throw new DAOExeption("Error en SQL", e);
		} finally {
			if (stat != null) {
				try {
					stat.close();
				} catch (SQLException e) {
					throw new DAOExeption("Error en SQL", e);
				}
			}
		}
	}

	private Asignatura convertir(ResultSet rs) throws SQLException {
		Long id = rs.getLong("id_asignatura");
		String nombre = rs.getString("nombre");
		Long profesor = rs.getLong("id_profesor");
		Asignatura asignatura = new Asignatura(id, nombre, profesor);
		return asignatura;
	}

	@Override
	public Asignatura obtener(Long aLong) throws DAOExeption {
		PreparedStatement stat = null;
		ResultSet rs = null;
		try {
			stat = conn.prepareStatement(GETONE);
			stat.setLong(1, aLong);
			rs = stat.executeQuery();
			if (rs.next()) {
				return convertir(rs);
			} else throw new DAOExeption("No se ha encontrado ese registro");
		} catch (SQLException e) {
			throw new DAOExeption("Error en SQL", e);
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					throw new DAOExeption("Error en SQL", e);
				}
			}
			if (stat != null) {
				try {
					stat.close();
				} catch (SQLException e) {
					throw new DAOExeption("Error en SQL", e);
				}
			}
		}
	}

	@Override
	public List<Asignatura> obtenerTodos() throws DAOExeption {
		PreparedStatement stat = null;
		ResultSet rs = null;
		List<Asignatura> asignaturas = new ArrayList<>();

		try {
			stat = conn.prepareStatement(GETALL);
			rs = stat.executeQuery();
			while (rs.next()) {
				asignaturas.add(convertir(rs));
			}
		} catch (SQLException e) {
			throw new DAOExeption("Error en SQL", e);
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					throw new DAOExeption("Error en SQL", e);
				}
			}
			if (stat != null) {
				try {
					stat.close();
				} catch (SQLException e) {
					throw new DAOExeption("Error en SQL", e);
				}
			}
		}
		return asignaturas;
	}
}

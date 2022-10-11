package dao.mysql;

import dao.AlumnoDAO;
import dao.DAOExeption;
import modelos.Alumno;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MYSQLAlumnoDAO implements AlumnoDAO {

	final String INSERT = "INSERT INTO alumnos (id_alumno, nombre, apellidos, fecha_nac) VALUES (?, ?, ?, ?)";
	final String UPDATE = "UPDATE alumnos SET nombre = ?, apellidos = ?, fecha_nac = ? WHERE id_alumno = ?";
	final String DELETE = "DELETE FROM alumnos WHERE id_alumno = ?";
	final String GETALL = "SELECT id_alumno, nombre, apellidos, fecha_nac FROM alumnos";
	final String GETONE = "SELECT id_alumno, nombre, apellidos, fecha_nac FROM alumnos WHERE id_alumno = ?";
	private Connection conn;

	public MYSQLAlumnoDAO(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insertar(Alumno alumno) throws DAOExeption {
		PreparedStatement stat = null;
		try {
			stat = conn.prepareStatement(INSERT);
			stat.setLong(1, alumno.getId());
			stat.setString(2, alumno.getNombre());
			stat.setString(3, alumno.getApellidos());
			stat.setDate(4, new Date(alumno.getFecha_nacimiento().getTime()));

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
		;
	}

	@Override
	public void modificar(Alumno alumno) throws DAOExeption {
		PreparedStatement stat = null;
		try {
			stat = conn.prepareStatement(UPDATE);
			stat.setString(1, alumno.getNombre());
			stat.setString(2, alumno.getApellidos());
			stat.setDate(3, new Date(alumno.getFecha_nacimiento().getTime()));
			stat.setLong(4, alumno.getId());

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
		;
	}

	@Override
	public void eliminar(Alumno alumno) throws DAOExeption {
		PreparedStatement stat = null;
		try {
			stat = conn.prepareStatement(DELETE);
			stat.setLong(1, alumno.getId());

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
		;
	}

	private Alumno convertir(ResultSet rs) throws SQLException {
		Long id = rs.getLong("id_alumno");
		String nombre = rs.getString("nombre");
		String apellidos = rs.getString("apellidos");
		Date fecha_nac = rs.getDate("fecha_nac");
		Alumno alumno = new Alumno(id, nombre, apellidos, fecha_nac);
		return alumno;
	}

	@Override
	public Alumno obtener(Long aLong) throws DAOExeption {
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
	public List<Alumno> obtenerTodos() throws DAOExeption {
		PreparedStatement stat = null;
		ResultSet rs = null;
		List<Alumno> alumnos = new ArrayList<>();

		try {
			stat = conn.prepareStatement(GETALL);
			rs = stat.executeQuery();
			while (rs.next()) {
				alumnos.add(convertir(rs));
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
		return alumnos;
	}
}
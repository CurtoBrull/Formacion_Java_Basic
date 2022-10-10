package org.example.repositorio;

import org.example.modelo.Producto;
import org.example.util.DBConnect;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepositorioImpl implements Repositorio<Producto> {

		private Connection getConnection() throws SQLException {
				return DBConnect.getConnection();
		}

		@Override
		public List<Producto> listar() {
				List<Producto> productos = new ArrayList<>();

				try (Statement stmt = getConnection().createStatement(); ResultSet resultado = stmt.executeQuery("SELECT * FROM productos")) {
						while (resultado.next()) {
								crearProducto(resultado);
						}
				} catch (SQLException e) {
						System.out.println("Error en la conexión");
						e.printStackTrace();
				}
				return productos;
		}


		@Override
		public Producto porId(Long id) {
				Producto producto = null;
				try (
								PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM productos WHERE id = ?")
				) {
						stmt.setLong(1, id);
						ResultSet resultado = stmt.executeQuery();
						if (resultado.next()) {
								producto = crearProducto(resultado);
						}
						resultado.close();
				} catch (SQLException e) {
						throw new RuntimeException(e);
				}
				return producto;
		}

		@Override
		public void guardar(Producto t) {

		}

		@Override
		public void eliminar(Long id) {

		}

		@Override
		public void modificar(Producto t) {

		}

		private Producto crearProducto(ResultSet resultado) throws SQLException {
				Producto producto = new Producto();
				producto.setId(resultado.getLong("id"));
				producto.setNombre(resultado.getString("nombre"));
				producto.setPrecio(resultado.getInt("precio"));
				producto.setFechaRegistro(resultado.getDate("fecha_registro"));
				return producto;
		}
}


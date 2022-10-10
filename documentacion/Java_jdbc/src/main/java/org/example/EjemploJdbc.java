package org.example;

import org.example.modelo.Producto;
import org.example.repositorio.ProductoRepositorioImpl;
import org.example.repositorio.Repositorio;
import org.example.util.DBConnect;

import java.sql.Connection;
import java.sql.SQLException;

public class EjemploJdbc {
	public static void main(String[] args) {

		try (Connection conn = DBConnect.getConnection()) {
			Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
			repositorio.listar().forEach(producto -> System.out.println(producto.getNombre()));
		} catch (SQLException e) {
			System.out.println("Error en la conexión");
			e.printStackTrace();
		}
	}
}
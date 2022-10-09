package org.example;

import org.example.util.DBConnect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EjemploJdbc {
	public static void main(String[] args) {

		try (
				Connection conn = DBConnect.getConnection();
				Statement stmt = conn.createStatement();
				ResultSet resultado = stmt.executeQuery("SELECT * FROM productos")
		) {
			while (resultado.next()) {
				System.out.print(resultado.getInt("id") + " | ");
				System.out.print(resultado.getString("nombre") + " | ");
				System.out.print(resultado.getInt("precio") + "  | ");
				System.out.println(resultado.getDate("fecha_registro"));
			}
		} catch (SQLException e) {
			System.out.println("Error en la conexión");
			e.printStackTrace();
		}
	}
}
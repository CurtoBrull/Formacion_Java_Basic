package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	private static final String url = "jdbc:mysql://localhost:3306/java_curso?serverTimezone=UTC";
	private static final String username = "root";
	private static final String password = "Fortuna100,";
	private static Connection conn = null;

	public static Connection getConnection() {
		try {
			if (conn == null) {
				conn = DriverManager.getConnection(url, username, password);
			}
		} catch (SQLException e) {
			System.out.println("Error en la conexión");
			e.printStackTrace();
		}
		return conn;
	}
}

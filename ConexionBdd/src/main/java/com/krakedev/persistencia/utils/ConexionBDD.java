package com.krakedev.persistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBDD {
	private final static String DRIVER = "org.postgresql.Driver";
	private final static String URL = "jdbc:postgresql://localhost:5432/el_hocicon";
	private final static String USUARIO = "postgres";
	private final static String PASSWORD = "root";
	
	public static Connection conectar() throws Exception{
		Connection connection = null;
		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USUARIO, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new Exception("Error en la infraestructura");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Error al conectarse");
		}
		System.out.println("Conexión exitosa");
		return connection;
	}
}

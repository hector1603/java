package com.krakedev.conexionbdd;

import java.util.Date;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestConexion {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/ejercicios", "postgres", "root");
			System.out.println("Conexión exitosa");
			
			ps = connection.prepareStatement("INSERT INTO usuarios(id_usuario, nombre, apellido, fecha_nacimiento)"
					+ "VALUES(?,?,?,?);");
			
			ps.setInt(1, 45);
			ps.setString(2, "Daniel");
			ps.setString(3, "Salamanca");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr = "1998/09/01 10:05:04";
			Date fecha = null;
			try {
				fecha = sdf.parse(fechaStr);
				System.out.println(fecha);
				long fechaMilis = fecha.getTime();
				System.out.println(fechaMilis);
				java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
				Time timeSQL = new Time(fechaMilis);
				System.out.println(fechaSQL + " | " + timeSQL);
				
				ps.setDate(4, fechaSQL);
				ps.executeUpdate();
				System.out.println("Ex");
			} catch (ParseException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}

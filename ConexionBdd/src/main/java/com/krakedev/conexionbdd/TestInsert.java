package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestInsert {

	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement pp = null;
		PreparedStatement pv = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/pruebas", "postgres", "root");
			System.out.println("Conexión exitosa");
			
			pp = connection.prepareStatement("INSERT INTO productos(codigo, nombre, precio, stock)"
					+ "VALUES(?,?,?,?);");
			
			pp.setInt(1, 11);
			pp.setString(2, "Doritos");
			pp.setBigDecimal(3, new BigDecimal(2.50));
			pp.setInt(4, 16);
			
			pp.executeUpdate();
			System.out.println("producto agregado");
			
			
			pv = connection.prepareStatement("INSERT INTO ventas(id_venta, codigo_producto, fecha_venta)"
					+ "VALUES(?,?,?);");
			
			pv.setInt(1, 500);
			pv.setInt(2, 11);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr = "1998/09/01 10:05:04";
			Date fecha = null;
			try {
				fecha = sdf.parse(fechaStr);
				long fechaMilis = fecha.getTime();
				java.sql.Date fechaSQL = new java.sql.Date(fechaMilis);
				
				pv.setDate(3, fechaSQL);
				pv.executeUpdate();
				
				System.out.println("Venta exitosa");
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}

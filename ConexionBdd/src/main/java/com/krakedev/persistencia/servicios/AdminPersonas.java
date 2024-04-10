package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	
	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);
 	
	public static void insertar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		try {
			con = ConexionBDD.conectar();
			
			
			ps = con.prepareStatement("INSERT INTO personas(cedula, nombre, apellido, fecha_nacimiento,"
					+ "hora_nacimiento, estatura, numero_hijos, cantidad_ahorrada, estado_civil_codigo)"
					+ "VALUES(?,?,?,?,?,?,?,?,?);");
			
			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			
			ps.setDate(4, new java.sql.Date(persona.getFechaNacimiento().getTime()));
			ps.setTime(5, new java.sql.Time(persona.getHoraNacimiento().getTime()));
			
			ps.setDouble(6, persona.getEstatura());
			ps.setInt(7, persona.getNumeroHijos());
			ps.setBigDecimal(8, persona.getCantidadAhorrada());
			ps.setString(9, persona.getEstadoCivil().getCodigo());
			
			ps.executeUpdate();	
			
			System.out.println("Insertado");
			
		} catch(Exception e) {
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error al insertar");
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos");
				throw new Exception("Error con la base de datos");
			}
		}
	}
	
	public static void actualizar(Persona persona) throws Exception {
	    Connection con = null;
	    PreparedStatement ps = null;
	    try {
	        con = ConexionBDD.conectar();
	        
	        
	        
	        ps = con.prepareStatement("UPDATE personas SET nombre=?, apellido=?, fecha_nacimiento=?, "
					+ "hora_nacimiento=?, estatura=?, numero_hijos=?, cantidad_ahorrada=?, estado_civil_codigo=? "
					+ "WHERE cedula=?");
	        
	        ps.setString(1, persona.getNombre());
	        ps.setString(2, persona.getApellido());
	        ps.setDate(3, new java.sql.Date(persona.getFechaNacimiento().getTime()));
	        ps.setTime(4, new java.sql.Time(persona.getHoraNacimiento().getTime()));
	        ps.setDouble(5, persona.getEstatura());
	        ps.setInt(6, persona.getNumeroHijos());
	        ps.setBigDecimal(7, persona.getCantidadAhorrada());
	        ps.setString(8, persona.getEstadoCivil().getCodigo());
	        ps.setString(9, persona.getCedula());
	        
	        //System.out.println("Consulta SQL: " + ps.toString());
	        
	       ps.executeUpdate(); 
	    } catch(Exception e) {
	        LOGGER.error("Error al actualizar", e);
	        throw new Exception("Error al actualizar"+ e.getMessage());
	    } finally {
	        try {
	            if(ps != null) {
	                ps.close();
	            }
	            if(con != null) {
	                con.close();
	            }
	        } catch (SQLException e) {
	            LOGGER.error("Error al cerrar la conexión", e);
	            throw new Exception("Error al cerrar la conexión");
	        }
	    }
	}
	
	public static void eliminar(String cedula) throws Exception {
		Connection con = null;
		PreparedStatement ps;
		try {
			con = ConexionBDD.conectar();
			
			
			ps = con.prepareStatement("DELETE FROM personas WHERE cedula=?");
			ps.setString(1, cedula);			
			
			ps.executeUpdate();	
			
			System.out.println("Persona con cedula " + cedula + " eliminada");
			
		} catch(Exception e) {
			LOGGER.error("Error al eliminar registros", e);
			throw new Exception("Error al eliminar registros" + e.getMessage());
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos");
				throw new Exception("Error con la base de datos");
			}
		}
	}
	
	public static ArrayList<Persona> buscarPorNombre(String nombreBuscado) throws Exception{
		ArrayList<Persona> persona = new ArrayList<Persona>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("SELECT * FROM personas WHERE nombre LIKE ?");
			ps.setString(1, "%"+nombreBuscado+"%");
			
			rs = ps.executeQuery();
			while(rs.next()) {
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				Persona p = new Persona();
				p.setCedula(cedula);
				p.setNombre(nombre);
				persona.add(p);
				
			}
		} catch (Exception e) {
			LOGGER.error("Error al buscar por nombre", e);
			throw new Exception("Error al buscar por nombre" + e.getMessage());
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos");
				throw new Exception("Error con la base de datos");
			}
		}
		
		
		return persona;
	}
	
	public static Persona buscarPorCedula(String cedula) throws Exception{
		Persona persona = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("SELECT * FROM personas WHERE cedula=?");
			ps.setString(1, cedula);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				persona = new Persona();
				persona.setCedula(rs.getString("cedula"));
	            persona.setNombre(rs.getString("nombre"));
			}
		
		} catch (Exception e) {
			LOGGER.error("Error al buscar por cedula", e);
			throw new Exception("Error al buscar por cedula" + e.getMessage());
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos");
				throw new Exception("Error con la base de datos");
			}
		}
		return persona;
	}
	
	
	public static ArrayList<Persona> buscarFamilia(String apellido) throws Exception{
		ArrayList<Persona> persona = new ArrayList<Persona>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("SELECT * FROM personas WHERE apellido=?");
			ps.setString(1, "%"+apellido+"%");
			
			rs = ps.executeQuery();
			while(rs.next()) {
				String cedula = rs.getString("cedula");
				String nombre = rs.getString("nombre");
				Persona p = new Persona();
				p.setCedula(cedula);
				p.setNombre(nombre);
				persona.add(p);
				
			}
		} catch (Exception e) {
			LOGGER.error("Error al buscar por nombre", e);
			throw new Exception("Error al buscar por nombre" + e.getMessage());
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error con la base de datos");
				throw new Exception("Error con la base de datos");
			}
		}
		
		
		return persona;
	}

}

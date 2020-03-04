package gestionVentaCoches.modelo.controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;  
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import gestionVentaCoches.modelo.Concesionario;




public class ControladorConcesionario extends ControladorBBDD {

	
	
	public static List<Concesionario> getAll () throws ErrorBBDDException {
		List<Concesionario> concesionarios = new ArrayList<Concesionario> ();
				
		Connection conn = null;

		try {
			conn = ConnectionManagerV2.getConexion();
			
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("Select * from concesionario");

			while (rs.next()) {
				Concesionario con = new Concesionario();
				con.setId(rs.getInt("id"));
				con.setCif(rs.getString("cif"));
				con.setNombre(rs.getString("nombre"));
				con.setLocalidad(rs.getString("localidad"));
				concesionarios.add(con);
			}
			
			s.close();
			
		} catch (SQLException | ImposibleConectarException e) {			
			throw new ErrorBBDDException(e);
		} 
		return concesionarios;
	}
	

	public static void almacenarCon (Concesionario concesionario) throws ErrorBBDDException {
		if (get(concesionario.getId()) != null) { // Solo modificar
			almacenarModificado(concesionario);
		}
		else { // Crear nuevo objeto en la BBDD
			almacenarNuevo(concesionario);
		}
	}
	

	public static Concesionario get (int id) throws ErrorBBDDException {
		Connection conn = null;
		Concesionario con = null;

		try {
			conn = ConnectionManagerV2.getConexion();
			
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("Select * from concesionario where id = " + id);

			if (rs.next()) {
				con = new Concesionario();
				con.setId(id);
				con.setCif(rs.getString("cif"));
				con.setNombre(rs.getString("nombre"));
				con.setLocalidad(rs.getString("localidad"));
			}
			s.close();
			
		} catch (SQLException | ImposibleConectarException e) {			
			throw new ErrorBBDDException(e);
		} 
		return con;
	}
	

	private static void almacenarNuevo (Concesionario con) throws ErrorBBDDException {

		Connection conn = null;

		try {
			conn = ConnectionManagerV2.getConexion();
			
			PreparedStatement ps = (PreparedStatement) conn.
					prepareStatement(
					"INSERT INTO concesionario (id, cif, nombre, localidad) VALUES  (?, ?, ?, ?)");
			int registrosInsertados;
			
			ps.setInt(1, nextIdEnTabla(conn, "concesionario")); 
			ps.setString(2, con.getCif());
			ps.setString(3, con.getNombre());
			ps.setString(4, con.getLocalidad());

			registrosInsertados = ps.executeUpdate();
			if (registrosInsertados != 1) {
				throw new ErrorBBDDException ("No ha sido posible la insercion del nuevo registro");
			}
			ps.close();
			
		} catch (SQLException | ImposibleConectarException e) {			
			throw new ErrorBBDDException(e);
		}

	}
	

	private static void almacenarModificado (Concesionario con) throws ErrorBBDDException {

		Connection conn = null;

		try {
			conn = ConnectionManagerV2.getConexion();
			
			PreparedStatement ps = (PreparedStatement) conn.
					prepareStatement(
					"update concesionario set cif = ?, nombre = ?, localidad = ? where id = ?");
			int registrosInsertados;
			
			ps.setString(1, con.getCif());
			ps.setString(2, con.getNombre());
			ps.setString(3, con.getLocalidad());
			ps.setInt(4, con.getId()); 

			registrosInsertados = ps.executeUpdate();
			if (registrosInsertados != 1) {
				throw new ErrorBBDDException ("No ha sido posible la modificaci�n del registro");
			}
			ps.close();
			
		} catch (SQLException | ImposibleConectarException e) {			
			throw new ErrorBBDDException(e);
		}

	}
	
	

	public static void eliminar (Concesionario con) throws ErrorBBDDException {

		Connection conn = null;

		try {
			conn = ConnectionManagerV2.getConexion();
			
			PreparedStatement ps = (PreparedStatement) conn.
					prepareStatement(
					"delete from concesionario where id = ?");
			int registrosInsertados;
			
			ps.setInt(1, con.getId()); 

			registrosInsertados = ps.executeUpdate();
			if (registrosInsertados != 1) {
				throw new ErrorBBDDException ("No ha sido posible la eliminación del registro");
			}
			ps.close();
			
		} catch (SQLException | ImposibleConectarException e) {			
			throw new ErrorBBDDException(e);
		}

	}
	
	
}

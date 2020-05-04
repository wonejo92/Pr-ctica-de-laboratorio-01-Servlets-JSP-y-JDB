package ec.edu.ups.mysql.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.JDBCDAOFactory;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.modelo.Usuario;
import ec.edu.ups.modelo.Telefono;



public class JDBCUsuarioDAO extends JDBCGenericDAO<Usuario, String> implements UsuarioDAO {

	@Override
	public void createTable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Usuario user) {
		conexionUno.update("INSERT User VALUES (" + user.getCedula() + ", " + user.getNombre() + ", '" + user.getApellido()
		+ "', '" + user.getCorreo() + "','"+ user.getContrasena() + "')");
	}

	@Override
	public Usuario read(String cedula) {
		Usuario user = null;
		ResultSet rs = conexionUno.query("SELECT * FROM usuario WHERE cedula="+ cedula);
		try {
			if(rs != null && rs.next()) {
				user = new Usuario(rs.getString("cudula"), rs.getString("nombre"),rs.getString("apellido"),rs.getString("correo"),rs.getString("contrasena"));
			}
		}catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCUserDAO:read): " + e.getMessage());
		}
		return null;
	}

	@Override
	public void update(Usuario user) {
		System.out.println("Actualizando.." + user);
		conexionUno.update("UPDATE usuario SET name = '" + user.getNombre() + "', apellido = '" + user.getApellido()
		+ "', correo= " + user.getCorreo() + "', contrasena = '" + user.getContrasena() + " WHERE cedula = " + user.getCedula());
	}

	@Override
	public void delete(Usuario user) {
		conexionUno.update("DELETE FROM usuario WHERE cedula ="+ user.getCedula());
	}

	@Override
	public List<Usuario> find() {
		List<Usuario> list = new ArrayList<Usuario>();
		ResultSet rs = conexionUno.query("SELECT * FROM usuario");
		try {
			while(rs.next()) {
				Usuario user = new Usuario(rs.getString("cedula"),rs.getString("nombre"),rs.getString("apellido"),
						rs.getString("correo"),rs.getString("contrasena"));
				list.add(user);
			}
		}catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCUserDAO:find): " + e.getMessage());
		}
		return list;
	}



}

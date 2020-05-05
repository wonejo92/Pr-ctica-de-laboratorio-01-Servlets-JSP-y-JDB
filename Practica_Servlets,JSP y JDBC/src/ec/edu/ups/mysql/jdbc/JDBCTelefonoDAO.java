package ec.edu.ups.mysql.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.JDBCDAOFactory;
import java.util.List;

import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.modelo.Telefono;

public class JDBCTelefonoDAO extends JDBCGenericDAO<Telefono, Integer> implements TelefonoDAO {

	@Override
	public void createTable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Telefono telf) {
		System.out.println(telf.toString());
		String update = "INSERT telefono VALUES ('" + telf.getCodigo() + "', '" + telf.getNumero() + "', '" + telf.getTipo()
		+ "', '" + telf.getOperadora() + "','"+ telf.getUsuario_cedula() + "')";
		conexionUno.update(update);
	}

	@Override
	public Telefono read(Integer codigo) {
		Telefono telf = null;
		ResultSet rs = conexionUno.query("SELECT * FROM telefono WHERE codigo="+codigo);
		try {
			if(rs != null && rs.next()) {
				telf = new Telefono(rs.getInt("codigo"), rs.getString("numero"), rs.getString("tipo"), rs.getString("operadora"), rs.getString("usuario_cedula"));
			}
		}catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCUserDAO:read): " + e.getMessage());
		}
		return telf;
	}

	@Override
	public void update(Telefono telf) {
		conexionUno.update("UPDATE telefono SET codigo = '" + telf.getCodigo() + "', numero = '" + telf.getNumero()
		+ "', tipo= '" + telf.getTipo() + "', operadora = '" + telf.getOperadora() + "' WHERE codigo = " + telf.getCodigo());
		
	}

	@Override
	public void delete(Telefono telf) {
		conexionUno.update("DELETE FROM telefono WHERE codigo = "+ telf.getCodigo());
		
	}

	@Override
	public List<Telefono> find() {
		List<Telefono> list = new ArrayList<Telefono>();
		ResultSet rs = conexionUno.query("SELECT * FROM telefono");
		try {
			while(rs.next()) {
				Telefono telf = new Telefono(rs.getInt("codigo"), rs.getString("numero"), rs.getString("tipo"), rs.getString("operadora"), 
						rs.getString("usuario_cedula"));
				list.add(telf);
			}
		}catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCUserDAO:find): " + e.getMessage());
		}
		return list;
	}


}

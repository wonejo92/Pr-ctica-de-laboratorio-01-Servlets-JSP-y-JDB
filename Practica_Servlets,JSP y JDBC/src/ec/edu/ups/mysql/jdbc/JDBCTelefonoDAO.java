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
	public void create(Telefono entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Telefono read(Integer cedula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Telefono entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Telefono entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Telefono> find() {
		// TODO Auto-generated method stub
		return null;
	}


}

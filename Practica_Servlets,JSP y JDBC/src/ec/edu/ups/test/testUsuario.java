package ec.edu.ups.test;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.TelefonoDAO;
import ec.edu.ups.dao.UsuarioDAO;
import ec.edu.ups.modelo.*;

public class testUsuario {
	public static void main(String[] args) {
		UsuarioDAO userDAO = DAOFactory.getFactory().geUsuarioDAO();
		TelefonoDAO telfDAO =DAOFactory.getFactory().getTelefonoDAO();
		Telefono t1= new Telefono();
		Usuario u1 = new Usuario();
		
		String cedula="0105904312"; //9638520741
		String nombre="kevin";
		String apellido="cordero";
		String correo="kevin321";
		String contrasena="kevinC";
		
		u1.setCedula(cedula);
		u1.setNombre(nombre);
		u1.setApellido(apellido);
		u1.setCorreo(correo);
		u1.setContrasena(contrasena);
	
		
		
		int codigo =3;
		String numero ="0991269200";
		String typo ="movil";
		String operadora="Claro";
		
		t1.setCodigo(codigo);
		t1.setNumero(numero);
		t1.setTipo(typo);
		t1.setOperadora(operadora);
		t1.setUsuario_cedula(u1.getCedula());
		
		
		//userDAO.create(u1);
		//telfDAO.create(t1);
		
		System.out.println("Revision de la informacion y de los metodos del USUARIO ");
		System.out.println();
		System.out.println(userDAO.read(cedula));
		String nombreA = "Kevin";
		u1.setNombre(nombreA);
		userDAO.update(u1);
		System.out.println("Datos Actualizados.");
		System.out.println();
		System.out.println("Lista de usuarios"+userDAO.find());
		
		System.out.println();
		System.out.println();
		
		System.out.println("Revision de la informacion y de los metodos del TELEFONO ");
		System.out.println();
		System.out.println(telfDAO.read(t1.getCodigo()));
		String nuermo2="0991269100";
		t1.setNumero(nuermo2);
		telfDAO.update(t1);
		System.out.println("Datos Actualizados.");
		System.out.println();
		System.out.println("Lista de Telefonos: "+telfDAO.find());
		
		
	}

}

package ec.edu.ups.modelo;

import java.io.Serializable;
/**
 * @author Kevin Cordero.
 */
public class Usuario implements Serializable {

//Declaracion de Variables.
	
	private static final long serialVersionUID = 1L;
	private String cedula;
	private String nombre;
	private String apellido;
	private String correo;
	private String contrasena;

//Constructores.
	public Usuario() {
		// TODO Auto-generated constructor stub
	}
	
	public Usuario(String cedula,String nombre, String apellido,String correo,String contrasena) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.correo = correo;
		this.contrasena = contrasena;	
	}
	
//Segenera los Getters and Setters.

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

//Se genera el toString
	
	@Override
	public String toString() {
		return "Usuario [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo
				+ ", contrasena=" + contrasena + "]";
	}
}

package ec.edu.ups.modelo;

import java.io.Serializable;

public class Telefono implements Serializable {

//Declaracion de Variables.
	private static final long serialVersionUID = 1L;
	private int codigo;
	private String numero;
	private String tipo;
	private String operadora;
	private String Usuario_cedula;

//Constructores.
	public Telefono() {
		// TODO Auto-generated constructor stub
	}
	
	public Telefono(int codigo, String numero, String tipo, String operadora, String usuario_cedula) {
	super();
	this.codigo = codigo;
	this.numero = numero;
	this.tipo = tipo;
	this.operadora = operadora;
	this.Usuario_cedula = usuario_cedula;
	}
	
//Se genera los Getters and Setters.
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String getUsuario_cedula() {
		return Usuario_cedula;
	}

	public void setUsuario_cedula(String usuario_cedula) {
		Usuario_cedula = usuario_cedula;
	}
	
//Se genera el toString.
	@Override
	public String toString() {
		return "Telefono [codigo=" + codigo + ", numero=" + numero + ", tipo=" + tipo + ", operadora=" + operadora
				+ ", Usuario_cedula=" + Usuario_cedula + "]";
	}
}

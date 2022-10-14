package com.edu.unab.modelo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="propietario")
public class Propietario {
	@Id
	@Column (name="id_propietario")
	private Integer id_propietario;
	@Column (name="nombre")
	private String nombre;
	@Column (name="usuario")
	private String usuario;
	@Column (name="contrasena")
	private String contrasena;
	@Column (name="documento")
	private String documento;
	@Column (name="telefono")
	private String telefono;
	@Column (name="email")
	private String email;
	@Column (name="persona")
	private String persona;
	@Column (name="cuenta")
	private String cuenta;
	
	
	public Propietario(Integer id_propietario, String nombre, String usuario, String contrasena, String documento,
			String telefono, String email, String persona, String cuenta) {
		
		this.id_propietario = id_propietario;
		this.nombre = nombre;
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.documento = documento;
		this.telefono = telefono;
		this.email = email;
		this.persona = persona;
		this.cuenta = cuenta;
			
	}

	public Propietario() {
		super();
	}

	public Integer getId_propietario() {
		return id_propietario;
	}

	public void setId_propietario(Integer id_propietario) {
		this.id_propietario = id_propietario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPersona() {
		return persona;
	}

	public void setPersona(String persona) {
		this.persona = persona;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	@Override
	public String toString() {
		return "Propietario [id_propietario=" + id_propietario + ", nombre=" + nombre + ", usuario=" + usuario
				+ ", contrasena=" + contrasena + ", documento=" + documento + ", telefono=" + telefono + ", email="
				+ email + ", persona=" + persona + ", cuenta=" + cuenta + "]";
	}
	
	
	
	
}

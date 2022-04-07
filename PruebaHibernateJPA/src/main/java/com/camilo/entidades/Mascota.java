package com.camilo.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity @Table(name= "Mascotas")
public class Mascota implements Serializable {
	
	private static final long serialVersionUId = 1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_mascota") private long idMascota;
	@Column (nullable = false, length = 45) private String nombre;
	@Column (length = 45) private String raza;
	@Column (name = "color", length = 45) private String colorMascota;
	@Column (length = 45) private String sexo;
	@ManyToOne
	@JoinColumn (name="persona_id",referencedColumnName = "id_persona")
	private Persona duenio;
	
	
	public Mascota(long idMascota, String nombre, String raza, String colorMascota, String sexo, Persona duenio) {
		super();
		this.idMascota = idMascota;
		this.nombre = nombre;
		this.raza = raza;
		this.colorMascota = colorMascota;
		this.sexo = sexo;
		this.duenio = duenio;
	}

	public Mascota() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	public Persona getDuenio() {
		return duenio;
	}

	public void setDuenio(Persona duenio) {
		this.duenio = duenio;
	}

	public long getIdMascota() {
		return idMascota;
	}


	public void setIdMascota(long idMascota) {
		this.idMascota = idMascota;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public String getColorMascota() {
		return colorMascota;
	}


	public void setColorMascota(String colorMascota) {
		this.colorMascota = colorMascota;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Mascota [idMascota=" + idMascota + ", nombre=" + nombre + ", raza=" + raza + ", colorMascota="
				+ colorMascota + ", sexo=" + sexo + ", duenio=" + duenio + "]";
	}


	
	
	
}

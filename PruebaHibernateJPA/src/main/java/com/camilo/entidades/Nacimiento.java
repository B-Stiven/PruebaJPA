package com.camilo.entidades;

import java.io.Serializable;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table
public class Nacimiento implements Serializable {
	
	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_nacimiento") 
	private Long idNacimiento;
	
	@Column (name="fecha_nacimiento")
	private LocalDate fechaNacimiento;
	
	@Column (name="ciudad_nacimiento")
	private String ciudadNacimiento;
	
	@Column (name="departamento_nacimiento")
	private String departamentoNacimietno;
	
	@Column (name = "pais_nacimiento")
	private String paisNacimiento;
	
	@OneToOne(mappedBy = "nacimiento",fetch = FetchType.LAZY)
	private Persona persona;

	public Nacimiento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Nacimiento(Long idNacimiento, LocalDate fechaNacimiento, String ciudadNacimiento,
			String departamentoNacimietno, String paisNacimiento) {
		super();
		this.idNacimiento = idNacimiento;
		this.fechaNacimiento = fechaNacimiento;
		this.ciudadNacimiento = ciudadNacimiento;
		this.departamentoNacimietno = departamentoNacimietno;
		this.paisNacimiento = paisNacimiento;
	}
	
	

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Long getIdNacimiento() {
		return idNacimiento;
	}

	public void setIdNacimiento(Long idNacimiento) {
		this.idNacimiento = idNacimiento;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCiudadNacimiento() {
		return ciudadNacimiento;
	}

	public void setCiudadNacimiento(String ciudadNacimiento) {
		this.ciudadNacimiento = ciudadNacimiento;
	}

	public String getDepartamentoNacimietno() {
		return departamentoNacimietno;
	}

	public void setDepartamentoNacimietno(String departamentoNacimietno) {
		this.departamentoNacimietno = departamentoNacimietno;
	}

	public String getPaisNacimiento() {
		return paisNacimiento;
	}

	public void setPaisNacimiento(String paisNacimiento) {
		this.paisNacimiento = paisNacimiento;
	}

	@Override
	public String toString() {
		String cad= "Nacimiento [idNacimiento=" + idNacimiento + ", fechaNacimiento=" + fechaNacimiento
				+ ", ciudadNacimiento=" + ciudadNacimiento + ", departamentoNacimietno=" + departamentoNacimietno
				+ ", paisNacimiento=" + paisNacimiento + "]";
		
		if(persona!=null) {
		 cad+="persona="+persona.getIdPersona()+"-"+persona.getNombre();
		}
		return cad;
	}
	
	

	
	
	
	
	

}

package com.camilo.dao;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.*;
import javax.swing.JOptionPane;

import com.camilo.aplicacion.JPAUtil;
import com.camilo.entidades.Mascota;
import com.camilo.entidades.Persona;

import controlador.Coordinador;


public class PersonaDao {
	
	private Coordinador micoordinador;
	
	public void setCoordinador(Coordinador miCoordinador) {
		this.micoordinador = miCoordinador;
		
	}
	
		
	EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();

	public void close() {
		entityManager.close();
		JPAUtil.shutdown();
	}

	public String registrarPersona(Persona miPersona) {
		
		
		entityManager.getTransaction().begin();
		entityManager.persist(miPersona);
		entityManager.getTransaction().commit();
		
		String  res = "persona Registrada";
		
		return res;
		
	}

	public List<Persona> consultarListaPersonas() {
		List<Persona> listapersona  = new ArrayList<Persona>();
		Query query = entityManager.createQuery("SELECT p FROM Persona p");
		listapersona = query.getResultList();
		
		return listapersona;
	}

	public Persona consultarPersona(Long idpersona) {
		Persona mipersona = entityManager.find(Persona.class,idpersona);
		
		if (mipersona!=null) {
			
			return mipersona;
		} else {
			return null;
		}
	}

	public String actualizarpersona(Persona mipersona) {
		entityManager.getTransaction().begin();
		entityManager.merge(mipersona);
		entityManager.getTransaction().commit();
		
		String  res = "Persona Actualizada";
		return res;	
	}

	public String eliminarpersona(Persona mipersona) {
		
		String resp="";
		try {
			entityManager.getTransaction().begin();
			entityManager.remove(mipersona);
			entityManager.getTransaction().commit();
			
			resp = "persona Eliminada";
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "no se puede eliminar la persona verifique que no tenga registros pendientess",null, JOptionPane.ERROR_MESSAGE, null);
		}
	
		return resp;	
	}



	

}

package com.camilo.dao;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.*;
import javax.swing.JOptionPane;

import com.camilo.aplicacion.JPAUtil;
import com.camilo.entidades.Persona;
import com.camilo.entidades.PersonasProductos;
import com.camilo.entidades.Producto;

import controlador.Coordinador;

public class ProductoDao {
	
	Coordinador micoordinador;
	
	public void setCoordinador(Coordinador miCoordinador) {
		this.micoordinador=miCoordinador;
		
	}

	
	EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();

	public void close() {
		entityManager.close();
		JPAUtil.shutdown();
		
	}

	public Producto consultarProducto(long idproducto) {
		Producto miProducto = entityManager.find(Producto.class,idproducto);
		
		if (miProducto!=null) {
			
			return miProducto;
		} else {
			return null;
		}
	}

	public List<Producto> consultarListaProsucto() {
		List<Producto> listaProducto  = new ArrayList<Producto>();
		Query query = entityManager.createQuery("SELECT p FROM Producto p");
		listaProducto = query.getResultList();
		
		return listaProducto;
	}

	public String actualizarMascota(Producto miproducto) {
		entityManager.getTransaction().begin();
		entityManager.merge(miproducto);
		entityManager.getTransaction().commit();
		
		String  res = "Producto Actualizada";
		return res;	
	}

	public String eliminarproducto(Producto miproducto) {
		String resp="";
		try {
			entityManager.getTransaction().begin();
			entityManager.remove(miproducto);
			entityManager.getTransaction().commit();
			
			resp = "persona Eliminada";
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "no se puede eliminar el producto verifique que no tenga registros pendientess",null, JOptionPane.ERROR_MESSAGE, null);
		}
	
		return resp;	
	}

	public String registarcompra(PersonasProductos producto) {
		String resp="";
		
		entityManager.getTransaction().begin();
		entityManager.persist(producto);
		entityManager.getTransaction().commit();
		resp = "se realizo la compra de producto ";
		
		return resp;	
	}

	public String registrarProducto(Producto miproducto) {
		entityManager.getTransaction().begin();
		entityManager.persist(miproducto);
		entityManager.getTransaction().commit();
		
		String  res = "ok";
		
		return res;
	}


}

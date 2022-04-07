package com.camilo.aplicacion;

import javax.persistence.EntityManagerFactory; 
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static final String UNIDAD_DE_RESISTENCIA =  "PruebaHibernate";
	private static EntityManagerFactory factory;
	
	public static EntityManagerFactory getEntityManagerFactory() {
		
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory(UNIDAD_DE_RESISTENCIA);
		}
		return factory;
	}
	
	
	public static void shutdown() {
		
		if (factory!=null) {
			factory.close();
			factory= null;
		}
	}
	

}

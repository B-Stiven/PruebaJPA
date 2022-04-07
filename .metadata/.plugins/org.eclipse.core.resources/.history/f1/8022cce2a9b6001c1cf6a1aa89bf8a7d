package com.camilo.aplicacion;

import javax.swing.JOptionPane;


import clases.GestionarMascotas;
import clases.GestionarPersonas;
import clases.GestionarProductos;
import controlador.Relaciones;

public class Principal {

	public static void main(String[] args) {
		
		String menu1="menu de opciones \n\n";
		menu1+="1. desea hacer el proceso sin interfaces \n";
		menu1+="2. desea hacer el proceso con interfaces \n";
		
		int opc1=0;
		
		while (opc1!=2) {
			opc1=Integer.parseInt(JOptionPane.showInputDialog(menu1));
			
			switch (opc1) {
			case 1:
				
				String menu="Menu de opciones \n\n";
				menu+="1. gestionar persona \n";
				menu+="2 . gestionar mascotas \n";
				menu+="3. gestionar producto \n";
				menu+="4. salir \n";
				
				int opc=0;
				
				while (opc!=4) {
					opc=Integer.parseInt(JOptionPane.showInputDialog(menu));
					
					switch (opc) {
					case 1: new GestionarPersonas().iniciar(); break;
					case 2: new GestionarMascotas().iniciar(); break;
					
			
					case 3: new GestionarProductos(); break;
					

					}
				}
				
				break;
				
			case 2:
				Relaciones misRelaciones=new Relaciones();
				break;

			default:
				JOptionPane.showConfirmDialog(null, "la opcion ingresada no esta habilitada");
			}
		}
		
		
	
		
	
		
		
		

		
		
	}

}

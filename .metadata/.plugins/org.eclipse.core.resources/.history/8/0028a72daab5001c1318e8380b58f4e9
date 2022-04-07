package controlador;


import com.camilo.dao.*;



import vista.gui.*;

public class Relaciones {
	
	public Relaciones() {
		VentanaPrincipal miVentanaPrincipal;
		RegistrarPersonasGui miRegistrarPersonasGui;
		RegistrarMascotasGui miRegistrarMascotasGui;
		RegistrarProductosGui miRegistrarProductosGui ;
		Coordinador miCoordinador;
		PersonaDao miPersonaDao;
		MascotaDao miMascotaDao;
		ProductoDao miProductoDao;
		ConsultarPersonaGui miConsultaPersonaGui;
		TablaPersonasGui miTablaPersonaGui;
		EliminarPersonaGui miElimminarPersonaGui;
		ConsultarProductoGui miConsultarProducto;
		EliminarProductoGui miEliminarProductoGui;
		ConsultarMascotaGui miConsultarMascotaGui;
		TablaMascotasGui miTablaMascotasGui;
		TablaProductosGui miTablaProductosGui;
		EliminarMascotaGui miEliminarMascotaGui;
		
		miVentanaPrincipal= new VentanaPrincipal();
		miCoordinador= new Coordinador();
		miRegistrarPersonasGui= new RegistrarPersonasGui(miVentanaPrincipal, true);
		miRegistrarProductosGui= new RegistrarProductosGui(miVentanaPrincipal, true);
		miPersonaDao= new PersonaDao();
		miMascotaDao= new MascotaDao();
		miProductoDao= new ProductoDao();
		
	
		miRegistrarMascotasGui= new RegistrarMascotasGui(miVentanaPrincipal, true, "");
		
		
	
		miConsultaPersonaGui=new ConsultarPersonaGui(miVentanaPrincipal,true);
		miTablaPersonaGui = new TablaPersonasGui();
		miElimminarPersonaGui=new EliminarPersonaGui(miVentanaPrincipal, true);
		miConsultarProducto=new ConsultarProductoGui();
		miEliminarProductoGui=new EliminarProductoGui();
		miConsultarMascotaGui=new ConsultarMascotaGui(miVentanaPrincipal, true);
		miTablaMascotasGui = new TablaMascotasGui();
		miTablaProductosGui = new TablaProductosGui();
		miEliminarMascotaGui=new EliminarMascotaGui(miVentanaPrincipal, true); 

		
	
		
		miCoordinador.setVentanaPrincipal(miVentanaPrincipal);
		miCoordinador.setRegistrarPersonasGui(miRegistrarPersonasGui);
		miCoordinador.setRegistrarProductosGui(miRegistrarProductosGui);

		miCoordinador.setPersonaDao(miPersonaDao);
		miCoordinador.setMascotaDao(miMascotaDao);
		miCoordinador.setProductoDao(miProductoDao);
		
	
		miCoordinador.setRegistrarMascotasGui(miRegistrarMascotasGui);
	
		miCoordinador.setConsultarPersonaGui(miConsultaPersonaGui);
		miCoordinador.setTablaPersonasGui(miTablaPersonaGui);
		miCoordinador.setEliminarPersonaGui(miElimminarPersonaGui);
		miCoordinador.setConsultarProductoGui(miConsultarProducto);
		miCoordinador.setEliminarProductoGui(miEliminarProductoGui);
		miCoordinador.setConsultarmascota(miConsultarMascotaGui);
		miCoordinador.setMiTablaMascotasGui(miTablaMascotasGui);
		miCoordinador.setTablaProductosGui(miTablaProductosGui);
		miCoordinador.setEliminarMascotGui(miEliminarMascotaGui);
		
	
		
		
		miVentanaPrincipal.setCoordinador(miCoordinador);
		miRegistrarPersonasGui.setCoordinador(miCoordinador);
		miRegistrarProductosGui.setCoordinador(miCoordinador);
		miMascotaDao.setCoordinador(miCoordinador);
		miProductoDao.setCoordinador(miCoordinador);
		
		
		 miRegistrarMascotasGui.setCoordinador(miCoordinador);
		
		
		miRegistrarPersonasGui.setCoordinador(miCoordinador);
		miConsultaPersonaGui.setCoordinador(miCoordinador);
		miTablaPersonaGui.setCoordinador(miCoordinador);
		miElimminarPersonaGui.setMiCoordinador(miCoordinador);
		miConsultarProducto.setCoordinador(miCoordinador);
		miEliminarProductoGui.setCoordinador(miCoordinador);
		miConsultarMascotaGui.setMiCoordinador(miCoordinador);
		miTablaMascotasGui.setCoordinador(miCoordinador);
		miTablaProductosGui.setCoordinador(miCoordinador);
		miEliminarMascotaGui.setMiCoordinador(miCoordinador);
		
		
		
		//Se muestra la ventana principal.
		miVentanaPrincipal.setVisible(true);
		
	}
	
	
	
	
}

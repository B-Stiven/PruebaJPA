package controlador;



import java.util.ArrayList;

import javax.swing.JOptionPane;

import controlador.*;

import com.brayan.dao.*;
import com.brayan.entidades.*;

import vista.gui.*;

public class Coordinador {
	VentanaPrincipal miVentanaPrincipal;
	RegistrarPersonasGui miRegistrarPersonasGui;
	RegistrarMascotasGui miRegistrarMascotasGui;
	RegistrarProductosGui miRegistrarProductosGui;
	ConsultarPersonaGui miConsultarPersonaGui;
	PersonaDao miPersonaDao;
	MascotaDao miMascotaDao;
	
	TablaPersonasGui miTablaPersonasGui;
	EliminarPersonaGui miEliminarPersonasGui;
	ConsultarProductoGui miConsultarProductoGui;
	EliminarProductoGui miEliminarProductoGui;
	ConsultarMascotaGui miConsultarMascotaGui;
	TablaMascotasGui miTablaMascotasGui;
	TablaProductosGui miTablaProductosGui;
	EliminarMascotaGui miEliminarMascotaGui;
	
	ProductoDao miProductoDao = new ProductoDao();
	private CompraGui miVentanaCompra;
	private TablaProductosPersonasGui miTablaProductosPersonas;

	//cordinador con ventanas

	public void setVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;
		
	}

	public void setMiVentanaCompra(CompraGui miVentanaCompra) {
		this.miVentanaCompra = miVentanaCompra;
	}



	public void setRegistrarPersonasGui(RegistrarPersonasGui miRegistrarPersonasGui) {
		this.miRegistrarPersonasGui = miRegistrarPersonasGui;
		
	}
	

	public void setRegistrarMascotasGui(RegistrarMascotasGui miRegistrarMascotasGui) {
		this.miRegistrarMascotasGui=miRegistrarMascotasGui;
	}

	public void setRegistrarProductosGui(RegistrarProductosGui miRegistrarProductosGui) {
		this.miRegistrarProductosGui=miRegistrarProductosGui;
	}
	
	
	public void setEliminarMascotGui(EliminarMascotaGui miEliminarMascotaGui) {
		this.miEliminarMascotaGui=miEliminarMascotaGui;
		
	}
	
	public void setConsultarPersonaGui(ConsultarPersonaGui miConsultarPersonaGui) {
		this.miConsultarPersonaGui=miConsultarPersonaGui;
	}
	
	public void setConsultarmascota(ConsultarMascotaGui miConsultarMascotaGui) {
		
		this.miConsultarMascotaGui=miConsultarMascotaGui;
	}
	
	public void setEliminarPersonaGui(EliminarPersonaGui miElimminarPersonaGui) {
		this.miEliminarPersonasGui=miElimminarPersonaGui;
		
	}
	

	public void setPersonaDao(PersonaDao miPersonaDao) {
		this.miPersonaDao=miPersonaDao;
	}

	public void setMascotaDao(MascotaDao miMascotaDao) {
		this.miMascotaDao=miMascotaDao;
	}


	public void setTablaPersonasGui(TablaPersonasGui miTablaPersonaGui) {
		this.miTablaPersonasGui=miTablaPersonaGui;
		
	}


	public void setConsultarProductoGui(ConsultarProductoGui miConsultarProducto) {
		this.miConsultarProductoGui=miConsultarProducto;
		
	}


	public void setEliminarProductoGui(EliminarProductoGui miEliminarProductoGui) {
		this.miEliminarProductoGui=miEliminarProductoGui;
		
	}


	public void setMiTablaMascotasGui(TablaMascotasGui miTablaMascotasGui) {
		this.miTablaMascotasGui=miTablaMascotasGui;
		
	}


	public void setTablaProductosGui(TablaProductosGui miTablaProductosGui) {
		this.miTablaProductosGui=miTablaProductosGui;
		
	}


	
	
	//se muestran las ventanas
	
	public void mostarVentanaRegistroPersona() {
		miRegistrarPersonasGui.setVisible(true);
		
	}
	public void mostrarVentanaRegistroMascotas() {
		miRegistrarMascotasGui.setVisible(true);
		
	}
	
	public void mostrarVentanaConsultarPersonas() {
		miConsultarPersonaGui.setVisible(true);
	}
	

	public void mostrarVentanaListarPersona() {
		miTablaPersonasGui.setVisible(true);
		
	}
	
	public void mostrarVentanaEliminarPersonaGui() {
		miEliminarPersonasGui.setVisible(true);
		
	}
	

	public void setConsultarProductoGui() {
		miConsultarProductoGui.setVisible(true);
		
	}
	

	public void mostrarVentanaEliminarProducto() {
		miEliminarProductoGui.setVisible(true);
		
	}


	public void mostrarVentanaConsultaMascota() {
		miConsultarMascotaGui.setVisible(true);
		
	}


	public void mostrarTablaProductos() {
		miTablaProductosGui.setVisible(true);
		
	}


	public void mostraTablaMascotas() {
		miTablaMascotasGui.setVisible(true);
		
	}


	public void mostrarVentanaEliminarMascota() {
		miEliminarMascotaGui.setVisible(true);
		
	}



	
	
	
	
	
	
	//operaciones 
	

	public Long registrarNacimiento(Persona miPersona) {
		// TODO Auto-generated method stub
		return null;
	}


	public String registrarPersona(Persona miPersona) {
		return miPersonaDao.registrarPersona(miPersona);
	}


	public String registrarproductos(Producto miproducto) {
		
		try {
			 
			 String h=miProductoDao.registrarProducto(miproducto);
			
			return h;
		} catch (Exception e) {
			System.out.println(e);
			return null;
			//return miProductoDao.registrarProducto(miproducto);
		}
	
		
	}


	public ArrayList<Producto> ListarProductos() {
		try {

			return (ArrayList<Producto>) miProductoDao.consultarListaProsucto();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"Ocurrio un error");
			return null;
		}
	}


	public Producto ConsultarProductoGui(long idproduc) {
		
		return miProductoDao.consultarProducto(idproduc);
	}


	public String actualizarProducto(Producto miproducto) {
		
		return miProductoDao.actualizarMascota(miproducto);
	}


	public String EliminarProducto(Producto productovo) {
		// TODO Auto-generated method stub
		return miProductoDao.eliminarproducto(productovo);
	}


	public ArrayList<Persona> ListarPersonaRegistradas() {
		// TODO Auto-generated method stub
		return (ArrayList<Persona>) miPersonaDao.consultarListaPersonas();
	}


	public Persona setConsultarPersona(Long idDocumento) {
		
		return miPersonaDao.consultarPersona(idDocumento);
	}


	public String actualizarPersona(Persona miPersonaVo) {
		// TODO Auto-generated method stub
		return miPersonaDao.actualizarpersona(miPersonaVo);
	}


	public String EliminarPersona(Persona persona) {
		// TODO Auto-generated method stub
		return miPersonaDao.eliminarpersona(persona);
	}


	public ArrayList<Mascota> ListaMascotasregistradas() {
		
		return (ArrayList<Mascota>) miMascotaDao.ConsultarListaMascotas();
	}


	public void setProductoDao(ProductoDao miProductoDao) {
		this.miProductoDao=miProductoDao;
	}


	
	public String registrarmascotas(Mascota miMascota) {
		return miMascotaDao.registrarMascota(miMascota);
		
	}


	public Mascota Buscarmascotas(long id_mascota) {
		
		return miMascotaDao.consultarMascota(id_mascota);
	}


	
	public String EliminarMascota(Mascota miMascota) {
		
		return miMascotaDao.eliminarMascota(miMascota);
	}


	public void mostrarCompra() {
		miVentanaCompra.setVisible(true);
		
	}

	public String registrarCompra(PersonasProductos miPerPro) {
		
		return miProductoDao.registarcompra(miPerPro);
	}

	public ArrayList<PersonasProductos> ListarProductosPersonas() {
		
		return (ArrayList<PersonasProductos>) miProductoDao.ConsultarListaMascotas();
	}

	public void setmiTablaProductosPersonas(TablaProductosPersonasGui miTablaProductosPersonas) {
		this.miTablaProductosPersonas=miTablaProductosPersonas;
		
	}

	public void mostrarListarCompra() {
		miTablaProductosPersonas.setVisible(true);
		
	}


	


	


	


	
	




	




	








	
	
	
}

package clases;

import java.util.List;

import javax.swing.JOptionPane;

import com.camilo.dao.ProductoDao;
import com.camilo.entidades.Mascota;
import com.camilo.entidades.Persona;
import com.camilo.entidades.PersonasProductos;
import com.camilo.entidades.Producto;

public class GestionarProductos {
	ProductoDao miproductoDao= new ProductoDao();
	
	
	public GestionarProductos() {
		String menu="Menu de opciones de gestionar producto \n\n";
		menu+="1. registar  producto \n ";
		menu+="2. consultar producto \n ";
		menu+="3. consultar lista de productos \n ";
		menu+="4. compar productos \n ";
		menu+="5. actualizar productos  \n ";
		menu+="6. elimianar  producto \n ";
		menu+="7. salir  \n ";
		
		int opc=0;
		
		while (opc!=7) {
			opc=Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opc) {
			case 1:registar(); break;
			case 2:consultar();break;
			case 3:cosultarlista(); break;
			case 4:comparproducto(); break;
			case 5:actualizar(); break;
			case 6:eliminar(); break;
			case 7:miproductoDao.close(); break;


			}
		}
	}


	private void eliminar() {
		Long idproducto = Long.parseLong(JOptionPane.showInputDialog("Ingresa el id del producto a Eliminar"));
		Producto miproducto = miproductoDao.consultarProducto(idproducto);
		
		if (miproducto!= null) {
			
			System.out.println(miproducto + "\n");
			System.out.println(miproductoDao.eliminarproducto(miproducto));
			
		} else {
			
			JOptionPane.showMessageDialog(null, "\nLa Mascota con el ID " + idproducto + "No se encuentra en el sistema \n");
		}
		
	}


	private void actualizar() {
		long idproducto = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id del producto que desea actualizar"));
		Producto miproducto= miproductoDao.consultarProducto(idproducto);
		if (miproducto!= null) {
			
		
			miproducto.setNombreProducto(JOptionPane.showInputDialog("ingrese le nombre del producto"));
			miproducto.setPrecioProducto(Double.parseDouble(JOptionPane.showInputDialog("ingrese le precio del producto")));
		
			System.out.println(miproductoDao.actualizarMascota(miproducto) + "\n"  );	
		} else {
			
			JOptionPane.showMessageDialog(null, "\nLa Mascota con el ID " + idproducto + "No se encuentra en el sistema \n");
		}
		
	}


	private void comparproducto() {
		PersonasProductos producto;
		
		Long personaid;
		Long productoid;
		
		int opc=0;
		
		do {
			producto=new PersonasProductos();
			personaid=Long.parseLong(JOptionPane.showInputDialog("ingrese el documento de la persona"));
			productoid=Long.parseLong(JOptionPane.showInputDialog("ingrese el codigo del producto"));
			
			producto.setPersonaId(personaid);
			producto.setProductoId(productoid);
			
			System.out.println(miproductoDao.registarcompra(producto));
			System.out.println();
			opc=Integer.parseInt(JOptionPane.showInputDialog("ingrese 1 si desea agregar otro producto"));
		} while (opc==1);
		
	}


	private void cosultarlista() {
		System.out.println("lista productos");
		List<Producto> listaproducto=miproductoDao.consultarListaProsucto();
		
		for(Producto producto : listaproducto) {
			System.out.println(producto);
		}
		
	}


	private void consultar() {

		long idproducto = Long.parseLong(JOptionPane.showInputDialog("Ingrese el id del producto a buscar"));
		
		Producto miProducto = miproductoDao.consultarProducto(idproducto);
		
		if (miProducto!= null) {

			System.out.println(miProducto + "\n\n");
		} else {
			
			System.out.println("\n\n           No se Encontro en producto \n\n");
		}
		
	}


	private void registar() {
		Producto miProducto = new Producto();
		miProducto.setIdProducto(null);	
		miProducto.setNombreProducto(JOptionPane.showInputDialog("Ingrese el nombre del producto"));
		miProducto.setPrecioProducto(Double.parseDouble(JOptionPane.showInputDialog("ingrese el precio del producto")));
		
		System.out.println(miproductoDao.registrarProducto(miProducto) + "\n\n");

		
	}


}

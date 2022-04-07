package clases;

import java.util.List; 

import javax.swing.JOptionPane;

import com.camilo.dao.MascotaDao;
import com.camilo.entidades.Mascota;
import com.camilo.entidades.Persona;


public class GestionarMascotas {
	
	MascotaDao miMascotaDao = new MascotaDao();
	
	public void GestionarMascotas() {
		
		
		
	}
	
	public void iniciar() {
		String menu = "////////////// MENU //////////////\n";
		menu += "1. Registrar Mascota\n";
		menu += "2. Consultar Mascota\n";
		menu += "3. Consultar Lista de Mascota\n";
		menu += "4. Actualizar Mascota\n";
		menu += "5. Eliminar Mascota\n";
		menu += "6. Salir\n\n";
		
		int opcion = 0;
	
		while (opcion!=6) {
			
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (opcion) {
			
			case 1: registrarMascota(); break;
			case 2: consultarMascota(); break;
			case 3: ConsultarListaMascotas(); break;
			case 4: actualizarMascota(); break;
			case 5: eliminarMascota();
			case 6: miMascotaDao.close(); break;
			
			}
			
		}
	}


	private void registrarMascota() {
		
		Mascota miMascota = new Mascota();
		//miMascota.setIdMascota(null);
		miMascota.setNombre(JOptionPane.showInputDialog("Ingerse el Nombre de la mascota"));
		miMascota.setRaza(JOptionPane.showInputDialog("Ingresa la Raza de la mascota"));
		miMascota.setSexo(JOptionPane.showInputDialog("Ingrese el Sexo de la Mascota"));
		miMascota.setColorMascota(JOptionPane.showInputDialog("Ingresa el color de la Mascota"));
		
		Long idduenio=Long.parseLong(JOptionPane.showInputDialog("ingrese el documento del dueño"));
		Persona duenio=new Persona();
		duenio.setIdPersona(idduenio);
		miMascota.setDuenio(duenio);
		System.out.println(miMascotaDao.registrarMascota(miMascota) + "\n\n");
	}
	
	
	private void consultarMascota() {
		
		long idMascota = Long.parseLong(JOptionPane.showInputDialog("Ingrese el ID de la Mascota que Desea Buscar"));
		
		Mascota miMascota = miMascotaDao.consultarMascota(idMascota);
		
		if (miMascota!= null) {

			System.out.println(miMascota + "\n\n");
		} else {
			
			System.out.println("\n\n           No se Encontro La Mascota \n\n");
		}
	}
	
	
	
	private void ConsultarListaMascotas() {
		
		System.out.println("           Lista de Mascotas \n");
		List<Mascota> listaMascotas = miMascotaDao.ConsultarListaMascotas();
		
		if (listaMascotas.size()<0) {
			
			
			System.out.println("No Hay Mascotas Registradas En El sistema");
		} else {
			
			for (Mascota mascota : listaMascotas) {
				
				System.out.print(mascota + "\ns");	
			}	
			
		}
		
		
	}
	
	
	
	private void ConsultarListaMascotasPorSexo() {
		
		System.out.println("           Lista de Mascotas Por Sexo\n");
		String sexo = JOptionPane.showInputDialog("Ingresa el Sexo de la Mascota a Bsucar");
		List<Mascota> listaMascotas = miMascotaDao.ConsultarListaMascotasPorSexo(sexo);
		
		if (listaMascotas.size()<0) {
			
			System.out.println("No Hay Mascotas Registradas En El sistema Con Sexo: " + sexo);
			
		} else {
			
			for (Mascota mascota : listaMascotas) {
				System.out.println(mascota + "\n");	
			}	
		}
		
		
	}
	
	
	
	private void actualizarMascota() {
		
		long idMascota = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id de la Mascota a Actulizar"));
		Mascota miMascota = miMascotaDao.consultarMascota(idMascota);
		if (miMascota!= null) {
			
			System.out.println("          Mascota con ID " + idMascota + "\n" + miMascota + "\n");
			miMascota.setNombre(JOptionPane.showInputDialog("Ingerse el Nombre de la mascota"));
			miMascota.setRaza(JOptionPane.showInputDialog("Ingresa la Raza de la mascota"));
			miMascota.setSexo(JOptionPane.showInputDialog("Ingrese el Sexo de la Mascota"));
			miMascota.setColorMascota(JOptionPane.showInputDialog("Ingresa el color de la Mascota"));
			System.out.println(miMascotaDao.actualizarMascota(miMascota) + "\n"  );	
		} else {
			
			JOptionPane.showMessageDialog(null, "\nLa Mascota con el ID " + idMascota + "No se encuentra en el sistema \n");
		}
	}
	
	
	
	private void eliminarMascota() {
		
		long idMascota = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el id de la Mascota a Eliminar"));
		Mascota miMascota = miMascotaDao.consultarMascota(idMascota);
		
		if (miMascota!= null) {
			
			System.out.println(miMascota + "\n");
			System.out.println(miMascotaDao.eliminarMascota(miMascota));
			
		} else {
			
			JOptionPane.showMessageDialog(null, "\nLa Mascota con el ID " + idMascota + "No se encuentra en el sistema \n");
		}
	}
	
}
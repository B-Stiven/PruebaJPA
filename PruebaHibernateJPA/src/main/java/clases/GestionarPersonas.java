package clases;

import java.time.LocalDate;
import java.util.List;

import javax.swing.JOptionPane;

import com.camilo.dao.MascotaDao;
import com.camilo.dao.PersonaDao;
import com.camilo.entidades.Mascota;
import com.camilo.entidades.Nacimiento;
import com.camilo.entidades.Persona;

public class GestionarPersonas {
	PersonaDao mipersonaDao = new PersonaDao();
	
	public void GestionarPersonas() {
		
		
}

	private void Consultarlistapersona() {
		System.out.println("lista personas");
		List<Persona> listapersonas=mipersonaDao.consultarListaPersonas();
		
		for(Persona persona : listapersonas) {
			System.out.println(persona);
		}
		
	}

	private void eliminarpersona() {
		Long idpersona = Long.parseLong(JOptionPane.showInputDialog("Ingresa el id de la persona a Eliminar"));
		Persona mipersona = mipersonaDao.consultarPersona(idpersona);
		
		if (mipersona!= null) {
			
			System.out.println(mipersona + "\n");
			System.out.println(mipersonaDao.eliminarpersona(mipersona));
			
		} else {
			
			JOptionPane.showMessageDialog(null, "\nLa Mascota con el ID " + idpersona + "No se encuentra en el sistema \n");
		}
		
	}

	private void actualizarpersona() {
		Long idpersona = Long.parseLong(JOptionPane.showInputDialog("Ingresa el id de la persona para cambiar su nombre"));
		Persona mipersona = mipersonaDao.consultarPersona(idpersona);
		if (mipersona!= null) {
			
			System.out.println("          persona con ID " + idpersona + "\n" + mipersona + "\n");
			System.out.println();
			mipersona.setNombre(JOptionPane.showInputDialog("ingrese el nombre de la persona"));
	
			System.out.println(mipersonaDao.actualizarpersona(mipersona) + "\n"  );	
		} else {
			
			JOptionPane.showMessageDialog(null, "\nLa Mascota con el ID " + idpersona + "No se encuentra en el sistema \n");
		}
		
	}

	
	private void consultarpersona() {
		Long idpersona=Long.parseLong(JOptionPane.showInputDialog("ingrese el ide de la persona"));
		
		Persona mipersona =new Persona();
		
		if(mipersona!=null) {
			System.out.println(mipersona);
			System.out.println();
		}else {
			System.out.println();
			System.out.println("no se encontro la persona");
		}
		
		System.out.println();
		
	}

	private void registrarpersona() {
		Persona miPersona=new Persona();
		
		miPersona.setIdPersona(Long.parseLong(JOptionPane.showInputDialog("ingrese el documento de la persona")));
		miPersona.setNombre(JOptionPane.showInputDialog("ingrese el nombre de la persona"));
		miPersona.setTelefono(JOptionPane.showInputDialog("ingrese el telefono de la persona "));
		miPersona.setProfesion(JOptionPane.showInputDialog("ingrese la profecion de la persona"));
		miPersona.setTipo(Integer.parseInt(JOptionPane.showInputDialog("ingrese el tipo")));
		
		miPersona.setNacimiento(obtenerDatosNacimiento());
		
		int opc=0;
		
		do {
			
			opc=Integer.parseInt(JOptionPane.showInputDialog("dese aregistrar una mascotas si n1 no n2"));
			
			if (opc==1) {
				Mascota mimascota=new Mascota();
				//mimascota.setIdMascota(null);
				mimascota.setNombre(JOptionPane.showInputDialog("ingrese el nombre de la mascota"));
				mimascota.setRaza(JOptionPane.showInputDialog("ingrese la raza de la mascota"));
				mimascota.setColorMascota(JOptionPane.showInputDialog("ingrese el color de la mascota"));
				mimascota.setSexo(JOptionPane.showInputDialog("ingrese el sexo de la mascota"));
				mimascota.setDuenio(miPersona);
				
				miPersona.getListaMascotas().add(mimascota);
			}
			
		} while (opc!=2);
		
		System.out.println(mipersonaDao.registrarPersona(miPersona));
		System.out.println();
		
		
	}

	private Nacimiento obtenerDatosNacimiento() {
		int dia=Integer.parseInt(JOptionPane.showInputDialog("ingrese el dia de nacimiento"));
		int mes=Integer.parseInt(JOptionPane.showInputDialog("ingrese el mas de nacimiento"));
		int anio=Integer.parseInt(JOptionPane.showInputDialog("ingree le año de nacimiento"));
		
		 Nacimiento datosNacimiento=new Nacimiento();
		 
		 datosNacimiento.setIdNacimiento(null);
		 datosNacimiento.setFechaNacimiento(LocalDate.of(anio, mes, dia));
		 datosNacimiento.setCiudadNacimiento(JOptionPane.showInputDialog("ingrese la ciudad de nacimiento"));
		 datosNacimiento.setDepartamentoNacimietno(JOptionPane.showInputDialog("ingrese el departamento de nacimiento"));
		 datosNacimiento.setPaisNacimiento(JOptionPane.showInputDialog("ingrese el pais de nacimiento"));
		 
		return datosNacimiento;
	}

	public void iniciar() {
		String menu = "////////////// MENU //////////////\n";
		menu += "1. Registrar persona\n";
		menu += "2. Consultar persona\n";
		menu += "3. Consultar Lista de personas\n";
		menu += "4. Actualizar persona\n";
		menu += "5. Eliminar persona\n";
		menu += "6. Salir\n\n";
		
		int opcion = 0;
	
		while (opcion!=7) {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcion) {
		
			case 1: registrarpersona(); break;
			case 2: consultarpersona(); break;
			case 3: Consultarlistapersona(); break;
			case 4: actualizarpersona(); break;
			case 5: eliminarpersona(); break;
			case 6: mipersonaDao.close(); break;
			}
			
		
		}
		
	}
	
}

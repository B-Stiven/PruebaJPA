package vista.gui;

import java.awt.BorderLayout;
  



import java.awt.EventQueue;
import java.awt.Panel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.camilo.entidades.Persona;
import com.camilo.entidades.Nacimiento;

import controlador.Coordinador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSpinner;
import javax.swing.JTree;
import javax.swing.JEditorPane;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class TablaPersonasGui extends JFrame implements ActionListener{

	private JPanel miPanel;
	private final JPanel contentPane = new JPanel();
	private DefaultTableModel model;
	private DefaultTableModel modelo;
	private Coordinador miCoordinador;
	private JScrollPane scroll;
	private JTable tblPersonas;
	private JButton btnListarPersonas;
	private ArrayList<Persona> ListaPersonas;
	

	
	public TablaPersonasGui () {
		
		setTitle("Ver Personas");
		setBounds(0,0,900,500);
		setLocationRelativeTo(null);
		miPanel = new JPanel();
		miPanel.setBackground(new Color(153, 255, 204));
		miPanel.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(miPanel);
		miPanel.setLayout(null);
		
		
		tblPersonas = new JTable();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(0, 149, 884, 312);
		miPanel.add(scrollPane);
		
		model = new DefaultTableModel();
		tblPersonas.setModel(model);
		model.addColumn("Documento");
		model.addColumn("Nombre");
		model.addColumn("Profesion");
		model.addColumn("Telefono");
		model.addColumn("Tipo");
		model.addColumn("Ciudad Nac");
		model.addColumn("Dpto Nac");
		model.addColumn("Fecha Nac");
		model.addColumn("Pais Nac");
		tblPersonas.setModel(model);
		
		scrollPane.setViewportView(tblPersonas);
		
		
		
		String[] titulos = {"Documento","Nombre","Profesion", "Telefono", "Tipo", "Ciudad Nac",
				"Dpto Nac", "Fecha Nac", "Pais Nac"};

		modelo = new DefaultTableModel(null, titulos);
		tblPersonas.setModel(modelo);
		
		btnListarPersonas = new JButton("Ver Personas Registradas");
		btnListarPersonas.setBounds(600, 48, 181, 44);
		btnListarPersonas.addActionListener(this);
		miPanel.add(btnListarPersonas);
		
		JLabel lblNewLabel = new JLabel("Personas Registradas ");
		lblNewLabel.setFont(new Font("Segoe UI Emoji", Font.PLAIN, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 48, 385, 42);
		miPanel.add(lblNewLabel);


		
	}

	
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
		
	}


	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnListarPersonas) {
			
			mostrarDatos();
		}
	}
	
public void mostrarDatos () {
		
		while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        }
		
		try {
			
			ListaPersonas = miCoordinador.ListarPersonaRegistradas();
		
			

				for (int p=0,n=0; n<ListaPersonas.size();p++)  {
					
					Object[] registro ={ListaPersonas.get(p).getIdPersona(), ListaPersonas.get(p).getNombre(), ListaPersonas.get(p).getProfesion()
							,ListaPersonas.get(p).getTelefono(), ListaPersonas.get(p).getTipo(), ListaPersonas.get(p).getNacimiento().getCiudadNacimiento(),ListaPersonas.get(p).getNacimiento().getDepartamentoNacimietno(),
							ListaPersonas.get(p).getNacimiento().getFechaNacimiento(),ListaPersonas.get(p).getNacimiento().getPaisNacimiento()};
					
					
					modelo.addRow(registro);
				}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

 
	
}
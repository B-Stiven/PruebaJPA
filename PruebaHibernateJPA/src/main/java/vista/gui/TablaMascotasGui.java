package vista.gui;

import java.awt.BorderLayout;


 
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

import com.brayan.entidades.Mascota;

import controlador.Coordinador;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.*;
import java.util.ArrayList;


public class TablaMascotasGui extends JFrame implements ActionListener{
	
	private JPanel contentPane = new JPanel();
	private JPanel miPanel;
	private JTable tblMascotas;
	private DefaultTableModel model;
	private DefaultTableModel modelo;
	private JScrollPane scroll;
	private JButton btnListarMascotas;
	private Coordinador miCoordinador;
	private ArrayList<Mascota> listaMascotas;	
	private ArrayList listaDocumentos;
	
	
	public TablaMascotasGui() {
		
		setBounds(0,0,584,348);
		setLocationRelativeTo(null);
		
		miPanel = new JPanel();
		miPanel.setBackground(new Color(0, 153, 204));
		miPanel.setBorder(new EmptyBorder(5,5,5,5));
		miPanel.setLayout(null);
		setContentPane(miPanel);
		
		tblMascotas = new JTable();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(0, 105, 568, 204);
		miPanel.add(scrollPane);
		
		model = new DefaultTableModel();
		model.addColumn("ID Mascota");
		model.addColumn("Color");
		model.addColumn("Nombre");
		model.addColumn("Color");
		model.addColumn("Sexo");
		tblMascotas.setModel(model);
		
		scrollPane.setViewportView(tblMascotas);
		
		String[] titulos = {"ID Mascota", "Color", "Nombre" , "Color", "Sexo"};
		
		modelo = new DefaultTableModel(null, titulos);
		tblMascotas.setModel(modelo);
		
		JLabel lblNewLabel = new JLabel("Listar Mascotas");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 21));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(28, 28, 220, 38);
		miPanel.add(lblNewLabel);
		
		btnListarMascotas = new JButton("Ver Macotas Registradas");
		btnListarMascotas.setBounds(335, 32, 158, 38);
		btnListarMascotas.addActionListener(this);
		miPanel.add(btnListarMascotas);
	}
	
	public void setCoordinador(Coordinador miCoordinador) {

		this.miCoordinador = miCoordinador;
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnListarMascotas){
			
			mostrarMascotas();
			
		}
		
	}
	
	public void mostrarMascotas() {
		
		limpiar();
		
		try {

			listaMascotas = miCoordinador.ListaMascotasregistradas();
				
			for (int d = 0; d<listaMascotas.size() ; d++) {
				
				Object[] registrosMasocatas = {listaMascotas.get(d).getIdMascota(),listaMascotas.get(d).getColorMascota() , listaMascotas.get(d).getNombre()
						, listaMascotas.get(d).getRaza(), listaMascotas.get(d).getSexo()};
				
				modelo.addRow(registrosMasocatas);
			}
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(btnListarMascotas, "Ocurrio un error al listar mascotas");
		}	
	}


	public void limpiar() {
		
		while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        }
	}
	
	
}
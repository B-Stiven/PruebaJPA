package vista.gui;

import java.awt.BorderLayout;



import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.brayan.entidades.PersonasProductos;
import com.brayan.entidades.Producto;

import controlador.Coordinador;


import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;

public class TablaProductosPersonasGui extends JFrame implements ActionListener{
	
	private Coordinador miCoordinador;
	private JPanel contentPane = new JPanel();
	private JPanel miPanel;
	private DefaultTableModel model;
	private DefaultTableModel modelo;
	private JScrollPane scroll;
	private JTable tblProductos;
	private JButton btnListaProductos;
	private ArrayList<PersonasProductos> listaProductosPersonas = new ArrayList<PersonasProductos>();

	
	
	public TablaProductosPersonasGui(TablaProductosPersonasGui miTablaProductosPersonas, boolean b) {
		
		setBounds(0,0,454,348);
		setLocationRelativeTo(null);
		
		miPanel = new JPanel();
		miPanel.setBackground(new Color(51, 153, 102));
		miPanel.setBorder(new EmptyBorder(5,5,5,5));
		miPanel.setLayout(null);
		setContentPane(miPanel);
		
		tblProductos = new JTable();
		
		scroll = new JScrollPane();
		scroll.setBounds(0, 105, 438, 204);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		miPanel.add(scroll);
		
		
		
		model = new DefaultTableModel();
		model.addColumn("Codigo persona");
		model.addColumn("Codigo producto");
		tblProductos.setModel(model);
		
		scroll.setViewportView(tblProductos);
		
		String[] titulos = {"Codigo persona","Codigo producto"};
		
		modelo= new DefaultTableModel(null, titulos);
		tblProductos.setModel(modelo);
		
		
		JLabel lblNewLabel = new JLabel("Listar Productos");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(21, 29, 199, 35);
		miPanel.add(lblNewLabel);
		
		btnListaProductos = new JButton("Ver Productos");
		btnListaProductos.setBounds(298, 29, 105, 35);
		miPanel.add(btnListaProductos);
		btnListaProductos.addActionListener(this);
		
		
		
	}
	
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnListaProductos) {
			
			mostrarProductos();	
		}
		
	}
	
	private void mostrarProductos() {
		
		limpiar();

		listaProductosPersonas = miCoordinador.ListarProductosPersonas() ;
		
		for (int n = 0;  n<listaProductosPersonas.size(); n++) {
			
			Object[] registros = {listaProductosPersonas.get(n).getPersonaId(),listaProductosPersonas.get(n).getProductoId() };
			
			modelo.addRow(registros);
			
			
		}
	}
	
	public void limpiar () {
		
		while(modelo.getRowCount() > 0) {
			modelo.removeRow(0);
		}
	}


	


	
}

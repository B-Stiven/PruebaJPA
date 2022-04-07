package vista.gui;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Coordinador;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.FlowLayout;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class VentanaPrincipal extends JFrame implements ActionListener{

	private JPanel contentPane;
	private AbstractButton itemRegistrarPersonas;
	private JMenuItem itemConsultarPersonas;
	private JMenuItem itemListarPersonas;
	private JMenuItem itemEliminarPersonas;
	private JMenuItem itemRegistrarMascotas;
	private JMenuItem itemConsultarMascotas;
	private JMenuItem itemListarMascotas;
	private JMenuItem itemEliminarMascotas;
	private JMenuItem itemEliminarProductos;
	private JMenuItem itemListarProductos;
	private JMenuItem itemConsultaProductos;
	private JMenuItem itemRegistroProductos;
	private Coordinador micoordinador;

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		iniciarComponentes();	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,500);
		setResizable(false);
		setTitle("Clinica Veterinaria");
		setLocationRelativeTo(null);
	}

	private void iniciarComponentes() {
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuPersonas = new JMenu("Gestionar Personas");
		menuBar.add(menuPersonas);
		
		itemRegistrarPersonas = new JMenuItem("Registrar");
		itemRegistrarPersonas.addActionListener(this);
		menuPersonas.add(itemRegistrarPersonas);
		
		itemConsultarPersonas = new JMenuItem("Consultar");
		itemConsultarPersonas.addActionListener(this);
		menuPersonas.add(itemConsultarPersonas);
		
		itemListarPersonas = new JMenuItem("Listar");
		itemListarPersonas.addActionListener(this);
		menuPersonas.add(itemListarPersonas);
		
		itemEliminarPersonas = new JMenuItem("Eliminar");
		itemEliminarPersonas.addActionListener(this);
		menuPersonas.add(itemEliminarPersonas);
		
		JMenu MenuMascotas = new JMenu("Gestionar Mascotas");
		menuBar.add(MenuMascotas);
		
		itemRegistrarMascotas = new JMenuItem("Registrar");
		itemRegistrarMascotas.addActionListener(this);
		MenuMascotas.add(itemRegistrarMascotas);
		
		itemConsultarMascotas = new JMenuItem("Consultar");
		itemConsultarMascotas.addActionListener(this);
		MenuMascotas.add(itemConsultarMascotas);
		
		itemListarMascotas = new JMenuItem("Listar");
		itemListarMascotas.addActionListener(this);
		MenuMascotas.add(itemListarMascotas);
		
		itemEliminarMascotas = new JMenuItem("Eliminar");
		itemEliminarMascotas.addActionListener(this);
		MenuMascotas.add(itemEliminarMascotas);
		
		JMenu menuProductos = new JMenu("Gestionar Productos");
		menuBar.add(menuProductos);
		
		itemRegistroProductos = new JMenuItem("Registrar");
		itemRegistroProductos.addActionListener(this);
		menuProductos.add(itemRegistroProductos);
		
		itemConsultaProductos = new JMenuItem("Consultar");
		itemConsultaProductos.addActionListener(this);
		menuProductos.add(itemConsultaProductos);
		
		itemListarProductos = new JMenuItem("Listar");
		itemListarProductos.addActionListener(this);
		menuProductos.add(itemListarProductos);
		
		itemEliminarProductos = new JMenuItem("Eliminar");
		itemEliminarProductos.addActionListener(this);
		
		menuProductos.add(itemEliminarProductos);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTitulo = new JLabel("GESTION CLINICA VETERINARIA");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		contentPane.add(lblTitulo, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.SOUTH);
		
		JLabel lblImagen = new JLabel();
		lblImagen.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/images/veterinario.jpg")));
		panel.add(lblImagen, BorderLayout.CENTER);
	}



	public void setCoordinador(Coordinador miCoordinador) {
		this.micoordinador=miCoordinador;
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==itemRegistrarPersonas) {
			micoordinador.mostarVentanaRegistroPersona();
		}
		if (e.getSource()==itemRegistrarMascotas) {
			micoordinador.mostrarVentanaRegistroMascotas();
		}
		if (e.getSource()==itemRegistroProductos) {
			RegistrarProductosGui RegistrarProductos=new RegistrarProductosGui(this, true);
			RegistrarProductos.setVisible(true);
		}if (e.getSource()==itemConsultarPersonas) {
			micoordinador.mostrarVentanaConsultarPersonas();
		} if (e.getSource() == itemListarPersonas) {		
			micoordinador.mostrarVentanaListarPersona();
		}if(e.getSource()==itemEliminarPersonas) {
			micoordinador.mostrarVentanaEliminarPersonaGui();
		}if(e.getSource()==itemConsultaProductos) {
			micoordinador.setConsultarProductoGui();
		}if(e.getSource()==itemEliminarProductos) {
			micoordinador.mostrarVentanaEliminarProducto();
		}if(e.getSource()==itemConsultarMascotas) {
			micoordinador.mostrarVentanaConsultaMascota();
		}if (e.getSource() == itemListarProductos) {
			micoordinador.mostrarTablaProductos();
		}if(e.getSource() == itemListarMascotas){
			micoordinador.mostraTablaMascotas();
		}if(e.getSource() == itemEliminarMascotas) {
			micoordinador.mostrarVentanaEliminarMascota();
		}
		
		
	}

	
}

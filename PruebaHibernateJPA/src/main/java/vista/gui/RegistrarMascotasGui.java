package vista.gui;

import java.awt.BorderLayout;



import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import com.camilo.entidades.Mascota;
import com.camilo.entidades.Persona;

import controlador.Coordinador;


import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class RegistrarMascotasGui extends JDialog implements ActionListener{

	private final JPanel contentPanel = new JPanel();
	private JTextField txtIdDueno;
	private JTextField txtNombre;
	private JTextField txtTelefono;
	private JButton btnCancelar;
	private JButton btnRegistrar;
	private Coordinador miCoordinador;
	private JComboBox comboBox_1;
	private JComboBox comboBox;
	private JTextField txtraza;


	/**
	 * Create the dialog.
	 * @param b 
	 * @param ventanaPrincipal 
	 * @param documento 
	 */
	public RegistrarMascotasGui(VentanaPrincipal ventanaPrincipal, boolean modal, String documento) {
		super(ventanaPrincipal,modal);
		setSize( 408, 288);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		setTitle("Gestion de Mascotas");
		iniciarComponentes(documento);
		
		
	}


	private void iniciarComponentes(String documento) {
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("GESTIONAR MASCOTAS");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tw Cen MT", Font.BOLD, 20));
		lblTitulo.setBounds(10, 10, 372, 28);
		contentPanel.add(lblTitulo);
				
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(10, 49, 370, 192);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblDueno = new JLabel("Id Due\u00F1o:");
		lblDueno.setBounds(199, 17, 71, 21);
		panel.add(lblDueno);
		
		txtIdDueno = new JTextField();
		txtIdDueno.setText(documento);
		txtIdDueno.setBounds(269, 17, 86, 20);
		panel.add(txtIdDueno);
		txtIdDueno.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(24, 49, 71, 21);
		panel.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(88, 49, 86, 20);
		panel.add(txtNombre);
		
		JLabel lblRaza = new JLabel("Raza:");
		lblRaza.setBounds(214, 49, 71, 21);
		panel.add(lblRaza);
		
		txtraza = new JTextField();
		txtraza.setColumns(10);
		txtraza.setBounds(269, 49, 86, 20);
		panel.add(txtraza);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(24, 127, 331, 12);
		panel.add(separator);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(271, 150, 89, 23);
		panel.add(btnCancelar);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(172, 150, 89, 23);
		btnRegistrar.addActionListener(this);
		panel.add(btnRegistrar);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(24, 81, 71, 21);
		panel.add(lblSexo);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Macho", "Hembra"}));
		comboBox.setBounds(88, 81, 86, 22);
		panel.add(comboBox);
		
		JLabel lblColor = new JLabel("Color:");
		lblColor.setBounds(214, 82, 71, 21);
		panel.add(lblColor);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Blanco", "Negro", "Caf\u00E9", "Gris", "Manchas"}));
		comboBox_1.setBounds(269, 81, 86, 22);
		panel.add(comboBox_1);
	}


	


	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;
		
	}


	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnRegistrar){
			
			Long idDocumento=Long.parseLong(txtIdDueno.getText());
			Persona personaVo=miCoordinador.setConsultarPersona(idDocumento);
			System.out.println(personaVo.toString());
			Mascota miMascota=new  Mascota();
			
			miMascota.setNombre(txtNombre.getText());
			miMascota.setRaza(txtraza.getText()+"");
			miMascota.setSexo((String) comboBox.getSelectedItem());
			miMascota.setColorMascota((String) comboBox_1.getSelectedItem());
			miMascota.setDuenio(personaVo);
			
			String resp=miCoordinador.registrarmascotas(miMascota);
			
			if (resp.equals("ok")) {
				JOptionPane.showMessageDialog(null, "Registro Exitoso!");
			}else {
				JOptionPane.showMessageDialog(null,"No se puedo registrar la mascota","ERROR",JOptionPane.ERROR_MESSAGE );
				}
		}if(e.getSource()==btnCancelar){
			dispose();
		}
			
			
			
		
		
		
	}
}
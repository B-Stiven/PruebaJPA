package vista.gui;

import java.awt.BorderLayout;



import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.camilo.entidades.Persona;

import controlador.Coordinador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EliminarPersonaGui extends JFrame implements ActionListener{

	private JPanel contentPanel;
	private JComponent contentPane;
	private JTextField textDocumetno;
	private JButton btnConsultar;
	private JTextField textNombre;
	private JTextField textTelefono;
	private JTextField textProfecion;
	private JTextField textTipo;
	private JTextField textDia;
	private JTextField textMes;
	private JTextField textAño;
	private JTextField textCiudad;
	private JTextField textDepartamento;
	private JTextField textPais;
	private JButton btnCancelar;
	private Coordinador miCoordinador;
	private JButton btnEliminar;
	Persona persona;



	/**
	 * Create the dialog.
	 */
	
	public void setMiCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}
	
	public EliminarPersonaGui(VentanaPrincipal miVentanaPrincipal, boolean b) {
		setBounds(100, 100, 615, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Eliminar");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(259, 11, 140, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Documento");
		lblNewLabel_1.setBounds(232, 55, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		textDocumetno = new JTextField();
		textDocumetno.setBounds(312, 52, 136, 20);
		contentPane.add(textDocumetno);
		textDocumetno.setColumns(10);
		
		btnConsultar = new JButton("Buscar");
		btnConsultar.setBounds(458, 51, 89, 23);
		contentPane.add(btnConsultar);
		btnConsultar.addActionListener(this);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setBounds(39, 104, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textNombre = new JTextField();
		textNombre.setBounds(95, 101, 334, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Telefono");
		lblNewLabel_3.setBounds(39, 147, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(95, 144, 86, 20);
		contentPane.add(textTelefono);
		textTelefono.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Profecion");
		lblNewLabel_4.setBounds(195, 147, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textProfecion = new JTextField();
		textProfecion.setBounds(251, 144, 86, 20);
		contentPane.add(textProfecion);
		textProfecion.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Tipo");
		lblNewLabel_5.setBounds(353, 147, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		textTipo = new JTextField();
		textTipo.setBounds(387, 144, 86, 20);
		contentPane.add(textTipo);
		textTipo.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Fecha");
		lblNewLabel_6.setBounds(39, 199, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		textDia = new JTextField();
		textDia.setBounds(90, 196, 46, 20);
		contentPane.add(textDia);
		textDia.setColumns(10);
		
		textMes = new JTextField();
		textMes.setBounds(149, 196, 32, 20);
		contentPane.add(textMes);
		textMes.setColumns(10);
		
		textAño = new JTextField();
		textAño.setBounds(195, 196, 32, 20);
		contentPane.add(textAño);
		textAño.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Ciudad");
		lblNewLabel_7.setBounds(39, 251, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		textCiudad = new JTextField();
		textCiudad.setBounds(90, 248, 86, 20);
		contentPane.add(textCiudad);
		textCiudad.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Departamento");
		lblNewLabel_8.setBounds(191, 251, 74, 14);
		contentPane.add(lblNewLabel_8);
		
		textDepartamento = new JTextField();
		textDepartamento.setBounds(275, 248, 86, 20);
		contentPane.add(textDepartamento);
		textDepartamento.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Pais");
		lblNewLabel_9.setBounds(383, 251, 32, 14);
		contentPane.add(lblNewLabel_9);
		
		textPais = new JTextField();
		textPais.setBounds(406, 248, 86, 20);
		contentPane.add(textPais);
		textPais.setColumns(10);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(497, 299, 89, 23);
		contentPane.add(btnCancelar);
		btnCancelar.addActionListener(this);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(403, 299, 89, 23);
		contentPane.add(btnEliminar);
		btnEliminar.addActionListener(this);
		btnEliminar.setVisible(false);
	}



	
	

	public void vaciar() {
		

		textNombre.setText("");
		textProfecion.setText("");
		textTelefono.setText("");
		textTipo.setText("");
		
		textCiudad.setText("");
		textDepartamento.setText("");
		textPais.setText("");
		textDia.setText("");
		textMes.setText("");
		textAño.setText("");
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnConsultar) {
			if (textDocumetno.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Ingrese un Documento para ralizar la busqueda", null, JOptionPane.WARNING_MESSAGE);
			}else {
				Long idDocumento=Long.parseLong(textDocumetno.getText());
				persona=miCoordinador.setConsultarPersona(idDocumento);
				
				if (persona!=null) {
							
					textNombre.setText(persona.getNombre());
					textProfecion.setText(persona.getProfesion());
					textTelefono.setText(persona.getTelefono());
					textTipo.setText(persona.getTipo()+"");
					
					textCiudad.setText(persona.getNacimiento().getCiudadNacimiento());
					textDepartamento.setText(persona.getNacimiento().getDepartamentoNacimietno());
					textPais.setText(persona.getNacimiento().getPaisNacimiento());
					textDia.setText(persona.getNacimiento().getFechaNacimiento().getDayOfMonth()+"");
					textMes.setText(persona.getNacimiento().getFechaNacimiento().getMonthValue()+"");
					textAño.setText(persona.getNacimiento().getFechaNacimiento().getYear()+"");
					btnEliminar.setVisible(true);
					
				}else {
					JOptionPane.showMessageDialog(null,"No se encuentra la persona, verifique el documento","ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
				}
			}					
		}else if(e.getSource()==btnEliminar) {
			
			String [] arreglo= {"Si","NO"};
			int opcion=JOptionPane.showOptionDialog(null, "Seguro que desea Eliminar esta Persona", "Confirmacion", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "Si");
			if(opcion==0) {
				String respuesta=miCoordinador.EliminarPersona(persona);
			
			
				if(respuesta.equals("ok") ) {
					vaciar();
					JOptionPane.showMessageDialog(null, "Se elimino corretamente la persona y sus mascotas asociadas","ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
				}
				
			}else {
				JOptionPane.showMessageDialog(null,"Se Cancelo el Proceso","ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
			}
						
			
				
				
			
			}else if(e.getSource()==btnCancelar) {
				dispose();
			}
		
		}
	

	
		
	
	
}

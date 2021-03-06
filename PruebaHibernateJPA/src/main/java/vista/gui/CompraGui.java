package vista.gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.brayan.entidades.Persona;
import com.brayan.entidades.PersonasProductos;
import com.brayan.entidades.Producto;

import java.awt.event.*;

import controlador.Coordinador;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;

public class CompraGui extends JDialog  implements ActionListener{

	private final JPanel contentPanel = new JPanel();
	private JTextField txtPersona;
	private JTextField txtProducto;
	private Coordinador miCoordinador;
	private JButton btnComprar;
	private JButton btnCancelar;
	Persona per;
	Producto pro;

	/**
	 * Create the dialog.
	 * @param b 
	 * @param miVentanaComprar 
	 */
	public CompraGui(CompraGui miVentanaComprar, boolean b) {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblpersona = new JLabel("Id Persona");
		lblpersona.setHorizontalAlignment(SwingConstants.CENTER);
		lblpersona.setBounds(84, 86, 89, 21);
		contentPanel.add(lblpersona);
		
		JLabel lblProducto = new JLabel("Id Producto");
		lblProducto.setHorizontalAlignment(SwingConstants.CENTER);
		lblProducto.setBounds(246, 89, 84, 14);
		contentPanel.add(lblProducto);
		
		txtPersona = new JTextField();
		txtPersona.setBounds(87, 108, 86, 20);
		contentPanel.add(txtPersona);
		txtPersona.setColumns(10);
		
		txtProducto = new JTextField();
		txtProducto.setBounds(246, 108, 86, 20);
		contentPanel.add(txtProducto);
		txtProducto.setColumns(10);
		
		btnComprar = new JButton("Comprar");
		btnComprar.setBounds(221, 215, 89, 23);
		btnComprar.addActionListener(this);
		contentPanel.add(btnComprar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(320, 215, 89, 23);
		btnCancelar.addActionListener(this);
		contentPanel.add(btnCancelar);
		
		JLabel lblNewLabel = new JLabel("COMPRAS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(137, 22, 160, 37);
		contentPanel.add(lblNewLabel);
	}

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnComprar) {
				
			PersonasProductos miPerPro=new PersonasProductos(); 
			
			Persona personaVo=miCoordinador.setConsultarPersona(Long.parseLong(txtPersona.getText()));
			System.out.println(personaVo);
			Producto productoVo=miCoordinador.ConsultarProductoGui(Long.parseLong(txtProducto.getText()));
			System.out.println(productoVo);
			
			String resp = "";
			miPerPro.setPersonaId(personaVo.getIdPersona());
			miPerPro.setProductoId(productoVo.getIdProducto());
			
			if(miPerPro!=null) {
				resp=miCoordinador.registrarCompra(miPerPro);
			}else {
				if(resp.equalsIgnoreCase("se realizo la compra del producto")) {
				
					JOptionPane.showMessageDialog(null, "Se Registro la Compra con Exicto","ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,"No se pudo realizar la compra","ADVERTENCIA!!!",JOptionPane.ERROR_MESSAGE);
				}
			}
		}if(e.getSource()==btnCancelar) {
			dispose();
		}
		
	}

}

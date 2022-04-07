package vista.gui;

import java.awt.BorderLayout;



import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.camilo.entidades.Producto;

import controlador.Coordinador;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class EliminarProductoGui extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textNombreBuscar;
	private JTextField textNombre;
	private JTextField textPrecio;
	private Coordinador micoordinador;
	private JButton btnEliminar;
	private JButton btnBuscar;
	
	Producto productovo;



	public EliminarProductoGui() {
		
		setBounds(100, 100, 534, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb = new JLabel("Nombre");
		lb.setBounds(110, 35, 46, 14);
		contentPane.add(lb);
		
		textNombreBuscar = new JTextField();
		textNombreBuscar.setBounds(198, 32, 106, 20);
		contentPane.add(textNombreBuscar);
		textNombreBuscar.setColumns(10);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(339, 31, 89, 23);
		contentPane.add(btnBuscar);
		btnBuscar.addActionListener(this);
		
		textNombre = new JTextField();
		textNombre.setBounds(109, 119, 86, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(30, 122, 46, 14);
		contentPane.add(lblNewLabel);
		
		textPrecio = new JTextField();
		textPrecio.setBounds(316, 119, 86, 20);
		contentPane.add(textPrecio);
		textPrecio.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Precio");
		lblNewLabel_1.setBounds(253, 122, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(339, 212, 89, 23);
		contentPane.add(btnEliminar);
		btnEliminar.addActionListener(this);
	}

	

	



	public void setCoordinador(Coordinador miCoordinador) {
		this.micoordinador=miCoordinador;
		
	}







	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnBuscar) {
			int nombreproduc=Integer.parseInt(textNombreBuscar.getText());;
			productovo=micoordinador.ConsultarProductoGui(nombreproduc);
			if (productovo!=null) {
				
				textNombre.setText(productovo.getNombreProducto());
				textPrecio.setText(productovo.getPrecioProducto()+"");
			}
		}if (e.getSource()==btnEliminar) {
			
			String [] arreglo= {"Si","NO"};
			int opcion=JOptionPane.showOptionDialog(null, "Seguro que desea Eliminar esta Persona", "Confirmacion", 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "Si");
			if(opcion==0) {
				String respuesta=micoordinador.EliminarProducto(productovo);
				
				if(respuesta.equals("ok") ) {
					
					JOptionPane.showMessageDialog(null, "Se elimino corretamente","ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
				}
				
			}else {
				JOptionPane.showMessageDialog(null,"Se Cancelo el Proceso","ADVERTENCIA!!!",JOptionPane.WARNING_MESSAGE);
			}
			}
		
	}
		
	
}

package guiMantenimiento;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

public class Bungalow extends JInternalFrame {
	private JTextField txtPrecio;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bungalow frame = new Bungalow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Bungalow() {
		setClosable(true);
		setFrameIcon(new ImageIcon(Bungalow.class.getResource("/com/sun/java/swing/plaf/windows/icons/Question.gif")));
		setTitle("Bungalow");
		setBounds(100, 100, 524, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Categoria :");
		lblNewLabel.setBounds(68, 26, 47, 14);
		getContentPane().add(lblNewLabel);
		
		JComboBox cboCategoria = new JComboBox();
		cboCategoria.setModel(new DefaultComboBoxModel(new String[] {"Simple", "Doble", "Familiar"}));
		cboCategoria.setBounds(128, 23, 109, 20);
		getContentPane().add(cboCategoria);
		
		JLabel lblPrecio = new JLabel("Precio :");
		lblPrecio.setBounds(78, 57, 46, 14);
		getContentPane().add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(128, 54, 86, 20);
		getContentPane().add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado :");
		lblEstado.setBounds(264, 26, 46, 14);
		getContentPane().add(lblEstado);
		
		JComboBox cboEstado = new JComboBox();
		cboEstado.setModel(new DefaultComboBoxModel(new String[] {"Libre", "Ocupado"}));
		cboEstado.setBounds(320, 23, 107, 20);
		getContentPane().add(cboEstado);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(10, 93, 89, 23);
		getContentPane().add(btnAdicionar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(112, 93, 89, 23);
		getContentPane().add(btnConsultar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(211, 93, 89, 23);
		getContentPane().add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(310, 93, 89, 23);
		getContentPane().add(btnEliminar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(409, 93, 89, 23);
		getContentPane().add(btnListar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 127, 488, 132);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"Codigo", "Categoria", "Precio", "Estado"
			}
		));
		scrollPane.setViewportView(table);

	}
}

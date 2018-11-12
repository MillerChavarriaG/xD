package guiMantenimiento;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Producto extends JInternalFrame {
	private JTextField txtDetalle;
	private JTextField txtPrecioUni;
	private JTextField txtStock;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Producto frame = new Producto();
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
	public Producto() {
		setClosable(true);
		setFrameIcon(new ImageIcon(Producto.class.getResource("/com/sun/javafx/scene/control/skin/modena/HTMLEditor-Paste-Black@2x.png")));
		setTitle("Producto");
		setBounds(100, 100, 516, 304);
		getContentPane().setLayout(null);
		
		JLabel lblDetalle = new JLabel("Detalle :");
		lblDetalle.setBounds(81, 24, 49, 14);
		getContentPane().add(lblDetalle);
		
		txtDetalle = new JTextField();
		txtDetalle.setBounds(140, 21, 167, 20);
		getContentPane().add(txtDetalle);
		txtDetalle.setColumns(10);
		
		JLabel lblPrecioUnitario = new JLabel("Precio Unitario :");
		lblPrecioUnitario.setBounds(41, 55, 89, 14);
		getContentPane().add(lblPrecioUnitario);
		
		txtPrecioUni = new JTextField();
		txtPrecioUni.setBounds(140, 52, 86, 20);
		getContentPane().add(txtPrecioUni);
		txtPrecioUni.setColumns(10);
		
		JLabel lblStock = new JLabel("Stock :");
		lblStock.setBounds(341, 55, 40, 14);
		getContentPane().add(lblStock);
		
		txtStock = new JTextField();
		txtStock.setBounds(391, 52, 49, 20);
		getContentPane().add(txtStock);
		txtStock.setColumns(10);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(7, 111, 89, 23);
		getContentPane().add(btnAdicionar);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(103, 111, 89, 23);
		getContentPane().add(btnConsultar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(200, 111, 89, 23);
		getContentPane().add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(299, 111, 89, 23);
		getContentPane().add(btnEliminar);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(398, 111, 89, 23);
		getContentPane().add(btnListar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(7, 144, 480, 119);
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
				"Codigo", "Detalle", "Precio", "Stock"
			}
		));
		scrollPane.setViewportView(table);

	}

}

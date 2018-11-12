package Reporte;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class IngresosyConsumos extends JInternalFrame {
	private JTextField txtID;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IngresosyConsumos frame = new IngresosyConsumos();
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
	public IngresosyConsumos() {
		setFrameIcon(new ImageIcon(IngresosyConsumos.class.getResource("/javax/swing/plaf/metal/icons/Question.gif")));
		setTitle("Ingresos y Consumos");
		setBounds(100, 100, 450, 312);
		getContentPane().setLayout(null);
		
		JLabel lblEstado = new JLabel("Estado :");
		lblEstado.setBounds(63, 26, 46, 14);
		getContentPane().add(lblEstado);
		
		JComboBox cboEstado = new JComboBox();
		cboEstado.setModel(new DefaultComboBoxModel(new String[] {"Pendiente", "Pagado"}));
		cboEstado.setBounds(111, 23, 91, 20);
		getContentPane().add(cboEstado);
		
		JLabel lblId = new JLabel("ID :");
		lblId.setBounds(225, 26, 46, 14);
		getContentPane().add(lblId);
		
		txtID = new JTextField();
		txtID.setBounds(254, 23, 86, 20);
		getContentPane().add(txtID);
		txtID.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(113, 69, 89, 23);
		getContentPane().add(btnBuscar);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(213, 69, 89, 23);
		getContentPane().add(btnCerrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 96, 414, 141);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Nombres", "Apellidos", "DNI", "Tel\u00E9fono", "Estado", "Total"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btndetalles = new JButton("+Detalles");
		btndetalles.setBounds(170, 248, 89, 23);
		getContentPane().add(btndetalles);

	}
}

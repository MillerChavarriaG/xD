package Reporte;

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

public class Hospedajes extends JInternalFrame {
	private JTextField txtID;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hospedajes frame = new Hospedajes();
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
	public Hospedajes() {
		setTitle("Hospedajes");
		setBounds(100, 100, 518, 324);
		getContentPane().setLayout(null);
		
		JLabel lblEstado = new JLabel("Estado :");
		lblEstado.setBounds(102, 26, 46, 14);
		getContentPane().add(lblEstado);
		
		JComboBox cboEstado = new JComboBox();
		cboEstado.setModel(new DefaultComboBoxModel(new String[] {"Pendiente", "Pagado"}));
		cboEstado.setBounds(146, 23, 92, 20);
		getContentPane().add(cboEstado);
		
		JLabel lblId = new JLabel("ID :");
		lblId.setBounds(267, 26, 32, 14);
		getContentPane().add(lblId);
		
		txtID = new JTextField();
		txtID.setBounds(288, 23, 86, 20);
		getContentPane().add(txtID);
		txtID.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(149, 59, 89, 23);
		getContentPane().add(btnBuscar);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(262, 59, 89, 23);
		getContentPane().add(btnCerrar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 88, 482, 150);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"ID", "Nombres", "Estado", "Fecha de Entrada", "Fecha de Salida", "Total"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnDetalles = new JButton("+ Detalles");
		btnDetalles.setBounds(216, 249, 89, 23);
		getContentPane().add(btnDetalles);

	}

}

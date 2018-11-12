package Reporte;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class MasHospedajes extends JInternalFrame {
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MasHospedajes frame = new MasHospedajes();
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
	public MasHospedajes() {
		setTitle("M\u00E1s Detalles de Hospedajes");
		setBounds(100, 100, 450, 235);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 143);
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
				"ID", "Nombres", "Apellidos", "DNI", "Tel\u00E9fono", "Total"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnMenPrincipal = new JButton("Men\u00FA Principal");
		btnMenPrincipal.setBounds(112, 165, 104, 23);
		getContentPane().add(btnMenPrincipal);
		
		JButton btnVolverAtrs = new JButton("Volver Atr\u00E1s");
		btnVolverAtrs.setBounds(230, 165, 104, 23);
		getContentPane().add(btnVolverAtrs);

	}
}

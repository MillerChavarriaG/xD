package Reporte;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class MasIngresos extends JInternalFrame {
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MasIngresos frame = new MasIngresos();
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
	public MasIngresos() {
		setFrameIcon(new ImageIcon(MasIngresos.class.getResource("/com/sun/java/swing/plaf/motif/icons/TreeClosed.gif")));
		setTitle("M\u00E1s detalles Ingresos y Consumos");
		setBounds(100, 100, 450, 235);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 142);
		getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"ID", "Descripci\u00F3n", "Precio", "Cantidad", "Importe"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnMenPrincipal = new JButton("Men\u00FA Principal");
		btnMenPrincipal.setBounds(92, 164, 112, 23);
		getContentPane().add(btnMenPrincipal);
		
		JButton btnVolverAtrs = new JButton("Volver Atr\u00E1s");
		btnVolverAtrs.setBounds(228, 164, 112, 23);
		getContentPane().add(btnVolverAtrs);

	}

}

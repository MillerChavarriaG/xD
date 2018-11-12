package Reporte;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class reporte extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnBuscar;
	
	private IngresosyConsumos ingresCons=new IngresosyConsumos();
	private Hospedajes hospe=new Hospedajes();
	private JComboBox cboReporte;

	/**
	 * Launch the application.
	 */
	int x;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reporte frame = new reporte();
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
	public reporte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPorFavorSeleccione = new JLabel("Por favor seleccione cualquier opciones y presione buscar");
		lblPorFavorSeleccione.setBounds(48, 11, 301, 14);
		contentPane.add(lblPorFavorSeleccione);
		
		JLabel lblGracias = new JLabel("Gracias");
		lblGracias.setBounds(163, 25, 46, 14);
		contentPane.add(lblGracias);
		
		JLabel lblReporteDe = new JLabel("Reporte de :");
		lblReporteDe.setBounds(85, 53, 69, 14);
		contentPane.add(lblReporteDe);
		
		cboReporte = new JComboBox();
		cboReporte.addActionListener(this);
		cboReporte.setModel(new DefaultComboBoxModel(new String[] {"Ingresos y Consumos", "Hospedajes"}));
		cboReporte.setBounds(163, 50, 143, 20);
		contentPane.add(cboReporte);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(this);
		btnBuscar.setBounds(140, 78, 89, 23);
		contentPane.add(btnBuscar);
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cboReporte) {
			do_cboReporte_actionPerformed(e);
		}
		if (e.getSource() == btnBuscar) {
			do_btnBuscar_actionPerformed(e);
		}
	}
	protected void do_btnBuscar_actionPerformed(ActionEvent e) {
	if(x==0){
		ingresCons.setVisible(true);
	}
	else{
		hospe.setVisible(true);
	}
	
	}
	protected void do_cboReporte_actionPerformed(ActionEvent e) {
		int x = cboReporte.getSelectedIndex();
		switch (x) {
		case 0:
			ingresCons.setVisible(true);
			break;

		default:
			hospe.setVisible(true);
			break;
		}
	}
}

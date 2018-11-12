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

import EntidadMantenimiento.entidadSocio;
import arregloMantenimiento.ArregloSocio;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Socio extends JInternalFrame implements ActionListener {
	
	private ArregloSocio a=new ArregloSocio();
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	private JTextField txtDni;
	private JTable table;
	private JButton btnAdicionar;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnListar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Socio frame = new Socio();
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
	public Socio() {
		setClosable(true);
		setFrameIcon(new ImageIcon(Socio.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-more-details.png")));
		setTitle("Socio");
		setBounds(100, 100, 508, 342);
		getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre :");
		lblNombre.setBounds(81, 32, 56, 14);
		getContentPane().add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(141, 29, 104, 20);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido :");
		lblApellido.setBounds(81, 70, 56, 14);
		getContentPane().add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(141, 67, 104, 20);
		getContentPane().add(txtApellido);
		txtApellido.setColumns(10);
		
		JLabel lblTelfono = new JLabel("Tel\u00E9fono :");
		lblTelfono.setBounds(274, 32, 56, 14);
		getContentPane().add(lblTelfono);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(330, 29, 86, 20);
		getContentPane().add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JLabel lblDni = new JLabel("DNI :");
		lblDni.setBounds(296, 70, 34, 14);
		getContentPane().add(lblDni);
		
		txtDni = new JTextField();
		txtDni.setBounds(330, 67, 86, 20);
		getContentPane().add(txtDni);
		txtDni.setColumns(10);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(10, 108, 89, 23);
		getContentPane().add(btnAdicionar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(this);
		btnConsultar.setBounds(104, 108, 89, 23);
		getContentPane().add(btnConsultar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.setBounds(199, 108, 89, 23);
		getContentPane().add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(295, 108, 89, 23);
		getContentPane().add(btnEliminar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(391, 108, 89, 23);
		getContentPane().add(btnListar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 142, 470, 159);
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
				{null, null, null, null, null},
			},
			new String[] {
				"Codigo", "Nombres", "Apellidos", "DNI", "Tel\u00E9fono"
			}
		));
		scrollPane.setViewportView(table);

	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnListar) {
			do_btnListar_actionPerformed(e);
		}
		if (e.getSource() == btnEliminar) {
			do_btnEliminar_actionPerformed(e);
		}
		if (e.getSource() == btnModificar) {
			do_btnModificar_actionPerformed(e);
		}
		if (e.getSource() == btnConsultar) {
			do_btnConsultar_actionPerformed(e);
		}
		if (e.getSource() == btnAdicionar) {
			do_btnAdicionar_actionPerformed(e);
		}
	}
	protected void do_btnAdicionar_actionPerformed(ActionEvent e) {
	adicionar();
	}
	protected void do_btnConsultar_actionPerformed(ActionEvent e) {
	}
	protected void do_btnModificar_actionPerformed(ActionEvent e) {
	}
	protected void do_btnEliminar_actionPerformed(ActionEvent e) {
	}
	protected void do_btnListar_actionPerformed(ActionEvent e) {
	}
	
	void adicionar(){
		String nombre=txtNombre.getText().trim();
		String apellido=txtApellido.getText().trim();
		String dni=txtDni.getText().trim();
		String telefono=txtTelefono.getText().trim();
		
		
		entidadSocio obj=new entidadSocio();
		obj.setNombres(nombre);
		obj.setApellidos(apellido);
		obj.setDni(dni);
		obj.setTelefono(telefono);
		
		a.agregar(obj);
		listar();
		
		
	}
	void listar(){
		DefaultTableModel dtm= (DefaultTableModel)table.getModel();
		dtm.setRowCount(0);
		for (int i = 0; i < a.tamaño(); i++) {
			entidadSocio x=a.obtener(i);
			Object[] fila={x.getCodigoSocio(),x.getNombres(),x.getApellidos(),x.getDni(),x.getTelefono()};
			dtm.addRow(fila);
		}
	}
	
}

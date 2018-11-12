package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Reporte.reporte;
import guiMantenimiento.Bungalow;
import guiMantenimiento.Producto;
import guiMantenimiento.Socio;

import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JMenuItem mntmCambiarDeUsuario;
	private JMenuItem mntmSalir;
	private JMenuItem mntmSocio;
	private JMenuItem mntmProducto;
	private JMenuItem mntmBungalow;
	
	
	//GUI DE MANTENIMIENTO
	private Socio s=new Socio();
	private Producto p=new Producto();
	private Bungalow b=new Bungalow();
	private JMenuItem mntmIngresosYConsumos;
	
	//GUI DE REPORTE
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setTitle("Sistema de Gestion de Hospedaje");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 532, 317);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		mnArchivo.setMnemonic('A');
		mnArchivo.setIcon(new ImageIcon(Principal.class.getResource("/com/sun/javafx/scene/web/skin/Paste_16x16_JFX.png")));
		menuBar.add(mnArchivo);
		
		mntmCambiarDeUsuario = new JMenuItem("Cambiar de Usuario");
		mntmCambiarDeUsuario.addActionListener(this);
		mntmCambiarDeUsuario.setMnemonic('C');
		mntmCambiarDeUsuario.setIcon(new ImageIcon(Principal.class.getResource("/com/sun/java/swing/plaf/motif/icons/Question.gif")));
		mnArchivo.add(mntmCambiarDeUsuario);
		
		mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(this);
		mntmSalir.setMnemonic('S');
		mntmSalir.setIcon(new ImageIcon(Principal.class.getResource("/com/sun/java/swing/plaf/windows/icons/Error.gif")));
		mnArchivo.add(mntmSalir);
		
		JMenu mnMantenimiento = new JMenu("Mantenimiento");
		mnMantenimiento.setMnemonic('M');
		mnMantenimiento.setIcon(new ImageIcon(Principal.class.getResource("/com/sun/java/swing/plaf/windows/icons/UpFolder.gif")));
		menuBar.add(mnMantenimiento);
		
		mntmSocio = new JMenuItem("Socio");
		mntmSocio.addActionListener(this);
		mntmSocio.setMnemonic('S');
		mntmSocio.setIcon(new ImageIcon(Principal.class.getResource("/com/sun/java/swing/plaf/motif/icons/Question.gif")));
		mnMantenimiento.add(mntmSocio);
		
		mntmProducto = new JMenuItem("Producto");
		mntmProducto.addActionListener(this);
		mntmProducto.setMnemonic('P');
		mntmProducto.setIcon(new ImageIcon(Principal.class.getResource("/com/sun/java/swing/plaf/windows/icons/File.gif")));
		mnMantenimiento.add(mntmProducto);
		
		mntmBungalow = new JMenuItem("Bungalow");
		mntmBungalow.addActionListener(this);
		mntmBungalow.setMnemonic('B');
		mntmBungalow.setIcon(new ImageIcon(Principal.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-capslock-button.png")));
		mnMantenimiento.add(mntmBungalow);
		
		JMenu mnRegistro = new JMenu("Registro");
		mnRegistro.setMnemonic('R');
		mnRegistro.setIcon(new ImageIcon(Principal.class.getResource("/javax/swing/plaf/metal/icons/ocean/menu.gif")));
		menuBar.add(mnRegistro);
		
		JMenu mnPago = new JMenu("Pago");
		mnPago.setMnemonic('P');
		mnPago.setIcon(new ImageIcon(Principal.class.getResource("/javax/swing/plaf/metal/icons/ocean/paletteClose.gif")));
		menuBar.add(mnPago);
		
		JMenu mnReporte = new JMenu("Reporte");
		mnReporte.setMnemonic('R');
		mnReporte.setIcon(new ImageIcon(Principal.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-capslock-button.png")));
		menuBar.add(mnReporte);
		
		mntmIngresosYConsumos = new JMenuItem("Ingresos y Consumos / Hospedajes");
		mntmIngresosYConsumos.addActionListener(this);
		mnReporte.add(mntmIngresosYConsumos);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(SystemColor.textHighlight);
		contentPane.add(desktopPane, BorderLayout.CENTER);
		s.setLocation(89, 82);
		
		desktopPane.add(s);
		desktopPane.add(p);
		desktopPane.add(b);
		
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == mntmIngresosYConsumos) {
			do_mntmIngresosYConsumos_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmBungalow) {
			do_mntmBungalow_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmProducto) {
			do_mntmProducto_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmSocio) {
			do_mntmSocio_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmSalir) {
			do_mntmSalir_actionPerformed(arg0);
		}
		if (arg0.getSource() == mntmCambiarDeUsuario) {
			do_mntmCambiarDeUsuario_actionPerformed(arg0);
		}
	}
	protected void do_mntmCambiarDeUsuario_actionPerformed(ActionEvent arg0) {
	}
	protected void do_mntmSalir_actionPerformed(ActionEvent arg0) {
	}
	protected void do_mntmSocio_actionPerformed(ActionEvent arg0) {
		s.setVisible(true);
		p.setVisible(false);
		b.setVisible(false);
		
	}
	protected void do_mntmProducto_actionPerformed(ActionEvent arg0) {
		p.setVisible(true);
		s.setVisible(false);
		b.setVisible(false);
	}
	protected void do_mntmBungalow_actionPerformed(ActionEvent arg0) {
		b.setVisible(true);
		s.setVisible(false);
		p.setVisible(false);
	}
	protected void do_mntmIngresosYConsumos_actionPerformed(ActionEvent arg0) {
		reporte repor=new reporte();
		repor.setVisible(true);
	}
}

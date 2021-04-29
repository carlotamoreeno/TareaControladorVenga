package Ventanas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
/**
 * 
 * @author ana
 *
 */
public class AyudaListas extends JPanel {
	private JSeparator separatorAniadir;
	private JSeparator separatorEliminar;
	private JTextPane txtpnBotonParaAniadir;
	private JTextPane txtpnBotonParaEliminar;
	private JSeparator separatorModificar;
	private JSeparator separatorAyuda;
	private JTextPane txtpnLabelPanelAlumnos;
	private JSeparator separatorEmpresas;
	private JTextPane txtpnLabelPanelEmpresas;
	private JSeparator separatorConsultas;
	private JTextPane txtpnLabelPanelConsultas;
	private JSeparator separatorLogout;
	private JTextPane txtpnLabelLogout;
	private JSeparator separatorAyuda_1;
	private JTextPane txtpnLabelPanelAyuda;
	private JLabel lblImagenListas;

	/**
	 * Create the panel.
	 */
	public AyudaListas() {
		setBackground(new Color(255, 255, 255));
		setLayout(null);

		separatorAyuda = new JSeparator();
		separatorAyuda.setPreferredSize(new Dimension(30, 3));
		separatorAyuda.setForeground(Color.BLACK);
		separatorAyuda.setBounds(463, 116, 15, 57);
		separatorAyuda.setOrientation(SwingConstants.VERTICAL);
		add(separatorAyuda);

		separatorConsultas = new JSeparator();
		separatorConsultas.setPreferredSize(new Dimension(30, 3));
		separatorConsultas.setOrientation(SwingConstants.VERTICAL);
		separatorConsultas.setForeground(Color.BLACK);
		separatorConsultas.setBounds(589, 57, 15, 116);
		add(separatorConsultas);

		separatorEmpresas = new JSeparator();
		separatorEmpresas.setPreferredSize(new Dimension(30, 3));
		separatorEmpresas.setOrientation(SwingConstants.VERTICAL);
		separatorEmpresas.setForeground(Color.BLACK);
		separatorEmpresas.setBounds(528, 57, 15, 116);
		add(separatorEmpresas);

		separatorLogout = new JSeparator();
		separatorLogout.setPreferredSize(new Dimension(30, 3));
		separatorLogout.setForeground(Color.BLACK);
		separatorLogout.setBounds(686, 178, 42, 15);
		add(separatorLogout);

		separatorAyuda_1 = new JSeparator();
		separatorAyuda_1.setPreferredSize(new Dimension(30, 3));
		separatorAyuda_1.setOrientation(SwingConstants.VERTICAL);
		separatorAyuda_1.setForeground(Color.BLACK);
		separatorAyuda_1.setBounds(629, 116, 15, 57);
		add(separatorAyuda_1);

		separatorAniadir = new JSeparator();
		separatorAniadir.setOrientation(SwingConstants.VERTICAL);
		separatorAniadir.setPreferredSize(new Dimension(30, 3));
		separatorAniadir.setForeground(Color.BLACK);
		separatorAniadir.setBounds(589, 421, 15, 39);
		add(separatorAniadir);

		separatorModificar = new JSeparator();
		separatorModificar.setPreferredSize(new Dimension(30, 3));
		separatorModificar.setForeground(Color.BLACK);
		separatorModificar.setBounds(189, 411, 327, 15);
		add(separatorModificar);

		separatorEliminar = new JSeparator();
		separatorEliminar.setForeground(new Color(0, 0, 0));
		separatorEliminar.setBounds(670, 411, 86, 15);
		separatorEliminar.setPreferredSize(new Dimension(30, 3));
		add(separatorEliminar);

		txtpnBotonParaEliminar = new JTextPane();
		txtpnBotonParaEliminar.setText("Botón para eliminar una fila seleccionada.");
		txtpnBotonParaEliminar.setBounds(756, 387, 143, 39);
		add(txtpnBotonParaEliminar);

		txtpnBotonParaAniadir = new JTextPane();
		txtpnBotonParaAniadir.setText(
				"Botón para añadir una nueva fila. Al hacer click en el botón se le redirigirá a la ventana de formulario.");
		txtpnBotonParaAniadir.setBounds(355, 461, 327, 39);
		add(txtpnBotonParaAniadir);

		JTextPane txtpnBotonParaModificar = new JTextPane();
		txtpnBotonParaModificar.setText(
				"Seleccionar una fila para modificar sus datos. Al hacer click en el botón se le redirigirá a la ventana de formulario correspondiente.");
		txtpnBotonParaModificar.setBounds(48, 328, 143, 123);
		add(txtpnBotonParaModificar);

		txtpnLabelPanelAlumnos = new JTextPane();
		txtpnLabelPanelAlumnos.setText("Seleccionar para ir al panel de alumnos.");
		txtpnLabelPanelAlumnos.setBounds(362, 81, 143, 39);
		add(txtpnLabelPanelAlumnos);

		txtpnLabelPanelEmpresas = new JTextPane();
		txtpnLabelPanelEmpresas.setText("Seleccionar para ir al panel de empresas.");
		txtpnLabelPanelEmpresas.setBounds(418, 21, 143, 39);
		add(txtpnLabelPanelEmpresas);

		txtpnLabelPanelConsultas = new JTextPane();
		txtpnLabelPanelConsultas.setText("Seleccionar para ir al panel de consultas.");
		txtpnLabelPanelConsultas.setBounds(589, 21, 143, 39);
		add(txtpnLabelPanelConsultas);

		txtpnLabelLogout = new JTextPane();
		txtpnLabelLogout.setText("Seleccionar para cerrar sesión en la apilcación.");
		txtpnLabelLogout.setBounds(727, 168, 143, 48);
		add(txtpnLabelLogout);

		txtpnLabelPanelAyuda = new JTextPane();
		txtpnLabelPanelAyuda.setText("Seleccionar para ir al panel de ayuda.");
		txtpnLabelPanelAyuda.setBounds(629, 81, 143, 39);
		add(txtpnLabelPanelAyuda);

		lblImagenListas = new JLabel("");
		lblImagenListas.setBounds(219, 145, 492, 281);
		ImageIcon icon = new ImageIcon(AyudaListas.class.getResource("/img/Listas.png"));
		Image img = icon.getImage();
		Image imgScale = img.getScaledInstance(lblImagenListas.getWidth(), lblImagenListas.getHeight(),
				Image.SCALE_SMOOTH);
		ImageIcon iconScale = new ImageIcon(imgScale);
		lblImagenListas.setIcon(iconScale);
		add(lblImagenListas);

	}
}

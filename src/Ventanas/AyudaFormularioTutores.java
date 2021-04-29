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
import javax.swing.JTextArea;
/**
 * 
 * @author ana
 *
 */
public class AyudaFormularioTutores extends JPanel{
	private JSeparator separatorAniadir;
	private JSeparator separatorEliminar;
	private JTextArea txtpnBotonParaAniadir;
	private JTextArea txtpnBotonParaEliminar;
	private JSeparator separatorModificar;
	private JSeparator separatorAyuda;
	private JTextArea txtpnLabelPanelAlumnos;
	private JSeparator separatorEmpresas;
	private JTextArea txtpnLabelPanelEmpresas;
	private JSeparator separatorConsultas;
	private JTextArea txtpnLabelPanelConsultas;
	private JSeparator separatorLogout;
	private JTextArea txtpnLabelLogout;
	private JSeparator separatorAyuda_1;
	private JTextArea txtpnLabelPanelAyuda;
	private JLabel lblImagenListas;
	private JSeparator separatorModificar_1;
	private JSeparator separatorAyuda_2;
	private JTextArea txtpnLabelLogout_1;
	private JSeparator separatorLogout_1;
	private JTextArea txtpnLabelLogout_2;
	private JTextArea txtpnBotonParaModificar_1;
	private JSeparator separatorLogout_2;
	private JTextArea textArea;
	private JSeparator separatorLogout_3;
	private JTextArea txtpnBotonParaModificar_2;
	private JSeparator separatorLogout_4;

	/**
	 * Create the panel.
	 */
	public AyudaFormularioTutores() {
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
		
		separatorLogout_3 = new JSeparator();
		separatorLogout_3.setPreferredSize(new Dimension(30, 3));
		separatorLogout_3.setForeground(Color.BLACK);
		separatorLogout_3.setBounds(695, 168, 30, 15);
		add(separatorLogout_3);

		separatorLogout = new JSeparator();
		separatorLogout.setPreferredSize(new Dimension(30, 3));
		separatorLogout.setForeground(Color.BLACK);
		separatorLogout.setBounds(658, 247, 97, 15);
		add(separatorLogout);
		
		separatorLogout_1 = new JSeparator();
		separatorLogout_1.setPreferredSize(new Dimension(30, 3));
		separatorLogout_1.setForeground(Color.BLACK);
		separatorLogout_1.setBounds(504, 348, 265, 15);
		add(separatorLogout_1);

		separatorAyuda_1 = new JSeparator();
		separatorAyuda_1.setPreferredSize(new Dimension(30, 3));
		separatorAyuda_1.setOrientation(SwingConstants.VERTICAL);
		separatorAyuda_1.setForeground(Color.BLACK);
		separatorAyuda_1.setBounds(629, 116, 15, 57);
		add(separatorAyuda_1);
		
		separatorLogout_2 = new JSeparator();
		separatorLogout_2.setPreferredSize(new Dimension(30, 3));
		separatorLogout_2.setForeground(Color.BLACK);
		separatorLogout_2.setBounds(171, 348, 120, 15);
		add(separatorLogout_2);
		
		separatorLogout_4 = new JSeparator();
		separatorLogout_4.setPreferredSize(new Dimension(30, 3));
		separatorLogout_4.setForeground(Color.BLACK);
		separatorLogout_4.setBounds(194, 296, 241, 15);
		add(separatorLogout_4);

		separatorAniadir = new JSeparator();
		separatorAniadir.setOrientation(SwingConstants.VERTICAL);
		separatorAniadir.setPreferredSize(new Dimension(30, 3));
		separatorAniadir.setForeground(Color.BLACK);
		separatorAniadir.setBounds(576, 403, 15, 57);
		add(separatorAniadir);

		separatorModificar = new JSeparator();
		separatorModificar.setPreferredSize(new Dimension(30, 3));
		separatorModificar.setForeground(Color.BLACK);
		separatorModificar.setBounds(194, 247, 97, 15);
		add(separatorModificar);

		separatorEliminar = new JSeparator();
		separatorEliminar.setForeground(new Color(0, 0, 0));
		separatorEliminar.setBounds(658, 391, 86, 15);
		separatorEliminar.setPreferredSize(new Dimension(30, 3));
		add(separatorEliminar);

		txtpnBotonParaEliminar = new JTextArea();
		txtpnBotonParaEliminar.setText("Botón para volver a la \n ventana de tutores.");
		txtpnBotonParaEliminar.setBounds(742, 375, 178, 39);
		add(txtpnBotonParaEliminar);

		txtpnBotonParaAniadir = new JTextArea();
		txtpnBotonParaAniadir.setText(
				"Botón para guardar los datos \n introducidos o modificados.");
		txtpnBotonParaAniadir.setBounds(463, 461, 219, 39);
		add(txtpnBotonParaAniadir);
		
		txtpnBotonParaModificar_2 = new JTextArea();
		txtpnBotonParaModificar_2.setText("La contraseña debe tener \n mayusculas, minusculas, \n un caracter especial y un número.");
		txtpnBotonParaModificar_2.setBounds(33, 286, 164, 50);
		add(txtpnBotonParaModificar_2);
		
		txtpnBotonParaModificar_1 = new JTextArea();
		txtpnBotonParaModificar_1.setText("Seleccionar un \n centro de la lista.");
		txtpnBotonParaModificar_1.setBounds(33, 348, 143, 39);
		add(txtpnBotonParaModificar_1);

		JTextArea txtpnBotonParaModificar = new JTextArea();
		txtpnBotonParaModificar.setText(
				"Solo introducir letras.");
		txtpnBotonParaModificar.setBounds(44, 237, 143, 39);
		add(txtpnBotonParaModificar);

		txtpnLabelPanelAlumnos = new JTextArea();
		txtpnLabelPanelAlumnos.setText("Seleccionar para ir al \n panel de alumnos.");
		txtpnLabelPanelAlumnos.setBounds(362, 81, 143, 39);
		add(txtpnLabelPanelAlumnos);

		txtpnLabelPanelEmpresas = new JTextArea();
		txtpnLabelPanelEmpresas.setText("Seleccionar para ir al \n panel de empresas.");
		txtpnLabelPanelEmpresas.setBounds(418, 21, 143, 39);
		add(txtpnLabelPanelEmpresas);

		txtpnLabelPanelConsultas = new JTextArea();
		txtpnLabelPanelConsultas.setText("Seleccionar para ir al\n  panel de consultas.");
		txtpnLabelPanelConsultas.setBounds(589, 21, 143, 39);
		add(txtpnLabelPanelConsultas);

		txtpnLabelLogout = new JTextArea();
		txtpnLabelLogout.setText("Seleccionar para cerrar \n  sesión en la apilcación.");
		txtpnLabelLogout.setBounds(727, 168, 169, 39);
		add(txtpnLabelLogout);

		txtpnLabelPanelAyuda = new JTextArea();
		txtpnLabelPanelAyuda.setText("Seleccionar para ir al \n  panel de ayuda.");
		txtpnLabelPanelAyuda.setBounds(629, 81, 143, 39);
		add(txtpnLabelPanelAyuda);

		
		separatorModificar_1 = new JSeparator();
		separatorModificar_1.setPreferredSize(new Dimension(30, 3));
		separatorModificar_1.setForeground(Color.BLACK);
		separatorModificar_1.setBounds(184, 237, 285, 15);
		add(separatorModificar_1);
		
		txtpnLabelLogout_2 = new JTextArea();
		txtpnLabelLogout_2.setText("Seleccionar un  \n grupo de la lista.");
		txtpnLabelLogout_2.setBounds(763, 328, 157, 32);
		add(txtpnLabelLogout_2);
		
		separatorAyuda_2 = new JSeparator();
		separatorAyuda_2.setPreferredSize(new Dimension(30, 3));
		separatorAyuda_2.setOrientation(SwingConstants.VERTICAL);
		separatorAyuda_2.setForeground(Color.BLACK);
		separatorAyuda_2.setBounds(463, 243, 15, 9);
		add(separatorAyuda_2);
		
		txtpnLabelLogout_1 = new JTextArea();
		txtpnLabelLogout_1.setText("Introducir DNI son \n 8 números + 1 letra");
		txtpnLabelLogout_1.setBounds(753, 237, 167, 48);
		add(txtpnLabelLogout_1);
		lblImagenListas = new JLabel("");
		lblImagenListas.setBounds(219, 145, 492, 281);
		ImageIcon icon = new ImageIcon(AyudaFormularioTutores.class.getResource("/img/FormularioTutor.png"));
		Image img = icon.getImage();
		Image imgScale = img.getScaledInstance(lblImagenListas.getWidth(), lblImagenListas.getHeight(),
				Image.SCALE_SMOOTH);
		ImageIcon iconScale = new ImageIcon(imgScale);
		lblImagenListas.setIcon(iconScale);
		add(lblImagenListas);
		
		
	}
}

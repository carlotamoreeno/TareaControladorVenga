package Ventanas;

/**
 * @author Diego Ter�n Ortiz
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import javax.swing.DefaultComboBoxModel;

public class FormularioTutores extends JFrame implements Ventana {

	private Controlador miC;// Atributo controlador

	private JLabel lblImgLogo;
	private JSeparator separator_1_1, separator_2_1;
	private JPanel contentPane, panelMenu;
	private JLabel lblTitulo, lblDni, lblApellidos, lblUsuario, lblContrasenia, lblNombre, lblCentro, lblGrupo;
	private JTextField txtNombre, txtApellidos, txtDni, txtUsuario, txtContrasenia;
	private JCheckBox chckbxNewCheckBox;
	private JSeparator separator_1_2;
	private JComboBox comboBoxCentro;
	private JComboBox comboBoxGrupo;
	private JButton btnModificar;
	private JButton btnVolver;
	private JButton btnCancelar;

	public FormularioTutores() {
		setTitle("Formulario Tutor");
		setBounds(100, 100, 1226, 905);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 253, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panelMenu = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Dimension arcs = new Dimension(15, 15); // Border corners arcs {width,height}, change this to whatever
														// you want
				int width = getWidth();
				int height = getHeight();
				Graphics2D graphics = (Graphics2D) g;
				graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				// Draws the rounded panel with borders.
				graphics.setColor(new Color(217, 63, 49));
				graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);// paint background
				graphics.setColor(new Color(217, 63, 49));
				graphics.drawRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);// paint border
			}
		};
		panelMenu.setBounds(159, 48, 1043, 59);
		contentPane.add(panelMenu);
		panelMenu.setLayout(null);

		lblTitulo = new JLabel("Formulario Tutor");
		lblTitulo.setBounds(718, 6, 281, 47);
		panelMenu.add(lblTitulo);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Dialog", Font.PLAIN, 33));

		lblImgLogo = new JLabel("");
		lblImgLogo.setIcon(new ImageIcon(AyudaListas.class.getResource("/img/logo.png")));
		lblImgLogo.setBounds(35, 31, 90, 90);
		contentPane.add(lblImgLogo);

		JPanel panelFormulario = new JPanel() {
			protected void paintComponent(Graphics g) {
			}
		};
		panelFormulario.setBorder(new LineBorder(new Color(128, 0, 0)));
		panelFormulario.setBackground(new Color(255, 255, 255));
		panelFormulario.setLayout(null);
		panelFormulario.setBounds(63, 251, 1084, 435);
		contentPane.add(panelFormulario);

		lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.BLACK);
		lblNombre.setBackground(UIManager.getColor("Button.light"));
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombre.setBounds(38, 54, 70, 31);
		panelFormulario.add(lblNombre);

		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBackground(UIManager.getColor("Button.light"));
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblApellidos.setBounds(367, 54, 70, 31);
		panelFormulario.add(lblApellidos);

		lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDni.setBackground(UIManager.getColor("Button.light"));
		lblDni.setBounds(714, 54, 43, 31);
		panelFormulario.add(lblDni);

		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBackground(UIManager.getColor("Button.light"));
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblUsuario.setBounds(38, 189, 70, 31);
		panelFormulario.add(lblUsuario);

		lblContrasenia = new JLabel("Contrase\u00F1a:");
		lblContrasenia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblContrasenia.setBackground(UIManager.getColor("Button.light"));
		lblContrasenia.setBounds(367, 189, 100, 31);
		panelFormulario.add(lblContrasenia);

		lblCentro = new JLabel("Centro:");
		lblCentro.setBackground(UIManager.getColor("Button.light"));
		lblCentro.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCentro.setBounds(38, 341, 70, 20);
		panelFormulario.add(lblCentro);

		lblGrupo = new JLabel("Grupo:");
		lblGrupo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGrupo.setBackground(UIManager.getColor("Button.light"));
		lblGrupo.setBounds(367, 341, 60, 20);
		panelFormulario.add(lblGrupo);

		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(128, 0, 0));
		separator.setBounds(10, 130, 1074, 15);
		panelFormulario.add(separator);

		txtNombre = new JTextField() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Dimension arcs = new Dimension(25, 25); // Border corners arcs {width,height}, change this to whatever
														// you want
				int width = getWidth();
				int height = getHeight();
				Graphics2D graphics = (Graphics2D) g;
				graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				// Draws the rounded panel with borders.
				graphics.setColor(new Color(250, 128, 114, 25));
				graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);// paint background
				graphics.setColor(new Color(250, 128, 114, 25));
				graphics.drawRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);// paint border
			}
		};
		txtNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtNombre.setBorder(null);
		txtNombre.setBounds(116, 56, 227, 29);
		panelFormulario.add(txtNombre);
		txtNombre.setColumns(10);

		txtApellidos = new JTextField() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Dimension arcs = new Dimension(25, 25); // Border corners arcs {width,height}, change this to whatever
														// you want
				int width = getWidth();
				int height = getHeight();
				Graphics2D graphics = (Graphics2D) g;
				graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				// Draws the rounded panel with borders.
				graphics.setColor(new Color(250, 128, 114, 25));
				graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);// paint background
				graphics.setColor(new Color(250, 128, 114, 25));
				graphics.drawRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);// paint border
			}
		};
		txtApellidos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtApellidos.setBorder(null);
		txtApellidos.setBounds(455, 56, 238, 29);
		panelFormulario.add(txtApellidos);
		txtApellidos.setColumns(10);

		txtDni = new JTextField() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Dimension arcs = new Dimension(25, 25); // Border corners arcs {width,height}, change this to whatever
														// you want
				int width = getWidth();
				int height = getHeight();
				Graphics2D graphics = (Graphics2D) g;
				graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				// Draws the rounded panel with borders.
				graphics.setColor(new Color(250, 128, 114, 25));
				graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);// paint background
				graphics.setColor(new Color(250, 128, 114, 25));
				graphics.drawRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);// paint border
			}
		};
		txtDni.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtDni.setBorder(null);
		txtDni.setBounds(778, 56, 262, 29);
		panelFormulario.add(txtDni);
		txtDni.setColumns(10);

		txtUsuario = new JTextField() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Dimension arcs = new Dimension(25, 25); // Border corners arcs {width,height}, change this to whatever
														// you want
				int width = getWidth();
				int height = getHeight();
				Graphics2D graphics = (Graphics2D) g;
				graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				// Draws the rounded panel with borders.
				graphics.setColor(new Color(250, 128, 114, 25));
				graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);// paint background
				graphics.setColor(new Color(250, 128, 114, 25));
				graphics.drawRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);// paint border
			}
		};
		txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtUsuario.setBorder(null);
		txtUsuario.setBounds(116, 197, 227, 29);
		panelFormulario.add(txtUsuario);
		txtUsuario.setColumns(10);

		txtContrasenia = new JTextField() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Dimension arcs = new Dimension(25, 25); // Border corners arcs {width,height}, change this to whatever
														// you want
				int width = getWidth();
				int height = getHeight();
				Graphics2D graphics = (Graphics2D) g;
				graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

				// Draws the rounded panel with borders.
				graphics.setColor(new Color(250, 128, 114, 25));
				graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);// paint background
				graphics.setColor(new Color(250, 128, 114, 25));
				graphics.drawRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height);// paint border
			}
		};
		txtContrasenia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtContrasenia.setBorder(null);
		txtContrasenia.setBounds(465, 197, 228, 29);
		panelFormulario.add(txtContrasenia);
		txtContrasenia.setColumns(10);

		separator_1_2 = new JSeparator();
		separator_1_2.setForeground(new Color(128, 0, 0));
		separator_1_2.setBounds(10, 279, 1074, 15);
		panelFormulario.add(separator_1_2);

		comboBoxGrupo = new JComboBox();
		comboBoxGrupo
				.setModel(new DefaultComboBoxModel(new String[] { "Desarrollo de Aplicaciones Multiplataforma- DAM",
						"Administrador de Sistemas de Redes- ASIR", "Desarrollo de Aplicaciones Web- DAW" }));
		comboBoxGrupo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxGrupo.setForeground(Color.BLACK);
		comboBoxGrupo.setBounds(437, 343, 460, 20);
		panelFormulario.add(comboBoxGrupo);

		comboBoxCentro = new JComboBox();
		comboBoxCentro.setModel(new DefaultComboBoxModel(new String[] { "Villaviciosa de Odon", "Alcobendas" }));
		comboBoxCentro.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxCentro.setForeground(Color.BLACK);
		comboBoxCentro.setBounds(116, 343, 227, 20);
		panelFormulario.add(comboBoxCentro);

		btnModificar = new JButton("Guardar");
		btnModificar.setBounds(811, 194, 127, 24);
		contentPane.add(btnModificar);
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 17));

		btnVolver = new JButton("Volver");
		btnVolver.setBounds(641, 194, 145, 24);
		contentPane.add(btnVolver);
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 17));

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnCancelar.setBounds(985, 192, 117, 29);
		contentPane.add(btnCancelar);

	}

	public void setControlador(Controlador miC) {// crear atributos antes
		this.miC = miC;
	}
}

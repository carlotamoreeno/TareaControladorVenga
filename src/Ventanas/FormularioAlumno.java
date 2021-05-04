package Ventanas;
/**
 * @author carlota
 */

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
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
import javax.swing.DefaultComboBoxModel;

public class FormularioAlumno extends JFrame implements Ventana{
	
	private Controlador miC;// Atributo controlador
	
	private JSeparator separator_1_1, separator_2_1, separator_3_1;
	private JPanel contentPane, panelMenu;
	private JLabel lblImgLogo, lblTitulo, lblDni, lblApellidos, lblFnacimiento, lblNacionalidad, lblNombre,
			lblExpediente, lblFinicio, lblFfin, lblAnoAcad, lblHorario, lblTempresa, lblEmpresa;
	private JTextField textNombre, textApellidos, textDni, textFnacimiento, textNacionalidad, textExpediente,
			textFinicio, textHorario, textFfin, textTempresa, textAnoAcad;
	private JCheckBox chckbxNewCheckBox;
	private JLabel lnlAnexo3;
	private JLabel lnlAnexo5;
	private JLabel lnlAnexo6;
	private JLabel lnlAnexo7;
	private JLabel lnlAnexo8;
	private JSeparator separator_3;
	private JSeparator separator_4;
	private JSeparator separator_5;
	private JSeparator separator_6;
	private JSeparator separator_7;
	private JSeparator separator_2;
	private JSeparator separator_8;
	private JSeparator separator_9;
	private JSeparator separator_10;
	private JRadioButton rdbtnNewRadioButton;
	private JComboBox comboBoxEmpresa;
	private JButton btnModificar;
	private JButton btnVolver;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JRadioButton rdbtnNewRadioButton_3;
	private JRadioButton rdbtnNewRadioButton_4;
	private JButton btnCancelar;

	public FormularioAlumno() {
		setTitle("FormularioAlumno");
		setBounds(100, 100, 1221, 800);
		//setBounds(100, 100, 1226, 905);
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
		// panelMenu.setBackground(new Color(217, 63, 49));
		panelMenu.setBounds(159, 48, 1043, 59);
		contentPane.add(panelMenu);
		panelMenu.setLayout(null);
		lblTitulo = new JLabel("Formulario Alumno");
		lblTitulo.setBounds(717, 6, 309, 47);
		panelMenu.add(lblTitulo);
		lblTitulo.setBackground(new Color(238, 238, 238));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Dialog", Font.PLAIN, 33));
		
		
		lblImgLogo = new JLabel("");
		lblImgLogo.setIcon(new ImageIcon(AyudaListas.class.getResource("/img/logo.png")));
		lblImgLogo.setBounds(35, 31, 90, 90);
		contentPane.add(lblImgLogo);

		
				
		btnModificar = new JButton("Guardar");
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnModificar.setBounds(798, 699, 127, 29);
		contentPane.add(btnModificar);
		
		btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnVolver.setBounds(635, 699, 145, 29);
		contentPane.add(btnVolver);

		JPanel panelFormulaio = new JPanel() {
			protected void paintComponent(Graphics g) {
			}
		};
		panelFormulaio.setBorder(new LineBorder(new Color(165, 42, 42)));
		panelFormulaio.setBackground(UIManager.getColor("CheckBox.light"));
		panelFormulaio.setLayout(null);
		panelFormulaio.setBounds(91, 132, 1043, 533);
		contentPane.add(panelFormulaio);

		lblNombre = new JLabel("Nombre:");
		lblNombre.setForeground(Color.BLACK);
		lblNombre.setBackground(UIManager.getColor("Button.light"));
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNombre.setBounds(41, 35, 66, 31);
		panelFormulaio.add(lblNombre);

		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBackground(UIManager.getColor("Button.light"));
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblApellidos.setBounds(373, 35, 70, 31);
		panelFormulaio.add(lblApellidos);

		lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblDni.setBackground(UIManager.getColor("Button.light"));
		lblDni.setBounds(717, 35, 43, 31);
		panelFormulaio.add(lblDni);

		lblFnacimiento = new JLabel("Fecha Nacimiento:");
		lblFnacimiento.setBackground(UIManager.getColor("Button.light"));
		lblFnacimiento.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFnacimiento.setBounds(41, 99, 147, 31);
		panelFormulaio.add(lblFnacimiento);

		lblNacionalidad = new JLabel("Nacionalidad:");
		lblNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNacionalidad.setBackground(UIManager.getColor("Button.light"));
		lblNacionalidad.setBounds(373, 99, 110, 31);
		panelFormulaio.add(lblNacionalidad);

		lblExpediente = new JLabel("Expediente:");
		lblExpediente.setBackground(UIManager.getColor("Button.light"));
		lblExpediente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblExpediente.setBounds(717, 99, 100, 20);
		panelFormulaio.add(lblExpediente);

		lblFinicio = new JLabel("Fecha Inicio:");
		lblFinicio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFinicio.setBackground(UIManager.getColor("Button.light"));
		lblFinicio.setBounds(41, 182, 90, 31);
		panelFormulaio.add(lblFinicio);

		lblFfin = new JLabel("Fecha Fin:");
		lblFfin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblFfin.setBackground(UIManager.getColor("Button.light"));
		lblFfin.setBounds(373, 182, 121, 20);
		panelFormulaio.add(lblFfin);

		lblAnoAcad = new JLabel("A\u00F1o Academico:");
		lblAnoAcad.setBackground(UIManager.getColor("Button.light"));
		lblAnoAcad.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAnoAcad.setBounds(717, 182, 122, 20);
		panelFormulaio.add(lblAnoAcad);

		lblHorario = new JLabel("Horario:");
		lblHorario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHorario.setBounds(38, 247, 66, 31);
		panelFormulaio.add(lblHorario);

		lblTempresa = new JLabel("Tutor Empresa:");
		lblTempresa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTempresa.setBackground(UIManager.getColor("Button.light"));
		lblTempresa.setBounds(370, 247, 147, 20);
		panelFormulaio.add(lblTempresa);

		lblEmpresa = new JLabel("Empresa:");
		lblEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblEmpresa.setBackground(UIManager.getColor("Button.light"));
		lblEmpresa.setBounds(714, 247, 110, 20);
		panelFormulaio.add(lblEmpresa);

		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(128, 0, 0));
		separator.setBounds(17, 157, 1007, 15);
		panelFormulaio.add(separator);

		textNombre = new JTextField() {
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
		textNombre.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textNombre.setBorder(null);
		textNombre.setBounds(119, 35, 227, 29);
		panelFormulaio.add(textNombre);
		textNombre.setColumns(10);

		textApellidos = new JTextField() {
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
		textApellidos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textApellidos.setBorder(null);
		textApellidos.setBounds(458, 35, 227, 29);
		panelFormulaio.add(textApellidos);
		textApellidos.setColumns(10);

		textDni = new JTextField() {
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
		textDni.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textDni.setBorder(null);
		textDni.setBounds(781, 35, 227, 29);
		panelFormulaio.add(textDni);
		textDni.setColumns(10);

		textFnacimiento = new JTextField() {
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
		textFnacimiento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFnacimiento.setToolTipText("dd/mm/yyyy");
		textFnacimiento.setBorder(null);
		textFnacimiento.setBounds(187, 99, 159, 29);
		panelFormulaio.add(textFnacimiento);
		textFnacimiento.setColumns(10);

		textNacionalidad = new JTextField() {
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
		textNacionalidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textNacionalidad.setBorder(null);
		textNacionalidad.setBounds(491, 99, 194, 29);
		panelFormulaio.add(textNacionalidad);
		textNacionalidad.setColumns(10);

		textExpediente = new JTextField() {
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
		textExpediente.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textExpediente.setBorder(null);
		textExpediente.setBounds(832, 99, 179, 29);
		panelFormulaio.add(textExpediente);
		textExpediente.setColumns(10);

		textFinicio = new JTextField() {
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
		textFinicio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFinicio.setToolTipText("dd/mm/yyyy");
		textFinicio.setBorder(null);
		textFinicio.setBounds(151, 182, 195, 29);
		panelFormulaio.add(textFinicio);
		textFinicio.setColumns(10);

		textHorario = new JTextField() {
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
		textHorario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textHorario.setBorder(null);
		textHorario.setBounds(117, 247, 226, 29);
		panelFormulaio.add(textHorario);
		textHorario.setColumns(10);

		textFfin = new JTextField() {
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
		textFfin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textFfin.setToolTipText("dd/mm/yyyy");
		textFfin.setBorder(null);
		textFfin.setBounds(458, 182, 227, 29);
		panelFormulaio.add(textFfin);
		textFfin.setColumns(10);

		textTempresa = new JTextField() {
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
		textTempresa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textTempresa.setBorder(null);
		textTempresa.setBounds(488, 247, 194, 29);
		panelFormulaio.add(textTempresa);
		textTempresa.setColumns(10);

		textAnoAcad = new JTextField() {
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
		textAnoAcad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textAnoAcad.setBorder(null);
		textAnoAcad.setBounds(849, 182, 159, 29);
		panelFormulaio.add(textAnoAcad);
		textAnoAcad.setColumns(10);
		
		JPanel panelanexo = new JPanel() {
			protected void paintComponent(Graphics g) {
			}
		};
		panelanexo.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panelanexo.setBackground(Color.WHITE);
		panelanexo.setLayout(null);
		panelanexo.setBounds(38, 312, 980, 194);
		panelFormulaio.add(panelanexo);
		
		rdbtnNewRadioButton = new JRadioButton("Completed");
		rdbtnNewRadioButton.setBounds(33, 114, 125, 21);
		panelanexo.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnNewRadioButton.setBackground(Color.WHITE);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Completed");
		rdbtnNewRadioButton_1.setBounds(242, 114, 125, 21);
		panelanexo.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnNewRadioButton_1.setBackground(Color.WHITE);
		
		rdbtnNewRadioButton_2 = new JRadioButton("Completed");
		rdbtnNewRadioButton_2.setBounds(440, 114, 125, 21);
		panelanexo.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnNewRadioButton_2.setBackground(Color.WHITE);
		
		rdbtnNewRadioButton_3 = new JRadioButton("Completed");
		rdbtnNewRadioButton_3.setBounds(633, 114, 125, 21);
		panelanexo.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnNewRadioButton_3.setBackground(Color.WHITE);
		
		rdbtnNewRadioButton_4 = new JRadioButton("Completed");
		rdbtnNewRadioButton_4.setBounds(826, 114, 125, 21);
		panelanexo.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnNewRadioButton_4.setBackground(Color.WHITE);
		
		separator_2 = new JSeparator();
		separator_2.setBounds(0, 56, 980, 15);
		separator_2.setPreferredSize(new Dimension(30, 1));
		panelanexo.add(separator_2);
		separator_2.setForeground(Color.BLACK);
		separator_2.setBackground(Color.BLACK);
		
		
		lnlAnexo3 = new JLabel("Anexo 3");
		lnlAnexo3.setBounds(6, 6, 172, 53);
		panelanexo.add(lnlAnexo3);
		lnlAnexo3.setForeground(new Color(0, 0, 0));
		lnlAnexo3.setHorizontalAlignment(SwingConstants.CENTER);
		lnlAnexo3.setBackground(Color.RED);
		lnlAnexo3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		lnlAnexo5 = new JLabel("Anexo 5");
		lnlAnexo5.setBounds(218, 9, 174, 46);
		panelanexo.add(lnlAnexo5);
		lnlAnexo5.setForeground(new Color(0, 0, 0));
		lnlAnexo5.setHorizontalAlignment(SwingConstants.CENTER);
		lnlAnexo5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lnlAnexo5.setBackground(Color.RED);
		
		separator_3 = new JSeparator();
		separator_3.setBounds(196, 0, 12, 194);
		panelanexo.add(separator_3);
		separator_3.setPreferredSize(new Dimension(30, 3));
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setForeground(Color.BLACK);
		separator_3.setBackground(Color.BLACK);
		
		separator_4 = new JSeparator();
		separator_4.setBounds(395, 0, 12, 194);
		panelanexo.add(separator_4);
		separator_4.setPreferredSize(new Dimension(30, 3));
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setForeground(Color.BLACK);
		separator_4.setBackground(Color.BLACK);
		
		separator_5 = new JSeparator();
		separator_5.setBounds(587, 0, 12, 194);
		panelanexo.add(separator_5);
		separator_5.setPreferredSize(new Dimension(30, 3));
		separator_5.setOrientation(SwingConstants.VERTICAL);
		separator_5.setForeground(Color.BLACK);
		separator_5.setBackground(Color.BLACK);
		
		lnlAnexo6 = new JLabel("Anexo 6");
		lnlAnexo6.setBounds(406, 9, 179, 46);
		panelanexo.add(lnlAnexo6);
		lnlAnexo6.setHorizontalAlignment(SwingConstants.CENTER);
		lnlAnexo6.setForeground(new Color(0, 0, 0));
		lnlAnexo6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lnlAnexo6.setBackground(Color.RED);
		
		lnlAnexo7 = new JLabel("Anexo 7");
		lnlAnexo7.setBounds(611, 9, 162, 46);
		panelanexo.add(lnlAnexo7);
		lnlAnexo7.setForeground(new Color(0, 0, 0));
		lnlAnexo7.setHorizontalAlignment(SwingConstants.CENTER);
		lnlAnexo7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lnlAnexo7.setBackground(Color.RED);
		
		lnlAnexo8 = new JLabel("Anexo 8");
		lnlAnexo8.setBounds(795, 9, 162, 46);
		panelanexo.add(lnlAnexo8);
		lnlAnexo8.setForeground(new Color(0, 0, 0));
		lnlAnexo8.setHorizontalAlignment(SwingConstants.CENTER);
		lnlAnexo8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lnlAnexo8.setBackground(Color.RED);
		
		separator_6 = new JSeparator();
		separator_6.setBounds(784, 0, 12, 194);
		panelanexo.add(separator_6);
		separator_6.setPreferredSize(new Dimension(30, 3));
		separator_6.setOrientation(SwingConstants.VERTICAL);
		separator_6.setForeground(Color.BLACK);
		separator_6.setBackground(Color.BLACK);
		
		comboBoxEmpresa = new JComboBox();
		comboBoxEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBoxEmpresa.setModel(new DefaultComboBoxModel(new String[] {"Deloite", "Accenture", "Telefonica", "Apple", "Movistar"}));
		comboBoxEmpresa.setForeground(Color.BLACK);
		comboBoxEmpresa.setBounds(797, 249, 227, 20);
		panelFormulaio.add(comboBoxEmpresa);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnCancelar.setBounds(943, 699, 145, 29);
		contentPane.add(btnCancelar);
						
						
	}
	public void setControlador(Controlador miC) {// crear atributos antes
		this.miC = miC;
	}
}
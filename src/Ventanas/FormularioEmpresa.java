package Ventanas;

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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
/**
 * 
 * @author ana
 *
 */
public class FormularioEmpresa extends JFrame implements Ventana{
	
	private Controlador miC;// Atributo controlador

	private JPanel contentPane;
	private JLabel lblImgLogo;
	private JPanel panelMenu;
	private JLabel lblTitulo;

	private JLabel lblNombre, lblCiff, lblDireccion, lblTelefono, lblLocalidad, lblRepresentante, lblEmail,lblNconvenio,lblAnexo1;

	private JTextField txtNombre, txtCiff, txtDireccion, txtTelefono, txtLocalidad, txtRepresentante, txtEmail,txtNconvenio,txtAnexo1;

	private JButton btnGuardar;
	private JPanel panelFormulario;
	private JButton btnCancelar;
	private JButton btnAyuda;


	public FormularioEmpresa() {
		setTitle("Formulario Empresa");
		setBounds(100, 100, 1221, 800);
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

		lblTitulo = new JLabel("Formulario Empresa");
		lblTitulo.setBounds(638, 6, 342, 47);
		panelMenu.add(lblTitulo);
		lblTitulo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Dialog", Font.PLAIN, 33));

		lblImgLogo = new JLabel("");
		lblImgLogo.setIcon(new ImageIcon(AyudaListas.class.getResource("/img/logo.png")));
		lblImgLogo.setBounds(35, 31, 90, 90);
		contentPane.add(lblImgLogo);

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
		txtNombre.setBounds(194, 300, 184, 29);
		txtNombre.setOpaque(false);
		// txtNombre.setBorder(new LineBorder(Color.RED, 2));
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);

		txtDireccion = new JTextField() {
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
		txtDireccion.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtDireccion.setBorder(null);
		txtDireccion.setBounds(223, 510, 184, 29);
		txtDireccion.setOpaque(false);
		// txtNombre.setBorder(new LineBorder(Color.RED, 2));
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);

		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.setBounds(909, 652, 117, 29);
		contentPane.add(btnGuardar);
		
		panelFormulario = new JPanel();
		panelFormulario.setBorder(new LineBorder(new Color(128, 0, 0)));
		panelFormulario.setBackground(UIManager.getColor("CheckBox.light"));
		panelFormulario.setBounds(54, 240, 1105, 360);
		contentPane.add(panelFormulario);
		panelFormulario.setLayout(null);
		
				lblCiff = new JLabel("CIFF:");
				lblCiff.setBounds(39, 165, 55, 33);
				panelFormulario.add(lblCiff);
				lblCiff.setHorizontalAlignment(SwingConstants.LEFT);
				lblCiff.setFont(new Font("Tahoma", Font.PLAIN, 16));
				
						lblDireccion = new JLabel("Direcci\u00F3n:");
						lblDireccion.setBounds(39, 267, 90, 33);
						panelFormulario.add(lblDireccion);
						lblDireccion.setHorizontalAlignment(SwingConstants.LEFT);
						lblDireccion.setFont(new Font("Tahoma", Font.PLAIN, 16));
						
								lblNombre = new JLabel("Nombre:");
								lblNombre.setBounds(39, 54, 73, 33);
								panelFormulario.add(lblNombre);
								lblNombre.setHorizontalAlignment(SwingConstants.LEFT);
								lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
								
										txtCiff = new JTextField() {
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
										txtCiff.setBackground(Color.WHITE);
										txtCiff.setBounds(114, 167, 184, 29);
										panelFormulario.add(txtCiff);
										txtCiff.setFont(new Font("Tahoma", Font.PLAIN, 15));
										txtCiff.setBorder(null);
										txtCiff.setOpaque(false);
										txtCiff.setColumns(10);
										
												
												lblEmail = new JLabel("Email:");
												lblEmail.setBounds(344, 165, 47, 33);
												panelFormulario.add(lblEmail);
												lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
												lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
												
												lblNconvenio = new JLabel("N\u00BA Convenio:");
												lblNconvenio.setBounds(344, 267, 117, 33);
												panelFormulario.add(lblNconvenio);
												lblNconvenio.setHorizontalAlignment(SwingConstants.LEFT);
												lblNconvenio.setFont(new Font("Tahoma", Font.PLAIN, 16));
												
														lblRepresentante = new JLabel("Representante:");
														lblRepresentante.setBounds(344, 54, 133, 33);
														panelFormulario.add(lblRepresentante);
														lblRepresentante.setHorizontalAlignment(SwingConstants.LEFT);
														lblRepresentante.setFont(new Font("Tahoma", Font.PLAIN, 16));
														
																txtEmail = new JTextField() {
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
																txtEmail.setBounds(413, 167, 184, 29);
																panelFormulario.add(txtEmail);
																txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
																txtEmail.setBorder(null);
																txtEmail.setOpaque(false);
																txtEmail.setColumns(10);
																
																		txtAnexo1 = new JTextField() {
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
																		txtAnexo1.setBounds(833, 56, 184, 29);
																		panelFormulario.add(txtAnexo1);
																		txtAnexo1.setFont(new Font("Tahoma", Font.PLAIN, 15));
																		txtAnexo1.setToolTipText("dd/mm/yyyy");
																		txtAnexo1.setBorder(null);
																		txtAnexo1.setOpaque(false);
																		txtAnexo1.setColumns(10);
																		
																				txtRepresentante = new JTextField() {
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
																				txtRepresentante.setBounds(487, 56, 184, 29);
																				panelFormulario.add(txtRepresentante);
																				txtRepresentante.setFont(new Font("Tahoma", Font.PLAIN, 15));
																				txtRepresentante.setBorder(null);
																				txtRepresentante.setOpaque(false);
																				
																						lblTelefono = new JLabel("Tel\u00E9fono:");
																						lblTelefono.setBounds(742, 165, 90, 33);
																						panelFormulario.add(lblTelefono);
																						lblTelefono.setHorizontalAlignment(SwingConstants.LEFT);
																						lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 16));
																						
																								lblLocalidad = new JLabel("Localidad:");
																								lblLocalidad.setBounds(742, 267, 90, 33);
																								panelFormulario.add(lblLocalidad);
																								lblLocalidad.setHorizontalAlignment(SwingConstants.LEFT);
																								lblLocalidad.setFont(new Font("Tahoma", Font.PLAIN, 16));
																								
																										
																										lblAnexo1 = new JLabel("Anexo 1:");
																										lblAnexo1.setBounds(742, 54, 83, 33);
																										panelFormulario.add(lblAnexo1);
																										lblAnexo1.setHorizontalAlignment(SwingConstants.LEFT);
																										lblAnexo1.setFont(new Font("Tahoma", Font.PLAIN, 16));
																										
																												txtTelefono = new JTextField() {
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
																												txtTelefono.setBounds(842, 167, 184, 29);
																												panelFormulario.add(txtTelefono);
																												txtTelefono.setFont(new Font("Tahoma", Font.PLAIN, 15));
																												txtTelefono.setBorder(null);
																												txtTelefono.setOpaque(false);
																												txtTelefono.setColumns(10);
																												
																														txtLocalidad = new JTextField() {
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
																														txtLocalidad.setBounds(842, 267, 184, 29);
																														panelFormulario.add(txtLocalidad);
																														txtLocalidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
																														txtLocalidad.setBorder(null);
																														txtLocalidad.setOpaque(false);
																														txtLocalidad.setColumns(10);
																														txtLocalidad.setColumns(10);
																														
																																txtNconvenio = new JTextField() {
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
																																txtNconvenio.setBounds(487, 269, 184, 29);
																																panelFormulario.add(txtNconvenio);
																																txtNconvenio.setBackground(Color.WHITE);
																																txtNconvenio.setFont(new Font("Tahoma", Font.PLAIN, 15));
																																txtNconvenio.setBorder(null);
																																txtNconvenio.setOpaque(false);
																																txtNconvenio.setColumns(10);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(54, 652, 117, 29);
		contentPane.add(btnCancelar);
		
		btnAyuda = new JButton("Ayuda");
		btnAyuda.setBounds(1045, 652, 117, 29);
		contentPane.add(btnAyuda);
	}
	public void setControlador(Controlador miC) {// crear atributos antes
		this.miC = miC;
	}

}

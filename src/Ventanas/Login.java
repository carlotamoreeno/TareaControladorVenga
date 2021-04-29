package Ventanas;

/**
 * @author carlota
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
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Component;
import javax.swing.border.LineBorder;
import java.awt.event.MouseMotionAdapter;

public class Login extends JFrame implements Ventana {

	private Controlador miC;// Atributo controlador

	private JPanel contentPane;
	private JLabel lblParte1, lblUsuario;
	private JTextField textUsuario, textContra;
	private JButton btnLogin;
	private JLabel lblfoto2;

	public Login() {
		setBackground(new Color(248, 248, 255));
		setTitle("Login");
		setBounds(100, 100, 1221, 789);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 253, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblParte1 = new JLabel("");
		lblParte1.setBounds(0, 0, 610, 763);
		contentPane.add(lblParte1);
		ImageIcon imagenuno = new ImageIcon(AyudaListas.class.getResource("/img/Foto3.JPEG"));
		Icon iconouno = new ImageIcon(imagenuno.getImage().getScaledInstance(lblParte1.getWidth(),
				lblParte1.getHeight(), Image.SCALE_DEFAULT));
		lblParte1.setIcon(iconouno);

		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setForeground(new Color(0, 0, 0));
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblUsuario.setBounds(763, 208, 134, 33);
		contentPane.add(lblUsuario);

		JLabel lblContrasenia = new JLabel("Contrase\u00F1a:");
		lblContrasenia.setForeground(new Color(0, 0, 0));
		lblContrasenia.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblContrasenia.setBounds(763, 365, 144, 23);
		contentPane.add(lblContrasenia);

		textUsuario = new JTextField() {
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
		textUsuario.setForeground(Color.WHITE);
		textUsuario.setFont(new Font("Source Sans Pro ExtraLight", Font.PLAIN, 25));
		textUsuario.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.BLACK));
		// textUsuario.setBackground(Color.LIGHT_GRAY);

		textUsuario.setBounds(763, 253, 314, 38);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);

		textContra = new JTextField() {
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
		textContra.setForeground(Color.WHITE);
		textContra.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textContra.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.BLACK));
		// textContra.setBackground(Color.LIGHT_GRAY);
		textContra.setBounds(763, 400, 314, 38);
		contentPane.add(textContra);
		textContra.setColumns(10);

		btnLogin = new JButton("Login");
		btnLogin.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
			}
		});
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			}
		});

		btnLogin.setBackground(Color.LIGHT_GRAY);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnLogin.setBounds(763, 500, 314, 33);
		contentPane.add(btnLogin);

	}

	public void setControlador(Controlador miC) {// crear atributos antes
		this.miC = miC;
	}
}

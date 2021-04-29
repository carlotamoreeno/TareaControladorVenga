package Ventanas;

/**
 * @author ana
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
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

import Ventanas.Alumnos.HorizontalAlignmentHeaderRenderer;

import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Empresas extends JFrame implements Ventana {
	
	private Controlador miC;// Atributo controlador

	private JPanel contentPane, panelMenu;
	private JLabel lblImgLogo, lblLogout, lblAlumnos, lblEmpresas, lblConsultas, lblAyuda,lblTitulo,lblTutores;
	private JSeparator separator_0, separator_1, separator_2, separator_3,separator_4;
	private JTable table;
	private JButton btnModificar;
	
	public Empresas() {
		setTitle("Empresas");
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

		lblAlumnos = new JLabel("Alumnos");
		lblAlumnos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblAlumnos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		lblAlumnos.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlumnos.setForeground(Color.WHITE);
		lblAlumnos.setFont(new Font("Oriya Sangam MN", Font.PLAIN, 20));
		lblAlumnos.setBounds(389, 6, 130, 47);
		panelMenu.add(lblAlumnos);

		separator_0 = new JSeparator();
		separator_0.setOrientation(SwingConstants.VERTICAL);
		separator_0.setForeground(new Color(0, 0, 0));
		separator_0.setBackground(new Color(0, 0, 0));
		separator_0.setBounds(521, 6, 12, 47);
		separator_0.setPreferredSize(new Dimension(30, 3));
		panelMenu.add(separator_0);

		lblEmpresas = new JLabel("Empresas");
		lblEmpresas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblEmpresas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		lblEmpresas.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmpresas.setForeground(Color.WHITE);
		lblEmpresas.setFont(new Font("Oriya Sangam MN", Font.PLAIN, 20));
		lblEmpresas.setBounds(543, 6, 111, 47);
		panelMenu.add(lblEmpresas);

		separator_1 = new JSeparator();
		separator_1.setPreferredSize(new Dimension(30, 3));
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(Color.BLACK);
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(666, 6, 12, 47);
		panelMenu.add(separator_1);

		lblConsultas = new JLabel("Consultas");
		lblConsultas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblConsultas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		lblConsultas.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsultas.setForeground(Color.WHITE);
		lblConsultas.setFont(new Font("Oriya Sangam MN", Font.PLAIN, 20));
		lblConsultas.setBounds(686, 6, 119, 47);
		panelMenu.add(lblConsultas);

		separator_2 = new JSeparator();
		separator_2.setPreferredSize(new Dimension(30, 3));
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setForeground(Color.BLACK);
		separator_2.setBackground(Color.BLACK);
		separator_2.setBounds(817, 6, 12, 47);
		panelMenu.add(separator_2);

		lblAyuda = new JLabel("Ayuda");
		lblAyuda.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblAyuda.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		lblAyuda.setHorizontalAlignment(SwingConstants.CENTER);
		lblAyuda.setForeground(Color.WHITE);
		lblAyuda.setFont(new Font("Oriya Sangam MN", Font.PLAIN, 20));
		lblAyuda.setBounds(841, 6, 69, 47);
		panelMenu.add(lblAyuda);

		separator_3 = new JSeparator();
		separator_3.setPreferredSize(new Dimension(30, 3));
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setForeground(Color.BLACK);
		separator_3.setBackground(Color.BLACK);
		separator_3.setBounds(922, 6, 12, 47);
		panelMenu.add(separator_3);

		lblLogout = new JLabel("Logout");
		lblLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblLogout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		lblLogout.setFont(new Font("Oriya Sangam MN", Font.PLAIN, 20));
		lblLogout.setHorizontalAlignment(SwingConstants.CENTER);
		lblLogout.setBounds(947, 6, 79, 47);
		lblLogout.setForeground(new Color(255, 255, 255));
		panelMenu.add(lblLogout);

		lblImgLogo = new JLabel("");
		lblImgLogo.setIcon(new ImageIcon(AyudaListas.class.getResource("/img/logo.png")));
		lblImgLogo.setBounds(35, 31, 90, 90);
		contentPane.add(lblImgLogo);

		lblTutores = new JLabel("Tutores");
		lblTutores.setHorizontalAlignment(SwingConstants.CENTER);
		lblTutores.setForeground(Color.WHITE);
		lblTutores.setFont(new Font("Oriya Sangam MN", Font.PLAIN, 20));
		lblTutores.setBounds(247, 6, 130, 47);
		panelMenu.add(lblTutores);
		
		separator_4 = new JSeparator();
		separator_4.setPreferredSize(new Dimension(30, 3));
		separator_4.setOrientation(SwingConstants.VERTICAL);
		separator_4.setForeground(Color.BLACK);
		separator_4.setBackground(Color.BLACK);
		separator_4.setBounds(376, 6, 12, 47);
		panelMenu.add(separator_4);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(63, 199, 1098, 481);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		contentPane.add(scrollPane);

		table = new JTable();
		table.setShowVerticalLines(false);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//table.setSelectionBackground(new Color(204, 51, 51));
			}
		});
		table.setBackground(new Color(255, 255, 255));
		table.setForeground(new Color(0, 0, 0));
		table.setFont(new Font("Tahoma", Font.PLAIN, 18));
		//table.setSelectionBackground(new Color(204, 51, 51));
		table.setRowHeight(25);
		table.setIntercellSpacing(new Dimension(0, 0));
		table.setFocusable(false);
		table.setModel(new DefaultTableModel(
				new Object[][] { { " 01", "Deloite", "C/ fuencarral 29", "918273457", "Madrid", "Alberto", "deloite@gmail.com", "02-01-2020"},
					{ " 02", "Accenture", "C/ buena vista 2", "917364839", "Madrid", "Alberto", "accenture@gmail.com", "02-01-2020"},
					{ " 03", "Telefonica", "C/ Carretas 9", "918273475", "Madrid", "Alberto", "telefonica@gmail.com", "02-01-2020"},
					{ " 04", "Apple", "C/ Mala vista 6", "917364899", "Madrid", "Alberto", "apple@gmail.com", "02-01-2020"},
					{ " 05", "Movistar", "C/ San Bernardo", "918273444", "Madrid", "Alberto", "movistar@gmail.com", "02-01-2020"},},
				new String[] { "CIF", "Nombre", "Dirección", "Teléfono", "Localidad", "Representante", "Email","Anexo 1" }));
		table.setRowMargin(1);
		table.setGridColor(Color.BLACK);
		table.setShowHorizontalLines( true);
		table.getTableHeader().setOpaque(false);
		table.getTableHeader().setBackground(new Color(217, 63, 49));
		table.getTableHeader().setForeground(new Color(255,255, 255));
		table.getTableHeader().setPreferredSize(new Dimension(0, 45));
		table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 18));
		table.setRowHeight(45);
		DefaultTableCellRenderer centro = new DefaultTableCellRenderer();
		centro.setHorizontalAlignment(JLabel.CENTER);
		for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(centro);
			table.getColumnModel().getColumn(i)
					.setHeaderRenderer(new HorizontalAlignmentHeaderRenderer(SwingConstants.CENTER));
		}
		scrollPane.setViewportView(table);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnModificar.setBounds(771, 709, 128, 32);
		contentPane.add(btnModificar);

		JButton btnAniadir = new JButton("A\u00F1adir");
		btnAniadir.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnAniadir.setBounds(923, 709, 107, 32);
		contentPane.add(btnAniadir);

		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnBorrar.setBounds(1052, 709, 90, 32);
		contentPane.add(btnBorrar);

		lblTitulo = new JLabel("Empresas");
		lblTitulo.setBounds(64, 142, 182, 47);
		contentPane.add(lblTitulo);
		lblTitulo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitulo.setForeground(new Color(0, 0, 0));
		lblTitulo.setFont(new Font("Dialog", Font.PLAIN, 33));
	}
	class HorizontalAlignmentHeaderRenderer implements TableCellRenderer {
		private int horizontalAlignment = SwingConstants.CENTER;

		public HorizontalAlignmentHeaderRenderer(int horizontalAlignment) {
			this.horizontalAlignment = horizontalAlignment;
		}

		@Override
		public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
				int row, int column) {
			TableCellRenderer r = table.getTableHeader().getDefaultRenderer();
			JLabel l = (JLabel) r.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
			l.setHorizontalAlignment(horizontalAlignment);
			return l;
		}
	}
	public void setControlador(Controlador miC) {// crear atributos antes
		this.miC = miC;
	}
}

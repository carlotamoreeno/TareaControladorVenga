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
import java.awt.Component;
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
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import Ventanas.Tutores.HorizontalAlignmentHeaderRenderer;

import javax.swing.JCheckBox;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class Consultas extends JFrame implements Ventana {

	private Controlador miC;// Atributo controlador

	private JLabel lblImgLogo, lblLogout, lblAlumnos, lblEmpresas, lblConsultas, lblAyuda, lblTutores;
	private JSeparator separator_0, separator_1_1, separator_2_1, separator_3, separator_4;
	private JPanel contentPane, panelMenu;
	private JLabel lblTitulo;
	private JCheckBox chckbxNewCheckBox;
	private JTable table;
	private JLabel lblAlumnosPorTutor;
	private JButton btnInformeAseguradoras;
	private JButton btnAlumPorTutor;
	private JButton btnTutorPorCiclo;
	private JButton btnAlumPorEmpresa;
	private JButton btnInformeGeneralFCT;
	private JButton btnAlumEnPracticas;

	public Consultas() {
		setTitle("Consultas");
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

		separator_1_1 = new JSeparator();
		separator_1_1.setPreferredSize(new Dimension(30, 3));
		separator_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_1_1.setForeground(Color.BLACK);
		separator_1_1.setBackground(Color.BLACK);
		separator_1_1.setBounds(666, 6, 12, 47);
		panelMenu.add(separator_1_1);

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

		separator_2_1 = new JSeparator();
		separator_2_1.setPreferredSize(new Dimension(30, 3));
		separator_2_1.setOrientation(SwingConstants.VERTICAL);
		separator_2_1.setForeground(Color.BLACK);
		separator_2_1.setBackground(Color.BLACK);
		separator_2_1.setBounds(817, 6, 12, 47);
		panelMenu.add(separator_2_1);

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

		lblImgLogo = new JLabel("");
		lblImgLogo.setIcon(new ImageIcon(AyudaListas.class.getResource("/img/logo.png")));
		lblImgLogo.setBounds(35, 31, 90, 90);
		contentPane.add(lblImgLogo);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(245, 226, 933, 588);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// table.setSelectionBackground(new Color(204, 51, 51));
			}
		});
		table.setBackground(new Color(255, 255, 255));
		table.setForeground(new Color(0, 0, 0));
		table.setFont(new Font("Tahoma", Font.PLAIN, 18));
		table.setShowVerticalLines(false);
		// table.setSelectionBackground(new Color(204, 51, 51));
		table.setRowHeight(25);
		table.setIntercellSpacing(new Dimension(0, 0));
		table.setFocusable(false);
		table.setModel(new DefaultTableModel(new Object[][] { { "23495837P", "Juan", "Salinas", "01", "01" },
				{ "39847502M", "Susana", "Romero", "01", "02" }, { "23395837P", "Pedro", "Agudo", "01", "03" },
				{ "39997502M", "Ramon", "Inocencio", "01", "04" }, { "23497837K", "Antonio", "Salinas", "01", "05" }, },
				new String[] { "DNI", "Nombre", "Apellidos", "Centro", "Grupo" }));
		table.setRowMargin(1);
		table.setGridColor(Color.BLACK);
		table.setShowHorizontalLines(true);
		table.getTableHeader().setOpaque(false);
		table.getTableHeader().setBackground(new Color(217, 63, 49));
		table.getTableHeader().setForeground(new Color(255, 255, 255));
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

		btnAlumPorTutor = new JButton("Alumnos por tutor");
		btnAlumPorTutor.setBounds(40, 275, 175, 30);
		contentPane.add(btnAlumPorTutor);

		btnTutorPorCiclo = new JButton("Tutores por ciclo");
		btnTutorPorCiclo.setBounds(40, 365, 175, 30);
		contentPane.add(btnTutorPorCiclo);

		btnAlumPorEmpresa = new JButton("Alumnos por empresa");
		btnAlumPorEmpresa.setBounds(40, 455, 175, 30);
		contentPane.add(btnAlumPorEmpresa);

		btnAlumEnPracticas = new JButton("Alumnos en prácticas por tutor");
		btnAlumEnPracticas.setBounds(11, 545, 227, 30);
		contentPane.add(btnAlumEnPracticas);

		btnInformeGeneralFCT = new JButton("Informe general FCT");
		btnInformeGeneralFCT.setBounds(40, 641, 175, 30);
		contentPane.add(btnInformeGeneralFCT);

		JButton btnNewButton_5 = new JButton("Informe Aseguradoras");
		btnNewButton_5.setBounds(35, 880, 175, 30);
		contentPane.add(btnNewButton_5);

		lblTitulo = new JLabel("Consultas");
		lblTitulo.setBounds(35, 143, 157, 47);
		contentPane.add(lblTitulo);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(new Color(0, 0, 0));
		lblTitulo.setFont(new Font("Dialog", Font.PLAIN, 33));

		lblAlumnosPorTutor = new JLabel("Alumnos por tutor");
		lblAlumnosPorTutor.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlumnosPorTutor.setForeground(Color.BLACK);
		lblAlumnosPorTutor.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblAlumnosPorTutor.setBounds(246, 177, 209, 47);
		contentPane.add(lblAlumnosPorTutor);

		btnInformeAseguradoras = new JButton("Informe Aseguradoras");
		btnInformeAseguradoras.setBounds(40, 729, 175, 30);
		contentPane.add(btnInformeAseguradoras);

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

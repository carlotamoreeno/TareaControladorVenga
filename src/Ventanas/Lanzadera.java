package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JLabel;

public class Lanzadera extends JFrame {

	// TANTOS ATRIBUTOS COMO VENTANAS
	private Ventana[] misVentanas;

	Controlador miC = new Controlador();
	
	public static void main(String[] args) {

		Lanzadera frame = new Lanzadera();

	}

	public Lanzadera() {
		misVentanas = new Ventana[9];
		misVentanas[0] = new Alumnos();
		misVentanas[1] = new Consultas();
		misVentanas[2] = new Empresas();
		misVentanas[3] = new FormularioAlumno();
		misVentanas[4] = new FormularioEmpresa();
		misVentanas[5] = new FormularioTutores();
		misVentanas[6] = new Login();
		misVentanas[7] = new Tutores();
		misVentanas[8] = new Ayuda();

		
		miC.setVentana0(misVentanas[0]);// Controlador vea las ventanas metodos seters
		miC.setVentana1(misVentanas[1]);
		miC.setVentana2(misVentanas[2]);
		miC.setVentana3(misVentanas[3]);
		miC.setVentana4(misVentanas[4]);
		miC.setVentana5(misVentanas[5]);
		miC.setVentana6(misVentanas[6]);
		miC.setVentana7(misVentanas[7]);
		miC.setVentana8(misVentanas[8]);

		misVentanas[0].setControlador(miC);// Ventanas vean al controlador metodos seters
		misVentanas[1].setControlador(miC);
		misVentanas[2].setControlador(miC);
		misVentanas[3].setControlador(miC);
		misVentanas[4].setControlador(miC);
		misVentanas[5].setControlador(miC);
		misVentanas[6].setControlador(miC);
		misVentanas[7].setControlador(miC);
		misVentanas[8].setControlador(miC);

		misVentanas[8].setVisible(true);

	}
}

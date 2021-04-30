package Ventanas;

public class Controlador {
	private Ventana[] misVentanas = new Ventana[8];;

	public void setVentana0(Ventana ventana) {
		this.misVentanas[0] = ventana;
	}

	public void setVentana1(Ventana ventana) {
		this.misVentanas[1] = ventana;
	}

	public void setVentana2(Ventana ventana) {
		this.misVentanas[2] = ventana;
	}

	public void setVentana3(Ventana ventana) {
		this.misVentanas[3] = ventana;
	}

	public void setVentana4(Ventana ventana) {
		this.misVentanas[4] = ventana;
	}

	public void setVentana5(Ventana ventana) {
		this.misVentanas[5] = ventana;
	}

	public void setVentana6(Ventana ventana) {
		this.misVentanas[6] = ventana;
	}

	public void setVentana7(Ventana ventana) {
		this.misVentanas[7] = ventana;
	}

	public void setVentana8(Ventana ventana) {
		this.misVentanas[8] = ventana;
	}

	
	public void cerrarVentanas() {
		for (Ventana ventana : misVentanas) {
			ventana.setVisible(false);
		}
	}
	
	public void irVentana(String ventana) {
		this.cerrarVentanas();

		switch (ventana) {
		
			case "Logout":
				misVentanas[6].setVisible(true);
				break;
			case "Tutores":
				misVentanas[7].setVisible(true);
				break;
			case "btnAniadirTutores", "btnModificarTutores":
				misVentanas[5].setVisible(true);
				break;
			case "Alumnos","Login":
				misVentanas[0].setVisible(true);
				break;
			
			case "btnAniadirAlumnos", "btnModificarAlumnos":
				misVentanas[3].setVisible(true);
				break;
			case "Empresas":
				misVentanas[2].setVisible(true);
				break;
			case "btnModificarEmpresas","btnAniadirEmpresas":
				misVentanas[4].setVisible(true);
				break;
			case "Ayuda":
				misVentanas[4].setVisible(true);
				break;
			case "Consultas":
				misVentanas[1].setVisible(true);
				break;

		}
	}
}

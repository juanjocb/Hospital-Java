package clases.empleado;

import javax.swing.JOptionPane;

public class Medico extends EmpleadoPlantilla {

	private String especialidad;
	private int numeroDeConsultorio;

	@Override
	public void registrarDatos() {
		super.registrarDatos();

		especialidad = JOptionPane.showInputDialog("Ingrese su especialidad");
		numeroDeConsultorio = Integer.parseInt(JOptionPane.showInputDialog("numero de Consultorio"));

	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public int getNumeroDeConsultorio() {
		return numeroDeConsultorio;
	}

	public void setNumeroDeConsultorio(int numeroDeConsultorio) {
		this.numeroDeConsultorio = numeroDeConsultorio;
	}

}

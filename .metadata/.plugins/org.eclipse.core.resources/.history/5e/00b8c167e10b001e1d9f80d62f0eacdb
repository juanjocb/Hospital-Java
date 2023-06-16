package clases.empleado;

import javax.swing.JOptionPane;

public class EmpleadoEventual extends Empleado {

	private double honorariosPorHora;
	private String fechaTerminoContrato;

	@Override
	public void registrarDatos() {
		super.registrarDatos();

		honorariosPorHora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario mensual"));
		fechaTerminoContrato = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento (dd/mm/aaaa)");
	}
	
	@Override
	public void imprimirDatosPersona(String datos) {
		super.imprimirDatosPersona(datos);
		
		datos = "Honorarios por hora: " + honorariosPorHora + "\\n";
		datos += "Fecha termino del Contrato " + fechaTerminoContrato + "\\n";
		
		JOptionPane.showMessageDialog(null, datos);
	}

	public double getHonorariosPorHora() {
		return honorariosPorHora;
	}

	public void setHonorariosPorHora(double honorariosPorHora) {
		this.honorariosPorHora = honorariosPorHora;
	}

	public String getFechaTerminoContrato() {
		return fechaTerminoContrato;
	}

	public void setFechaTerminoContrato(String fechaTerminoContrato) {
		this.fechaTerminoContrato = fechaTerminoContrato;
	}

}

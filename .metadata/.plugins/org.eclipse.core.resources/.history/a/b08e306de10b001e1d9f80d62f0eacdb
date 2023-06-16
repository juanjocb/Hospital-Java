package clases.empleado;

import javax.swing.JOptionPane;

import clases.empleado.Empleado;

public class EmpleadoPlantilla extends Empleado {

	private double salarioMensual;
	private double porcentajeAdicionalPorHoraExtra;

	@Override
	public void registrarDatos() {
		super.registrarDatos();

		salarioMensual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario Mensual"));
		porcentajeAdicionalPorHoraExtra = Double
				.parseDouble(JOptionPane.showInputDialog("Ingrese el Porcentaje Adicional por Hora Extra"));

	}
	
	public void imprimirDatosPersona(String datos) {
		super.imprimirDatosPersona(datos);
		
		datos = "Salario Mensual: " + salarioMensual + "\n";
		datos = "Porcentaje Adicional Por Hora Extra: " + porcentajeAdicionalPorHoraExtra + "\n";
		
		JOptionPane.showMessageDialog(null, datos);
	}

	public double getSalarioMensual() {
		return salarioMensual;
	}

	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}

	public double getPorcentajeAdicionalPorHoraExtra() {
		return porcentajeAdicionalPorHoraExtra;
	}

	public void setPorcentajeAdicionalPorHoraExtra(double porcentajeAdicionalPorHoraExtra) {
		this.porcentajeAdicionalPorHoraExtra = porcentajeAdicionalPorHoraExtra;
	}

}

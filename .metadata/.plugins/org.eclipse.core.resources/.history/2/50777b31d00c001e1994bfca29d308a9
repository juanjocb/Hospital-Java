package clases;

import javax.swing.JOptionPane;

public class Persona {

	private String numeroDeDNI;
	private String nombre;
	private String apellido;
	private String fechaDeNacimiento;
	private String direccion;
	private String ciudadDeProcedencia;

	public void imprimirDatosPersona(String datos) {

		datos += "Nombre: " + nombre + "\n";
		datos += "Apellido : " + apellido + "\n";
		datos += "Fecha de Nacimiento: " + fechaDeNacimiento + "\n";
		datos += "Direcci�n: " + direccion + "\n";
		datos += "Ciudad de Procedencia: " + ciudadDeProcedencia + "\n";

		JOptionPane.showMessageDialog(null, datos);
	}

	public void registrarDatos() {

		numeroDeDNI = JOptionPane.showInputDialog("ingrese el numero del documento");
		nombre = JOptionPane.showInputDialog("ingrese el nombre");
		apellido = JOptionPane.showInputDialog("ingrese el apellido");
		fechaDeNacimiento = JOptionPane.showInputDialog("ingrese la Fecha de Nacimiento");
		direccion = JOptionPane.showInputDialog("ingrese su Direccion");
		ciudadDeProcedencia = JOptionPane.showInputDialog("ingrese la ciudad de Procedencia");

	}

	public String getNumeroDeDNI() {
		return numeroDeDNI;
	}

	public void setNumeroDeDNI(String numeroDeDNI) {
		this.numeroDeDNI = numeroDeDNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudadDeProcedencia() {
		return ciudadDeProcedencia;
	}

	public void setCiudadDeProcedencia(String ciudadDeProcedencia) {
		this.ciudadDeProcedencia = ciudadDeProcedencia;
	}

}

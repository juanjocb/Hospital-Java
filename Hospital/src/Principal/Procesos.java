package Principal;

import javax.swing.JOptionPane;

import clases.CitaMedica;
import clases.ModeloDatos;
import clases.Paciente;
import clases.empleado.EmpleadoEventual;
import clases.empleado.EmpleadoPlantilla;
import clases.empleado.Medico;

public class Procesos {

	ModeloDatos miModeloDatos;
	private Object menuImprimir;

	public Procesos() {
		miModeloDatos = new ModeloDatos();
		PresentarMenuOpciones();
	}

	private void PresentarMenuOpciones() {

		String menu = "MENU HOSPITAL\n\n";
		menu += "1. Registrar Paciente\n";
		menu += "2. Registrar Empleado \n";
		menu += "3. Registrar Cita Medica\n";
		menu += "4. Imprimir Informaci�n\n";
		menu += "5. Salir \n\n";
		menu += "Ingrese una Opci�n\n";

		int opcion = 0;

		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcion) {
			case 1:
				registrarPaciente();
				break;
			case 2:
				registrarEmpleado();
				break;
			case 3:
				registrarCitaMedica();
				break;
			case 4:
				if (miModeloDatos.validadDatos()) {
					imprimirInformacion();
				}
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "El sistema ha terminado!");
				break;
			default:
				JOptionPane.showInputDialog("No existe el codigo, verifique nuevamente");
				break;
			}
		} while (opcion != 5);

	}

	private void registrarPaciente() {
		Paciente miPaciente = new Paciente();
		miPaciente.registrarDatos();

		miModeloDatos.registrarPersona(miPaciente);
	}

	private void imprimirInformacion() {

		String menuImprimir = "MENU IMPRESIONES\n";
		menuImprimir += "1. Listar Pacientes\n";
		menuImprimir += "2. Listar Empleados Eventuales\n";
		menuImprimir += "3. Listar Empleados Por Plantilla\n";
		menuImprimir += "4. Listar Medicos\n";
		menuImprimir += "5. Listar Citas Programadas\n";
		menuImprimir += "Ingrese una opcion";

		int opcion = Integer.parseInt(JOptionPane.showInputDialog(menuImprimir));

		switch (opcion) {
		case 1:
			if (miModeloDatos.validarPacientes()) {
				miModeloDatos.imprimirPacientes();
			}
			break;
		case 2:
			if (miModeloDatos.validarEmpleadosEventualMap()) {
				miModeloDatos.imprimirEmpleadosEventuales();
			}

			break;
		case 3:
			if (miModeloDatos.validarEmpleadosPlantillaMap()) {
				miModeloDatos.imprimirEmpleadosPorPlantilla();
			}

			break;
		case 4:
			if (miModeloDatos.validarMedicosMap()) {
				miModeloDatos.imprimirMedicos();
			}

			break;
		case 5:
			if (miModeloDatos.validarCitasList()) {
				miModeloDatos.imprimirCitasMedicasProgramadas();
			}

			break;
		default:
			JOptionPane.showMessageDialog(null, "No existe esa opcion");
			break;
		}
	}

	private void registrarCitaMedica() {

		String documentoPaciente = JOptionPane.showInputDialog("Ingrese el documento del paciente");

		Paciente pacienteEncontrado = miModeloDatos.consultarPacientePorDocumento(documentoPaciente);

		if (pacienteEncontrado != null) {
			String nombreMedico = JOptionPane.showInputDialog("Ingrese el nombre del medico");
			Medico medicoEncontrado = miModeloDatos.consultarMedicoPorNombre(nombreMedico);

			if (medicoEncontrado != null) {
				String servicio = JOptionPane.showInputDialog("Ingrese el servicio o motivo de la consulta");
				String fechaConsulta = JOptionPane.showInputDialog("Ingrese la fecha de la Consulta");
				String horaConsulta = JOptionPane.showInputDialog("Ingrese la hora de la consulta");

				String lugar = "La cita sera en el consultorio " + medicoEncontrado.getNumeroDeConsultorio();

				CitaMedica miCita = new CitaMedica(pacienteEncontrado, medicoEncontrado, servicio, fechaConsulta,
						horaConsulta, lugar);
				miModeloDatos.registrarCitaMedica(miCita);

			} else {
				JOptionPane.showMessageDialog(null, "El medico no se encuentra registrado en el sistema");
			}
		} else {
			JOptionPane.showMessageDialog(null, "El paciente no se encuentra registrado en el sistema");
		}

	}

	private void registrarEmpleado() {

		String menuTipoEmpleado = "Registro de Empleado\n";
		menuTipoEmpleado += "1. Empleado Eventual\n";
		menuTipoEmpleado += "2. Empleado por Plantilla\n";
		menuTipoEmpleado += "Seleccione el tipo de empleado a registrar\n";

		int tipoEmpleado = Integer.parseInt(JOptionPane.showInputDialog(menuTipoEmpleado));

		switch (tipoEmpleado) {
		case 1:
			EmpleadoEventual miEmpleadoEventual = new EmpleadoEventual();
			miEmpleadoEventual.registrarDatos();
			miModeloDatos.registrarPersona(miEmpleadoEventual);
			break;
		case 2:
			String respo = JOptionPane
					.showInputDialog("Ingrese si, si es un medico, de lo contrario es otro tipo de empleado");
			if (respo.equalsIgnoreCase("si")) {
				Medico miMedico = new Medico();
				miMedico.registrarDatos();
				miModeloDatos.registrarPersona(miMedico);
			} else {
				EmpleadoPlantilla miEmpleadoPlantilla = new EmpleadoPlantilla();
				miEmpleadoPlantilla.registrarDatos();
				miModeloDatos.registrarPersona(miEmpleadoPlantilla);
			}
		default:
			JOptionPane.showMessageDialog(null, "El tipo de empleado es invalido, intentelo nuevamente");
			break;
		}

	}

}

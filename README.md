# Hospital-Java

Ejemplo de Hospital Java. Herencia

En este proyecto damos solución a un problema en java en donde se hara uso de la POO (Programación orientada a objetos).


PLANTEAMIENTO DEL PROBLEMA.

El departamento de Informática de un hospital está realizando un nuevo registro de datos de todas las personas que tienen
relación con esa institución, que son: los empleados, los médicos y los pacientes, Los empleados son categorizados en función de
si son contratados por Planilla o de forma Eventual y son los encargados de los procesos administrativos.
Los médicos (que podrían considerarse un tipo especial de empleados contratados por Planilla) se encargan de las atenciones de
las consultas médicas. 

Para solicitar una cita, el paciente es atendido por un empleado, el paciente indica el servicio en el cual quiere pasar consulta y el
empleado le indica el nombre del médico, la fecha y la hora de la cita.
Los atributos de cada uno de ellos se indican a continuación:
Persona: número de DNI, nombre, apellido, fecha de nacimiento, dirección, ciudad de procedencia.
Paciente: número de historia clínica, sexo, grupo sanguíneo, lista de medicamentos a los que es alérgico.
Empleado: código de Empleado, número de horas extras, fecha de ingreso, área, cargo.
Empleado por Planilla: salario mensual, porcentaje adicional por hora extra.
Empleado Eventual: honorarios por hora, fecha de término del contrato.
Médico: especialidad, número de consultorio.

Para desarrollar el sistema, en la clase Persona se deberá crear el método concreto imprimirDatosPersona(String datos), así
como un método registrarDatos() , y un método registrarCitaMedica() que sea implementados por las clases que lo requieran.
La aplicación a desarrollar debe permitir:
1. Registrar los datos de los empleados, los pacientes y los médicos.
2. Registrar los datos de una cita médica.
3. Imprimir los datos de cada persona.

Tenga en cuenta que lo anterior es solo el planteamiento inicial, usted deberá aplicar los conceptos de programación vistos hasta
el momento para dar solución al problema, deberá crear los métodos y clases que considere necesario, por ejemplo, en el
enunciado se le dice que debe crear un método llamado registrarDatos() en la clase persona pero debe analizar como registrar
Pacientes, empleados o médicos.


Actividades Prácticas.
Después de construir el sistema, se espera que haya podido analizar el código para entender su funcionamiento ya que de eso
depende el desarrollo de las siguientes actividades.
Teniendo en cuenta lo anterior, usted deberá complementar el sistema con las siguientes funcionalidades:

1. Cuando se intente imprimir información se debe validar si existen o no datos registrados (para cada opción de consulta
disponibles).

2. Cuando se consulte empleados por planilla, debería mostrar también a los médicos registrados (se debe presentar un mensaje
para que se note la diferenciación).

3. Valide para que el sistema no permita registro de pacientes, empleados o médicos duplicados.

4. Haga uso de excepciones (Try Catch) para controlar cuando una persona no ingresa un dato correcto (Por ejemplo cuando se
ingresa un texto en el numero de historia clínica del paciente, el sistema se cae) esto lo puede hacer en los métodos de
encapsulación.

5. Crear los métodos necesarios para consultar pacientes, empleados eventuales, empleados por planilla y médicos de forma
individual mediante el ingreso del documento de identidad.

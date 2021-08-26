package ejercicios.modificadores.acceso;

public class TerceraEdad extends Paciente {

	Paciente diagnostico = new Paciente();

	public void examenProstata() {
		
		System.out.println("Su nombre es: " + nombre);
		diagnostico.realizarDiagnostico();

		System.out.println("Su diagnostico es: " + diagnostico);
	}

}

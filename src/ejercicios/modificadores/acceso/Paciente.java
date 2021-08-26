package ejercicios.modificadores.acceso;

public class Paciente {

	public String nombre;
	public String apellido;
	private String diagnostico;
	private String cedula;
	private String medicacion;
	public int edad;

	public void obtenerTurno() {

	}

	private void obtenerClave() {

	}

	protected void realizarDiagnostico() {
		System.out.println("SU CONDICION ES ESTABLE SEÑOR");
	}
}

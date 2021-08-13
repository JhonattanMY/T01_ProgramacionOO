package trabajo.parejas;

public class Sistema1 {
	public void tomarTurnos(String nombre, String apellido, String cedula, int turno, String telefono) {
		System.out.println("Ha seleccionado el turno: " + turno);
		if (turno == 1) {
			System.out.println("Paciente: " + nombre + " " + apellido);
			System.out.println("Telefono paciente: " + telefono);
			System.out.println("Dr. Salvador Medina");
			System.out.println("Hora: 8:00am");

		} else if (turno == 2) {
			System.out.println("Paciente: " + nombre + " " + apellido);
			System.out.println("Telefono paciente: " + telefono);
			System.out.println("Dr. Candido Pérez");
			System.out.println("Hora: 2:00pm");

		} else if (turno == 3) {
			System.out.println("Turnos Agotados");

		} else if (turno > 3 || turno < 1) {
			System.out.println("Error, el turno que seleccionó no existe.");
		}
	}

	
	public void metodoPago(String metodoPago) {

		System.out.println("Metodo de pago: " + metodoPago);
	}

	public void tomarTurnos(String nombre, String apellido, String cedula, int z, int telefono) {
		
	}
}

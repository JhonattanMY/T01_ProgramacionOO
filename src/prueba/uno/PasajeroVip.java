package prueba.uno;

public class PasajeroVip extends Pasajero {

	private String codigoMenbresia;

	public PasajeroVip() {

	}

	public PasajeroVip(String nombre, String apellido, int edad, String codigoMembresia) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.codigoMenbresia = codigoMembresia;
	}

	// METODOS SET Y GET
	public String getCodigoMenbresia() {
		return codigoMenbresia;
	}

	public void setCodigoMenbresia(String codigoMenbresia) {
		this.codigoMenbresia = codigoMenbresia;
	}

	@Override
	public String toString() {
		return "Pasajero Vip [codigo Menbresia = " + codigoMenbresia + ", nombre = " + this.nombre + " " + this.apellido
				+ "]\n";
	}

}

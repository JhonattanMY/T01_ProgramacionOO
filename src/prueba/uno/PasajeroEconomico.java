package prueba.uno;

public class PasajeroEconomico extends Pasajero {

	private String codigoDeDescuento;

	public PasajeroEconomico() {

	}

	public PasajeroEconomico(String nombre, String apellido, int edad, String codigoDescuento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.codigoDeDescuento = codigoDescuento;
	}

	// METODOS SET Y GET
	public String getCodigoDeDescuento() {
		return codigoDeDescuento;
	}

	public void setCodigoDeDescuento(String codigoDeDescuento) {
		this.codigoDeDescuento = codigoDeDescuento;
	}

	@Override
	public String toString() {
		return "Pasajero Economico [codigo De Descuento = " + codigoDeDescuento + ", nombre = " + this.nombre + " "
				+ this.apellido + "]\n";
	}

}

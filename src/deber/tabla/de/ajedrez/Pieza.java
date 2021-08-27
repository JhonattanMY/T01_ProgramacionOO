package deber.tabla.de.ajedrez;

public abstract class Pieza {

	private String nombrePieza;
	private String color;

	public String getNombrePieza() {
		return nombrePieza;
	}

	public void setNombrePieza(String nombrePieza) {
		this.nombrePieza = nombrePieza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "[" + color + "]" ;
	}

}

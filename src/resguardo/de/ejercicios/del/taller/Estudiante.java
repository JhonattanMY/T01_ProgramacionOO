package resguardo.de.ejercicios.del.taller;

public class Estudiante implements Comparable<Estudiante> {

	private String nombre;
	private int numeroLista;

	// METODOS SET Y GET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroLista() {
		return numeroLista;
	}

	public void setNumeroLista(int numeroLista) {
		this.numeroLista = numeroLista;
	}

	@Override
	public int compareTo(Estudiante o) {

		// TIENE TRES POSIBLES RETORNOS: O, -1 y 1
		if (this.numeroLista > o.getNumeroLista()) {
			return 1;
		} else if (this.numeroLista == o.getNumeroLista()) {
			return 0;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", numeroLista=" + numeroLista + "]";
	}

}

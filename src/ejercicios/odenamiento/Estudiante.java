package ejercicios.odenamiento;

public class Estudiante implements Comparable<Estudiante> {

	private String nombre;
	private String apellido;
	private int edad;
	private int numeroLista;

	// METODOS SET Y GET
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
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
		if (this.edad > o.getEdad()) {
			return 1;
		} else if (this.edad == o.getEdad()) {
			return 0;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "\nEstudiante [nombre = " + nombre + " ---> apellido = " + apellido + " ---> edad = " + edad
				+ " ---> numeroLista = " + numeroLista + "]";
	}

}

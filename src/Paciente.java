
public class Paciente extends Persona {

	private String nombre; // ---> DEBE TENER CADA UNO DE LOS ATRIBUTOS METODO SET Y METODO GET
	private String apellido;
	private int edad;

	private void caminar() {

	}

	private void correr() {

	}
	// DECLARACION DE LOS METODOS SET Y GET
	// SET Y GET SON ESTANDARES DE LA P.O.O

	public void setNombre(String nombre) {// ---> SE DEBE PONER EN EL PARAMETRO EL MISMO NOMBRE DEL ATRIBUTO DECLARADO.
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;

	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEdad() {
		return this.edad;
	}
}

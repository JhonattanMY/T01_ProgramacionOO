package deberes.modificadores.de.acceso;

import java.util.Scanner;

public class HijaModificadorProtected extends ModificadorProtected {

	// ESTA ES LA CLASE PROFESOR

	// ATRIBUTO DE PROFESOR
	protected String titulos;
	Scanner lee = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner lee2 = new Scanner(System.in);

		ModificadorProtected primero = new ModificadorProtected();
		primero.nombre = lee2.next();
		ModificadorProtected segundo = new ModificadorProtected();
		segundo.apellido = lee2.next();
		;
		ModificadorProtected tercero = new ModificadorProtected();
		tercero.edad = lee2.nextInt();
		ModificadorProtected cuarto = new ModificadorProtected();
		cuarto.estadoCivil = lee2.next();

		ModificadorProtected trabajo = new ModificadorProtected();
		trabajo.trabajar("Maestro", 560);

		ModificadorProtected diversion = new ModificadorProtected();
		diversion.entretenimiento("Jugar futbol y videojuegos", "Japon y Corea");

	}

	void enseñar(String materiaClase, String horario) {

		System.out.println("Materia: ");
		materiaClase = lee.next();
		System.out.println("Horario: ");
		horario = lee.next();
	}

}

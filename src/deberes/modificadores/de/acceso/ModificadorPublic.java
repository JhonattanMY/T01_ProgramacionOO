package deberes.modificadores.de.acceso;

import java.util.Scanner;

public class ModificadorPublic {

	// ATRIBUTOS PUBLICOS

	public String nombreAnimal;
	public int edadAnimal;
	public String tipoAnimal;
	Scanner lee = new Scanner(System.in);

	// METODOS PUBLICOS

	public void alimentarse() {

		String comida = lee.nextLine();
	}

	public void correr() {

		String dias = lee.nextLine();

	}

}

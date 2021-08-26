package deberes.modificadores.de.acceso;

import java.util.Scanner;

public class MainModificadorDefault2 {

	public static void main(String[] args) {

		Scanner lee = new Scanner(System.in);

		ModificadorDefault2 validar = new ModificadorDefault2();
		System.out.println("Nombres: ");
		validar.nombres = lee.next();

		ModificadorDefault2 validar1 = new ModificadorDefault2();
		System.out.println("Apellidos: ");
		validar1.apellidos = lee.next();

		ModificadorDefault2 validar3 = new ModificadorDefault2();
		System.out.println("Cuenta e-email: ");
		validar3.cuentaTipoMail = lee.next();

		ModificadorDefault2 validar4 = new ModificadorDefault2();
		System.out.println("Fecha de cumpleaños: ");
		validar4.fechaCumpleanios = lee.next();

		ModificadorDefault2 validar5 = new ModificadorDefault2();
		System.out.println("Edad: ");
		validar5.edad = lee.nextInt();

		ModificadorDefault2 datos = new ModificadorDefault2();
		datos.validarDatos();
	}

}

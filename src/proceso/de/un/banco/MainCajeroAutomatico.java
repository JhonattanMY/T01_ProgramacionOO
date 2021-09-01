package proceso.de.un.banco;

import java.util.Scanner;

public class MainCajeroAutomatico {

	public static void main(String[] args) {

		int opcion;
		do {
			Scanner lee = new Scanner(System.in);

			System.out.println("***************************************************");
			System.out.println("***Banco del Pichincha seleccione una opcion***");
			System.out.println("1.  Retirar dinero");
			System.out.println("2.  Cambio de clave");
			System.out.println("3.  Bloquear cuenta");
			System.out.println("4.  SALIR");
			System.out.println("***************************************************");
			opcion = lee.nextInt();

			if (opcion == 1) {
				System.out.println("Ingrese valor a retirar: ");
				int retiro = lee.nextInt();
				System.out.println("El valor a retirar es: $" + retiro);
			} else if (opcion == 2) {
				System.out.println("Ingrese nueva clave: ");
				int clave = lee.nextInt();
				System.out.println("\n*** LA CLAVE A SIDO CAMBIADA ***");
			} else if (opcion == 3) {
				System.out.println("\n*** SU CUENTA A SIDO BLOQUEADA ***");
			} else if (opcion == 4) {
				System.out.println("\n-- [ GRACIAS POR PREFERIRNOS ] --");
			}

		} while (opcion != 4);

	}

}

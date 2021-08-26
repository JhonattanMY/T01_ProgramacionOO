package deberes.modificadores.de.acceso;

import java.util.Scanner;

public class ModificadorPrivate {
	// EJERCICIO TRATA DE EL MOMENTO DE UN DEPOSITO
	// SIENDO EL NUMERO DE CUENTA "1547964892".

	// ATRIBUTOS PRIVADOS.
	private static int numeroCuenta;
	private static int cantidadDineroCuenta = 1200;
	private String nombreDepositante = "Narcisa Yanacallo";
	static String nombreDuenioCuenta = "Egar Chicaiza";

	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);

		System.out.println("Ingrese valor a depositar:");
		int valorDeposito = lee.nextInt();

		// USO DE ATRIBUROS PRIVADOS EN UNA MISMA CLASE
		System.out.println("Ingrese numero de cuenta:");
		numeroCuenta = lee.nextInt();

		if (numeroCuenta == 1547964892) {
			String numeroCuentaEscondida = "1527******";
			System.out.println("\nNumero de cuenta: " + numeroCuentaEscondida);
			int suma = cantidadDineroCuenta + valorDeposito;
			System.out.println("Propietario Cuenta: " + nombreDuenioCuenta);
			System.out.println("Valor depositado: " + valorDeposito);

		} else {
			int suma = cantidadDineroCuenta + valorDeposito;
			System.out.println("\nValor depositado: " + valorDeposito);
		}
	}
}
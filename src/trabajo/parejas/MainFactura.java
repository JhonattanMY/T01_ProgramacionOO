package trabajo.parejas;

import java.util.Scanner;

public class MainFactura {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("SELECCIONE PODUCTOS ");
		System.out.println("1---> Pan");
		System.out.println("2---> Fideos");
		System.out.println("3---> Leche");
		System.out.println("0---> Salir ");
		int Z = teclado.nextInt();

		System.out.println("INGRESE METODO DE PAGO");
		String pago = teclado.nextLine();
//
//		Productos imprimir = new Productos();
//		imprimir.seleccion(Z);

		Productos imprimirMetodoPago = new Productos();
		imprimirMetodoPago.MetodoPago(pago);
	}

}
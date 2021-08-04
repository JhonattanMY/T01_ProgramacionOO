package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector1 {

	public MainVector1() {
		
	}

	public static void main(String[] args) {
		

		// Declare un vector X(3) de tipo char y construya un programa
		// que el usuario ingrese los valores para cada posicion.

		Scanner lee = new Scanner(System.in);

		char X[] = new char[3];

		for (int i = 0; i < 3; i++) {

			System.out.print("Ingrese una letra para la posicion " + i + ": ");
			char n = lee.next().charAt(0);
			X[i] = n;
		}
		System.out.println("\n******************************");

		// Impresion mas eficiente.
		for (int i = 0; i < 3; i++) {
			System.out.print("El valor de la posicion " + i + ": ");
			System.out.println(X[i]);
		}
		System.out.println("******************************");
	}
}

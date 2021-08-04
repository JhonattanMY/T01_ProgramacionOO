package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector2 {

	public MainVector2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

//		Declare un vector x()cuya longitud se solicite al usuario
//		y construya un program que pida al usario ingrese los valores
//		de cada posicion.

		Scanner lee = new Scanner(System.in);

		System.out.print("Ingrese la longitud del vector: ");
		int longitud = lee.nextInt();

		int X[] = new int[longitud];

		for (int i = 0; i < longitud; i++) {
			System.out.print("Ingrese una numero para la posicion " + i + ": ");
			int n = lee.nextInt();
			X[i] = n;
		}
		System.out.println("\n******************************");

		for (int i = 0; i < longitud; i++) {
			System.out.print("El valor de la posicion " + i + ": ");
			System.out.println(X[i]);
		}
		System.out.println("******************************");
	}
}
